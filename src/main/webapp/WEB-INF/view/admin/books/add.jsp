<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/inc/globalConfig.jsp"%>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/view/util/header.jsp"%>
<link href="${path }/css/common.css" type="text/css" rel="stylesheet">
<link href="${path }/css/login.css" type="text/css" rel="stylesheet" />
<script src="${path }/js/login.js" type="text/javascript"></script>
<script src="${path }/js/pngfix.js" type="text/javascript"></script>
<script src="${path }/js/jquery.md5.js" type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {
		$("#saveid").click("click", function(e) {
			var lid = $("#lid").val();
			var name = $("#nameid").val();
			var price = $("#login").val();
			var detil = $("#detilid").text();
			var typeno = $("#typeid").val();
			var author = $("#authorid").val();
			var press = $("#pressid").val();
			var duplicate = $("#duplicateid").val();

			//if(username==null ||username=="" || ud==""|| ud==null){
			//alert( "空");
			//nullid nullid
			// $("#nullid").css("display","block");
			return false;
			//}else{
			//$("#nullid").css("display","none");
			//}
			$.ajax({
				type : "POST",
				url : "/lms/books/add",
				cache : false, //将不会从浏览器缓存中加载请求信息。 
				data : {
					'type':1,
					'name' : name,
					'price' : price,
					'detil' : detil,
					'typeno' : type,
					'author' : author,
					'press' : press,
					'duplicate' : duplicate
				},
				dataType : 'json',
				success : function(data, statusText) {
					if (data.status == 0) {
						window.location.href = "/lms/books/index";
					} else {
						//$("#errid").css("display","block");
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("系统异常!");
				}
			});

		});
	});

	document.onkeyup = function(e) { //onkeyup是javascript的一个事件、当按下某个键弹起 var _key;                                                 //的时触发  
		if (e == null) { // ie  
			_key = event.keyCode;
		} else { // firefox              //获取你按下键的keyCode  
			_key = e.which; //每个键的keyCode是不一样的  
		}

		if (_key == 13) { //判断keyCode是否是13，也就是回车键(回车的keyCode是13)  
			//if (validator(document.loginform)){ //这个因该是调用了一个验证函数  
			$(".login-input").blur();
			document.getElementById('loginBtn').click(); //验证成功触发一个Id为btnLogin的  
			//}                                                                        //按钮的click事件，达到提交表单的目的  
		}
	};
</script>
<body>
	<div class="wrap">
		<!--header begin-->
		<div id="header">
			<div class="logo">
				<a href="javascript:void(0);" class="png-bg"></a>
			</div>
		</div>
		<!--header end-->
		<!---topBar begin-->
		<%@include file="/WEB-INF/view/admin/util/menu.jsp"%>
		<!---topBar end->
	<!--content begin-->
		<div class="content-wrap">
			<div id="content" class="clearfix">
				<!--column_l begin-->
				<%@include file="/WEB-INF/view/admin/books/book_menu.jsp"%>
				<!--column_l end-->
				<!--column_r begin-->
				<div class="column_r column_r1">
					<!--图书修改 begin-->
					<div class="newbook clearfix">
						<h2>新书入库</h2>
						<!--newbook form begin-->
						<form action="" method="">
							<div class="newbook-detail">
								<h3>图书基本信息</h3>
								<div class="newbook-item">
									<p class="clearfix">
										<span>图书编号：</span> <span><input readonly="readonly"
											class="input-txt input-txt1" id="lid" type="text" /></span>
									</p>
									<p class="clearfix">
										<span>图书名称：</span> <span><input
											class="input-txt input-txt1" id="id" id="nameid" type="text" /></span>
									</p>

									<p class="clearfix">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;定价：</span> <span><input
											class="input-txt input-txt1" id="id" id="priceid" type="text" /></span>
									</p>
									<p class="clearfix">
										<span id="detilid">&nbsp;&nbsp;&nbsp;&nbsp;备注：</span> <span><textarea></textarea></span>
									</p>

								</div>
								<div class="newbook-item">
									<p class="clearfix">
										<span>&nbsp;&nbsp;分类号：</span> <span><input
											class="input-txt input-txt1" id="typeid" type="text" /></span>
									</p>
									<p class="clearfix">
										<span>&nbsp;&nbsp;&nbsp;&nbsp;作者：</span><span> <input
											class="input-txt input-txt1" id="authorid" type="text" /></span>
									</p>
									<p class="clearfix">
										<span>&nbsp;&nbsp;出版社：</span> <span><input
											class="input-txt input-txt1" id="pressid" type="text" /></span>
									</p>
									<p class="clearfix">
										<span>&nbsp;&nbsp;复本量：</span> <span><input
											class="input-txt input-txt1" id="duplicateid" type="text" /></span>
									</p>

								</div>
							</div>
							<p class="save1">
								<input id="saveid" type="button" value="保存设置" class="btn btn1">
							</p>
						</form>
						<!--newbook form  end-->
					</div>
					<!--图书修改 end-->
				</div>
				<!--column_r end-->
			</div>
		</div>
		<!--content end-->
		<!--footer begin-->
		<%@include file="/WEB-INF/view/admin/util/foot.jsp"%>
		<!--footer end-->
		<!--topBar tips begin-->
		<%@include file="/WEB-INF/view/admin/util/topbar.jsp"%>
		<!--topBar tips end-->
	</div>
</body>
</html>

