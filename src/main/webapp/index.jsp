<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Servlet</title>
	</head>
	<body>
	
		<h1 style="text-align: center;">투데이 이즈 프라이데이 렛츠고 빵흔</h1>
		<a href="">Calculator</a>
		<form action="calc">
			<select name="key">
				<option value="add">덧셈</option>
				<option value="subtract">뺄셈</option>
				<option value="multiply">곱셈</option>
				<option value="divide">나눗셈</option>			
			</select>
			<input type="number" name="a" placeholder="첫번째 숫자를 입력하세요.">
			<input type="number" name="b" placeholder="두번째 숫자를 입력하세요.">
			<input type="submit" value="계산">
		</form>
	</body>
</html>
