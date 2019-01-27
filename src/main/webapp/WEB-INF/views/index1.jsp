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


<div id="ex1" class="modal">
    <div>
        <h2 class="text-primary text-center">Login Form</h2>
    </div>
    <br>
    <div>
    <input id="user" type="text" class="form-control" name="email" placeholder="UserName">
    </div>
    <br>
    <div>
    <input id="password" type="text" class="form-control" name="email" placeholder="Password">
    </div>
    <br>
    <div>
    <button type="Submit" id="login" class="form-control btn btn-danger">Submit</button>
    </div>
    <br>
    <br>
</div>




<nav class="navbar navbar-expand-sm bgbl">
    <ul class="navbar-nav ml-auto">
        <li class="nav-item">
            <p><a href="#ex1" rel="modal:open" class="bg-primary text-white btn btn-primary">Login</a></p>
        </li>
    </ul>
</nav>
<div class="jarallax bgbl text-dark text-center h-50 row">
    <h2 class="bgbl text-center w-100">Santhome</h2>
    <div class="my-flipster bgbl h-100">
        <ul class="w-50">
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/1.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/2.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/4.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/5.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
        </ul>
    </div>
</div>

<div class="jarallax h-75" style="background-image: url('/images/1.jpg');"></div>
<div class="jarallax bg-white text-dark text-center h-50 row">
    <h2 class="bg-white text-center w-100">Santhome</h2>
    <div class="my-flipster bg-white h-100">
        <ul class="w-50">
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/1.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 1"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/2.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 1"><img src="/images/3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/4.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 1"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/5.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
        </ul>
    </div>
</div>
<div class="jarallax h-75" style="background-image: url('/images/2.jpg');"></div>
<div class="jarallax bg-white text-dark text-center h-50 row">
    <h2 class="bg-white text-center w-100">Santhome</h2>
    <div class="my-flipster bg-white h-100">
        <ul class="w-50">
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/1.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/2.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/4.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/5.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
        </ul>
    </div>
</div>
<div class="jarallax h-75" style="background-image: url('/images/3.jpg');"></div>
<div class="jarallax bg-white text-dark text-center h-50 row">
    <h2 class="bg-white text-center w-100">Santhome</h2>
    <div class="my-flipster bg-white h-100">
        <ul class="w-50">
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/1.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/2.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/4.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/5.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
        </ul>
    </div>
</div>
<div class="jarallax h-75" style="background-image: url('/images/4.jpg');"></div>
<div class="jarallax bg-white text-dark text-center h-50 row">
    <h2 class="bg-white text-center w-100">Santhome</h2>
    <div class="my-flipster bg-white h-100">
        <ul class="w-50">
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/1.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/2.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/images1.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/4.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
            <li data-flip-title="Item 1 Title" data-flip-category="Category 1"><img src="/images/5.jpg"></li>
            <li data-flip-title="Item 2 Title" data-flip-category="Category 1"><img src="/images/image2.jpg"></li>
            <li data-flip-title="Item 3 Title" data-flip-category="Category 2"><img src="/images/image3.jpg"></li>
        </ul>
    </div>
</div>
<div class="jarallax h-100" style="background-image: url('/images/5.jpg');"></div>
<div class="jarallax h-25 bgbl"><h1 class="text-white">END OF THE STORY</h1></div>
</body>
</html>
