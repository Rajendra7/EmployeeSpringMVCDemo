<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style type="text/css">
	.error{
	color:red
	}
</style>

<body>

<spring:form action="save" method="post" modelAttribute="employee">
	Employee ID: <spring:input path="empId"/><spring:errors path="empId" cssClass="error"/><br/>
	Full Name : <spring:input path="empName"/><spring:errors path="empName" cssClass="error"/><br/><br/>
	Salary :  <spring:input path="salary"/><spring:errors path="salary" cssClass="error"/><br/><br/>
	<input type="submit" value="submit"/><br/>
</spring:form>

</body>
</html>