$(function() {
	$('#logins').click(function() {
		var uname =  $('#uname').val().trim().length;
		var pas = $('#pas').val().trim().length;
		if(uname==0||pas==0){
			layer.msg('请填写密码或账号!', {icon: 5,time: 1500});
		}else{
		$.ajax({
			 url : "/SSM_CMS/login.do",
	         type : "post",
	         data:{
	        	 "users" : $('#uname').val().trim(),
	             "password" :  $('#pas').val().trim()
	         },
	         dataType: "json",
	         success : function (m) {
	        	console.log(m)
	        	 if(m.state==1){
	        		 location.href="./html/index.html"
	        	 }else{
	        		 $('#uname').val(""); $('#pas').val("");
	        		 layer.msg('登陆失败...', {icon: 5,time: 800});
	        	 }
	            
	         }
		});
		}
		
	});
});