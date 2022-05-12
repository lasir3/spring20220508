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
		First Name : <input type="text" name="firstName" value="donald"/> <br />
		Last Name : <input type="text" name="lastName" value="trump"/> <br />
		BirthDate : <input type="date" name="birthDate" value="1990-12-12"/> <br />
		Photo : <input type="text" name="photo" value="EmpID.pic"/> <br />
		Notes : <textarea name="notes"  id="" cols="30" rows="10">President of The United State of the America</textarea> <br />
		<button>등록</button>
	</form>
	
</body>
</html>