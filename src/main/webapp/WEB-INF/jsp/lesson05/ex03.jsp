<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
</head>
<body>
	<c:set var="number" value="12345678" />
	<h1>숫자 출력</h1>
	<fmt:formatNumber value="${number}" /> <%-- type="number"이 기본설정 groupingUsed="true"도 기본설정--%>
	
	<h1>Type</h1>
	숫자: <fmt:formatNumber value="${number}" type="number" /><br>
	숫자 3자리마다 쉼표 제거: <fmt:formatNumber value="${number}" type="number" groupingUsed="false" /><br>
	
	<%-- percent는 1이 100% --%>
	100%: <fmt:formatNumber value="1" type="percent" /><br> <%-- type은 0~1 --%>
	40%: <fmt:formatNumber value="0.4" type="percent" /><br>
	
	통화(원): <fmt:formatNumber value="${number}" type="currency" /><br>
	통화(달러): <fmt:formatNumber value="${number}" type="currency" currencySymbol="$" /><br>
	
	<h1>var로 변수에 저장</h1> <%-- 변수에 담아놨다가 원할 때 출력 --%>
	<fmt:formatNumber var="doller" value="${number}" type="currency" currencySymbol="$" />
	달러를 EL로 출력: ${doller}
	
	<h1>Pattern</h1>
	3.14: <fmt:formatNumber value="3.14" /><br>
	3.14(0.0000): <fmt:formatNumber value="3.14" pattern="0.0000" /><br>
	3.14(#.####): <fmt:formatNumber value="3.14" pattern="#.####" /><br> <%-- 있는 숫자만 나오고 0은 생략 --%>
	3.141592(#.####): <fmt:formatNumber value="3.141592" pattern="#.####" /><br> <%-- 자리수만큼 나타남 --%>
	
	<hr>
	
	<h1>Date 객체를 String 형태로 출력 => fmt:formatDate</h1>
	<%-- ${today}로 출력하면 기본형태(KST)로 나옴 --%>
	<fmt:formatDate var="pattern1" value="${today}" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" />
	pattern1: ${pattern1}<br>
	<fmt:formatDate var="pattern2" value="${today}" pattern="yyyy/MM/dd HH:mm:ss" />
	pattern2: ${pattern2}<br>
	
	<h1>String을 Date 객체로 변환 => fmt:parseDate</h1>
	<fmt:parseDate value="${pattern2}" pattern="yyyy/MM/dd HH:mm:ss" var="date2" />
	Date 객체: ${date2}
</body>
</html>