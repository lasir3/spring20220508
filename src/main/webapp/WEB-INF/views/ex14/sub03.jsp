<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		${param.id }번 고객의 이름은 ${customer.name }이고, 
	<br />
		주소는 ${customer.address} 입니다. 
	</h1>
	
	<h1>
	도시 : ${customer.city }
	</h1>
	<h1>
	나라 : ${customer.country }
	</h1>
</body>
</html>