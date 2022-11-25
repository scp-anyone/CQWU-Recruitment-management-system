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
	<%@ include file="${webroot}/includes/header.jsp"%>
	<div id="content">
		<div id="left">
			<h1>提示</h1>
			<!-- 左侧提示部分-->
		</div>
		<div id="right">
			<h1>${title}</h1>
			<!-- 右侧功能区 -->


			<!-- 已添加管理员列表在管理员维护页面中对应的代码如下所示 -->
			<div class="operation">
				已添加的管理员列表↓： <span class="mess">${manageMess}</span>
			</div>
			<table class="dt" border="0" cellspacing="1">
				<tr>
					<th>序号</th>
					<th>管理员用户名</th>
					<th>管理员用户组</th>
					<th>管理员密码清零</th>
					<th>删除管理员</th>
				</tr>
				<c:forEach items="${adminusers}" var="adminuser" varStatus="rows">
					<tr>
						<td>${rows.count}</td>
						<td>${adminuser.adminname}</td>
						<td>${adminuser.admingroup}</td>
						<td><a
							href="${webroot}/sadmin/manage.do?action=passReset&adminname 
=${adminuser.adminname}">密码清零</a></td>
						<td><a
							href="${webroot}/sadmin/manage.do?action=deleteByAdminname& 
adminname=${adminuser.adminname}">删除</a></td>
					</tr>
				</c:forEach>
			</table>

			<!-- 添加新的管理员用户表单在管理员维护页面中对应的主要代码如下所示。 -->
			<div class="ft">
				<form method="post" action="${webroot}/sadmin/manage.do?action=add">
					<table>
						<tr>
							<td class="label">用户名：</td>
							<td><input type="text" name="adminname" id="adminname"
								value="${requestScope.newadmin.adminname}" /></td>
							<td class="hint">*用户名为英文字母、下划线或数字组合，长度为6-20位</td>
						</tr>
						<tr>
							<td class="label">用户组：</td>
							<td><select name="admingroup">
									<option value="招生管理员" selected="selected">招生管理员</option>
									<option value="教务管理员">教务管理员</option>
							</select></td>
							<td class="hint">* 用户组为'招生管理员' 或 '教务管理员'</td>
						</tr>
						<tr>
							<td class="label">初始密码：</td>
							<td><input type="text" name="adminpass" id="adminpass"
								value="${requestScope.newadmin.adminpass}" /></td>
							<td class="hint">*初始密码为英文字母、下划线或数字组合，长度为6-20位</td>
						</tr>
						<tr>
			</div>


			<div class="clearf"></div>
		</div>
		<%@ include file="./includes/footer.jsp"%>
</body>
</html>
