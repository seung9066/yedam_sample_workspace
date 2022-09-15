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
</style>
</head>
<body>
	<div align="center">
		<div>
			<h1>멤버 가입</h1>
		</div>
		<div>
			<form id="frm" action="memberInsert.do" onsubmit="return formCheck()"
				method="post">
				<div>
					<table border=1>
						<tr>
							<th>아이디</th>
							<td><input type="text" id="memberId" name="memberId"
								required="required">
								<button type="button" id="btn" value="No" onclick="idCheck()">중복체크</button>
							</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><input type="password" id="memberPassword"
								name="memberPassword" required="required"></td>
						</tr>
						<tr>
							<th>비밀번호 확인</th>
							<td><input type="password" id="pwc" required="required"></td>
						</tr>
						<tr>
							<th>이름</th>
							<td><input type="text" id="memberName" name="memberName"
								required="required"></td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td><input type="tel" id="memberTel" name="memberTel"></td>
						</tr>
					</table>
				</div>
				<br>
				<div>
					<input type="hidden" name="memberAuthor" value="USER"> <input
						type="submit" value="등록">&nbsp;&nbsp; <input type="reset"
						value="취소">&nbsp;&nbsp; <input type="button" value="목록"
						onclick="location.href='memberSelectList.do'">
				</div>
			</form>
		</div>
	</div>
	<script>
		function formCheck() {
			let pw1 = document.getElementById('memberPassword').value;
			let pw2 = document.getElementById('pwc').value;

			let idChecked = document.getElementById('btn').value;
			if (idChecked == 'No') {
				alert('아이디 중복체크를 해주세요');
				return false;
			}
			if (pw1 != pw2) {
				alert("패스워드 불일치");
				document.getElementById('memberPassword').value = "";
				document.getElementById('pwc').value = "";
				document.getElementById('memberPassword').focus();
				return false;
			}
			return true;
		}

		function idCheck() { // Ajax를 이용해 id 중복체크하기
			let id = document.getElementById('memberId').value;

			const xhttp = new XMLHttpRequest();
			xhttp.onload = function() {
				if (this.readyState == 4 && this.status == 200) {
					if (this.request == "1") {
						document.getElementById('btn').value = 'Yes';
						document.getElementById('memberPassword').focus();
					} else {
						alert('사용할 수 없는 아이디');
						document.getElementById('memberId').value = "";
					}
				}
			}
			xhttp.open("GET", "ajaxMemberIdCheck.do?id=" + id);
			xhttp.send();

		}
	</script>
</body>
</html>