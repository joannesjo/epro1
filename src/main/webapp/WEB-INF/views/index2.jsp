<%--
  Created by IntelliJ IDEA.
  User: Joannes.Paul
  Date: 22-11-2018
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="webjars/popper.js/1.12.9-1/umd/popper.js"></script>
    <script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="/js/welcome.js"></script>
    <link href="/css/welcome.css" rel="stylesheet">
    <script src="/js/jquery.flipster.min.js"></script>
    <link href="/css/jquery.flipster.min.css" rel="stylesheet">
    <script src="/js/jarallax.js"></script>
    <link href="/css/jarallax.css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

    <title>Title</title>
</head>
<body class="bg-white">
<%--CREATE PROFILE MODAL--%>
<jsp:include page="createprofile.jsp" />
<%--HORIZONTAL NAVBAR--%>
<jsp:include page="navigation.jsp" />
<%--IMAGE FLIPSTER--%>
<jsp:include page="flipsterimage.jsp" />
<div class="pl-lg-5 row w-100">
    <%--LEFT SIDE--%>
    <div class="p-lg-5 col-lg-6 border-left border-danger w-100">
        <%--PERSONAL INFORMATION--%>
            <jsp:include page="persinfo.jsp" />
        <%--EDUCATION DETAILS--%>
            <jsp:include page="eduinfo.jsp" />
        <%--SOCIAL BACKGROUND--%>
            <jsp:include page="socinfo.jsp" />
        <%--FAMILY DETAILS--%>
            <jsp:include page="faminfo.jsp" />
    </div>
        <%--RIGHT SIDE--%>
    <div class="col-lg-6 p-lg-5  border-right border-danger w-100">
        <%--PARTNER PREFERENCE--%>
        <jsp:include page="partinfo.jsp" />
    </div>
</div>
</body>
</html>
