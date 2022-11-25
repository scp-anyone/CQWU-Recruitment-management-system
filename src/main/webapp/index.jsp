<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="title" value="新用户注册" />
<c:set var="webroot" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link rel="stylesheet" type="text/css"
	href="${webroot}/styles/basic.css" />
<script type="text/javascript" src="${webroot}/js/register.js"></script>
</head>
<body>
	<%@ include file="./includes/header.jsp"%>
	<div id="content">
		<div id="left">
			<h1>提示</h1>
			<!-- 左侧提示部分-->
			<div id="left">
				<h1>提示</h1>
				<div class="ft" style="border: none;">
					<table>
						<tr>
							<td>1、请牢记您注册时填写的用户名和密码，登录本系统时您需要提供正确的用户名和密码！</td>
						</tr>
						<tr>
							<td>2、忘记用户名或者密码请联系招生单位！</td>
						</tr>
					</table>
				</div>
			</div>

		</div>
		<div id="right">
			<h1>${title}</h1>
			<!-- 右侧功能区 -->
			<div id="right">
				<h1>${title}</h1>
				<div class="operation">
					验证登录信息↓： <span class="mess" id="stuLoginMess">${requestScope.stuLoginMess}</span>
				</div>
				<div class="ft">
					<form method="post" action="${webroot}/login.do">
						<table>
							<tr>
								<td class="label">用户名：</td>
								<td colspan="2"><input type="text" name="username"
									id="username" value="${ requestScope.username }" /></td>
								<td class="hint">*</td>
							</tr>
							<tr>
								<td class="label">密码：</td>
								<td colspan="2"><input type="password" name="password"
									id="password" value="${ requestScope.password }" /></td>
								<td class="hint">*</td>
							</tr>
							<tr>
								<td class="label">验证码：</td>
								<td><input style="width: 65px;" type="text" name="code"
									id="code" value="${ requestScope.code }" /></td>
								<td><img src="${webroot}/includes/code.jsp" id="imagecode"
									title="点击图片可更换" onclick="this.src+=‘?tm=’+ Math.random();" /></td>
								<td class="hint">*</td>
							</tr>
							<tr>
								<td colspan="3"><input type="submit" value="登录系统"
									class="button" id="submit" /> 28 <input type="reset"
									value="重
									置" class="button" id="reset" /> 29</td>
								<td class="hint">* 还没有账号，<a href="${webroot}/register.jsp">点此注册</a></td>
							</tr>
						</table>
					</form>
				</div>
			</div>

			<div class="clearf"></div>
		</div>
	</div>
	<%@ include file="./includes/footer.jsp"%>
</body>
</html>
