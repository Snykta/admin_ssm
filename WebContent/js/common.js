//注意进度条依赖 element 模块，否则无法进行正常渲染和功能性操作
layui.use(['element','form','laypage','laydate','layedit','upload','laytpl'], function(){
    var element = layui.element;
    var laytpl = layui.laytpl;
    var upload = layui.upload;
    var form = layui.form;
    var laydate = layui.laydate;
    var laypage = layui.laypage;
    var data = {
        "list":[
                {"name":"系统主页","icon":"layui-icon-home","url":"../html/index.html"},
                {"name":"文章管理","icon":"layui-icon-list","url":"../html/news.html"},
                {"name":"添加文章","icon":"layui-icon-template-1","url":"../html/news_add.html"},
                {"name":"友情链接","icon":"layui-icon-link","url":"../html/link.html"},
                {"name":"添加链接","icon":"layui-icon-component","url":"../html/link_add.html"},
                {"name":"资源下载","icon":"layui-icon-chart","url":"../html/data_backout.html"},
                {"name":"人员管理","icon":"layui-icon-friends","url":"../html/users.html"},
                {"name":"添加人员","icon":"layui-icon-add-1","url":"../html/users_add.html"},
                {"name":"添加分组","icon":"layui-icon-user","url":"../html/dept_add.html"},
                {"name":"分组管理","icon":"layui-icon-user","url":"../html/dept.html"},
                {"name":"后台管理员","icon":"layui-icon-username","url":"../html/AdminUserListt.html"},
            ]
    };
    
    var getTpl = side.innerHTML
        ,view = document.getElementById('leftside');
        laytpl(getTpl).render(data, function(html){
            view.innerHTML = html;
        });
    //执行实例
        var str = "";
        var uploadadd = upload.render({
        
        elem: '#newadd' //绑定元素
        ,url: '/SSM_CMS/updateImgs.do' //上传接口
        ,done: function(res){
        	if(res["state"]==1){
        		layer.msg('上传成功');
        		$('#ds').children().remove();
        		var imgs = res['names'];
        		 str += "<img  value='9999' src='http://localhost:8080/test/"+imgs+"' class='layui-nav-img '/>"
        		 str +="<input type='text' style='display:none' value='"+imgs+"'  name='imgs'/>"
        		$('#ds').append(str)
        	}else{
        		layer.msg('上传失败', {icon: 5,time: 800});
        	}
        }
    	,field: "imgsg"
    	,size :1024
        ,error: function(){
        	alert("失败")
        }
    });
 
        
    $('#user_name').html(eval("(" + $.cookie('admin_user') + ")")['users']);
    
    //添加分类
$("#addclass").click(function () {
        layer.open({
            title: '添加分类'
            ,type: 1
            ,content:$('#addclassform')
        });
        return false;
    });
    
    
    
 $(".userhead").click(function () {
        var imgpath = $(this).attr('src');
        layer.open({
            type: 1,
            shade:false,
            title: false, //不显示标题
            content: "<img src='"+ imgpath +"' width='100%'>"
        });
    });
});