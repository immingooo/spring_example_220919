<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
<!-- 제이쿼리 원본, 부트스트랩 -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<!-- User클래스에 있는 필드명으로 뽑아내기 -->
	<div class="container">
		<h1>${title}</h1>
		<table class="table table-striped">
			<tr>
				<th>번호</th>
				<td>${seller.id}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${seller.name}</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>${seller.yyyymmdd}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${seller.email}</td>
			</tr>
			<tr>
				<th>자기소개</th>
				<td>${seller.introduce}</td>
			</tr>
			<tr>
				<th>생성일</th>
				<td>${seller.createdAt}</td>
			</tr>
			<tr>
				<th>수정일</th>
				<td>${seller.updatedAt}</td>
			</tr>
		</table>
	</div>
</body>
</html>