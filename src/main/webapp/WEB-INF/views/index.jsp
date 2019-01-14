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
    <script src="/js/welcome.js"></script>
    <link href="/css/welcome.css" rel="stylesheet">
    <script src="/js/imagelightbox.js"></script>
    <link href="/css/imagelightbox.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

    <title>Title</title>
</head>
<body>

<a href="1.jpg" data-imagelightbox="demo">
    <img src="/images/image3.jpg">
</a>

<a href="2.jpg" data-imagelightbox="demo">
    <img src="/images/image2.jpg">
</a>

<a href="3.jpg" data-imagelightbox="demo">
    <img src="/images/images1.jpg">
</a>

...
<%--<div id="demo" class="carousel slide bg-light" data-ride="carousel">
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
    </ul>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="/images/image3.jpg" alt="Los Angeles" width="1100" height="500">
            <div class="carousel-caption">
                <h3>Los Angeles</h3>
                <p>We had such a great time in LA!</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="/images/image2.jpg" alt="Chicago">
            <div class="carousel-caption">
            </div>
        </div>
        <div class="carousel-item">
            <img src="/images/images1.jpg" alt="New York" width="1100" height="500">
            <div class="carousel-caption">
                <h3>New York</h3>
                <p>We love the Big Apple!</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="/images/1.jpg" alt="New York" width="1100" height="500">
            <div class="carousel-caption">
                <h3>New York</h3>
                <p>We love the Big Apple!</p>
            </div>
        </div>
    </div>
    <a class="carousel-control-prev" href="#demo" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#demo" data-slide="next">
        <span class="carousel-control-next-icon"></span>
    </a>
</div>--%>
<nav class="navbar navbar-expand-sm bg-dark">
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link text-white" href="#">Link 1</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="#">Link 2</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="#">Link 3</a>
        </li>
    </ul>
</nav>
<div class="row">

    <div class="p-lg-5 col h-50">

       <div class="card bg-danger">
        <div class="row w-100">
            <h5 class="col-lg-5 text-white">Personal Information</h5>
            <span class="col-sm-1"></span>
            <span class="col-lg-4"></span>
            <span class="col-sm-1"><i class="fa fa-edit fa-2x text-white pl-lg-5"></i></span>
        </div>
        <div class="card border w-100 h-100">
           <div class="row w-100 pl-lg-2">
               <span class="col-sm-1"></span>
               <span class="col-lg-3">Name</span>
               <span class="col-sm-1">:</span>
               <span class="col-lg-4">hhddddhh</span>
           </div>
        </div>
       </div>

    </div>
    <div class="col p-lg-5">
        <div class="card bg-primary">
            <div class="row w-100">
                <h5 class="col-sm-5 text-white">Partner Preference</h5>
                <span class="col-sm-2"></span>
                <span class="col-sm-2"></span>
                <span class="col-sm-2"><i class="fa fa-edit fa-2x text-white pl-lg-5"></i></span>
            </div>
            <div class="card border w-100 h-100">
                <div class="row w-100">
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2">hhddddhh:</span>
                    <span class="col float-left">hhddddhh</span>
                </div>
                <div class="row w-100">
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2">hhddddhh:</span>
                    <span class="col float-left">hhddddhh</span>
                </div>
                <div class="row w-100">
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2"></span>
                    <span class="col-sm-2">hhddddhh:</span>
                    <span class="col float-left">hhddddhh</span>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
