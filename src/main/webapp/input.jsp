<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	** 자료 입력 **<p/>
	<form action="sangpum" method="post">
		품 명 : <input type="text" name="sang"><br>
		수 량 : <input type="text" name="su"><br>
		단 가 : <input type="text" name="dan"><br>
		<input type="submit" value="전송(post)">
	</form>
</body>
</html>