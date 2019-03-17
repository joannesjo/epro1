<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring MVC Form Handling</title>
</head>
<body>
    <h2>Create New Category</h2>
    <form:form modelAttribute="category" method="post" action="saveCategory">
        <table>
            <tr>
                <td><form:label path="categoryId">Category ID:</form:label></td>
                <td><form:input path="categoryId" readonly="true"/></td>
            </tr>
            <tr>
                <td><form:label path="categoryName">Category Name:</form:label></td>
                <td><form:input path="categoryName"/></td>
            </tr>
            <tr>
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="SAVE"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>