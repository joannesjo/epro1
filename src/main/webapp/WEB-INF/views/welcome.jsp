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
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="/js/welcome.js"></script>
    <link href="/css/welcome.css" rel="stylesheet">


    <title>Title</title>
</head>
<body>
<img src="../../resources/static/images/download.jpg" alt="Smiley face" height="194" width="260" >
<img src="<%=request.getContextPath()%>/images/download.jpg" />
<img src="download.jpg" alt="Smiley face" height="194" width="260" >
<img src="../../WEB-INF/views/images/download.jpg">
<button class="h70w70">Bootstrap test</button>
</body>
</html>
