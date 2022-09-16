<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
th {
	width: 150px;
}

td {
	width: 200px;
	text-align: center;
}
</style>
</head>
<body>
	<div align="center">
		<div>
			<form id="frm" method="post">
				<table border=1>
					<tr>
						<th>아이디</th>
						<td><input type="text" id="memberId" name="memberId"
							value="${member.memberId }" readonly="readonly"></td>
					</tr>
					<tr>
						<th>패스워드</th>
						<td><input type="password" id="memberPassWord"
							name="memberPassWord" value="${member.memberPassWord }" readonly="readonly"></td>
					</tr>
					<tr>
						<th>이름</th>
						<td><input type="text" id="memberName" name="memberName"
							value="${member.memberName }"></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td><input type="tel" id="memberTel" name="memberTel"
							value="${member.memberTel }"></td>
					</tr>
					<tr>
						<th>권한</th>
						<td><input type="text" id="memberAuthor" name="memberAuthor"
							value="${member.memberAuthor }"></td>
					</tr>
				</table>
				<br>


				<button onclick="actionForm('E')">수정</button>
				&nbsp;&nbsp;
				<button onclick="actionForm('D')">삭제</button>
				&nbsp;&nbsp;
				<button onclick="actionForm('L')">목록</button>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		function actionForm(str) {
			switch (str) {
			case 'E':
				frm.action = "memberEdit.do";
				frm.submit();
				break;
			case 'D':
				frm.action = "memberDelete.do";
				frm.submit();
				break;
			case 'L':
				frm.action = "memberSelectList.do";
				frm.submit();
				break;
			}
		}
	</script>
</body>

</html>