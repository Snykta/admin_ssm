$(function() {
	$('#reg').click(function() {
		var users =  $('#users').val().trim().length;
		var names = $('#names').val().trim().length;
		var pas = $('#pas').val().trim().length;
		var email = $('#email').val().trim().length;
		var keys = $('#keys').val().trim().length;
		if(users==0||names==0||pas==0||email==0||keys==0){
			layer.msg('请填写完整信息!', {icon: 5,time: 1500});
		}else{
		$.ajax({
			 url : "/SSM_CMS/registerUser.do",
	         type : "post",
	         data:{
	        	 "users" : $('#users').val().trim(),
	             "names" :  $('#names').val().trim(),
	             "password" :  $('#pas').val().trim(),
	             "email" :  $('#email').val().trim(),
	             "result" :  $('#keys').val().trim()
	         },
	         success : function (m) {
	        	 var arry = JSON.parse(m);
	        	 console.log(arry);
	        	 if(arry.state==0){
	        		 layer.msg('验证码输入错误', {icon: 5,time: 1000});
	        		 $('#keys').val("");
	        		 $('#imgs').click();
	        	 }else if(arry.state==1){
	        		 layer.msg('注册成功!', {icon: 6,time: 800});
	        		 setTimeout("location.href='login.html'",1000);
	        	 }else{
	        		 layer.msg('注册失败', {icon: 5,time: 800});
	        		 setTimeout("location.href='register.html'",900);
	        	 }
	            
	         }
		});
		}
		
	});
});