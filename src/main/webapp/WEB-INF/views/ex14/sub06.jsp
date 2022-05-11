<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message }</h1>
	
	<h1>직원 등록</h1>
	<form action="${pageContext.request.contextPath }/ex14/sub06" method="post">
		<input type="text" name="firstName" value="donald"/> <br />
		<input type="text" name="lastName" value="trump"/> <br />
		<input type="date" name="birthDate" value="1990-12-12"/> <br />
		<input type="text" name="photo" value="EmpID.pic"/> <br />
		<input type="text" name="notes" value="President of The United State of the America"/> <br />
		<button>등록</button>
	</form>
	
</body>
</html>