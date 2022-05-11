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

	<h1>새 고객 입력</h1>
	<form action="${pageContext.request.contextPath }/ex14/sub05" method="post">
		고객명 : <input type="text" name="customerName" value="Son H.M."/> <br />
		계약명 : <input type="text" name="contactName" value="Striker"/> <br />
		주소 : <input type="text" name="address" value="seoul gangnam" /> <br />
		도시 : <input type="text" name="city" value="London" /> <br />
		나라 : <input type="text" name="country" value="UK" /> <br />
		우편번호 : <input type="text" name="postalCode" value="1234"/> <br />
		<button>등록</button>
		
	</form>
</body>
</html>