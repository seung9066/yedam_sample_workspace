<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : ${member.memberId }<br>
이름 : ${member.memberName }<br>
전화번호 : ${member.memberTel }<br>
권한 : ${member.memberAuthor }<br>
<button onclick="location.href='/20220914/MemberList'">뒤로</button>
</body>
</html>