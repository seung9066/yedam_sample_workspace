<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th {
	width: 150px;
	background-color: lightgray;
}

</style>
</head>
<body>
	<div align="center">
		<div>
			<h1>멤버전체목록</h1>
		</div>
		<table border=1>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>권한</th>
			</tr>
			<div>
				<c:forEach items="${members }" var="m">
					<!-- vo 객체 이름으로 가져옴 -->
					<tr onMouseover="this.style.backgroundColor='yellow'"
						onMouseout="this.style.backgroundColor='white'"
						onclick="memberSelect('${m.memberId }')">
						<td>${m.memberId }</td>
						<td>${m.memberName }</td>
						<td>${m.memberTel }</td>
						<td>${m.memberAuthor }</td>
					</tr>
				</c:forEach>
			</div>
		</table>
		<br> <br>
		<div>
			<form id="frm" action="MemberSelect" method="post">
				<input type="hidden" id="id" name="id">
			</form>
		</div>
		<script>
			function memberSelect(id) {
				frm.id.value = id;
				frm.action = "memberSelect.do";
				frm.submit();
			}
		</script>
		<div>
			<button onclick="location.href='memberJoinForm.do'">멤버추가</button>
			<button onclick="location.href='main.do'">홈</button>
		</div>
	</div>
</body>
</html>