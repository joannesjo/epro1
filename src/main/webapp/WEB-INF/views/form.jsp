<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%--
  Created by IntelliJ IDEA.
  User: joannes
  Date: 16-03-2019
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form:form method="post" modelAttribute="employee" action="testvalid">
    <label>Name</label>
    <form:input path="empName" type="text" id="empName" />
    <form:errors path="empName" />
    <label>Street</label>
    <form:input path="employeeAddress.street" type="text" id="employeeAddress.street" />
    <form:errors path="employeeAddress.street" />
    <form:button type="submit">Submit</form:button>
</form:form>
</body>
</html>