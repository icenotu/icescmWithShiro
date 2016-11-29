<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentallela Alela! | </title>

    <!-- Bootstrap -->
    <link href="${proPath}/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${proPath}/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${proPath}/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <!-- page content -->
        <div class="col-md-12">
            <div class="col-middle">
                <div class="text-center text-center">
                    <h1 class="error-number">403</h1>
                    <h2>拒绝访问</h2>
                    <p>对不起您无权访问此页面，请与管理员联系！</p>
                </div>
            </div>
        </div>
        <!-- /page content -->
    </div>
</div>

<!-- jQuery -->
<script src="${proPath}/vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${proPath}/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="${proPath}/vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="${proPath}/vendors/nprogress/nprogress.js"></script>

<!-- Custom Theme Scripts -->
<script src="${proPath}/build/js/custom.min.js"></script>
</body>
<%--<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>拒绝访问</title>
</head>
<style type="text/css">
    .align-center{
        position:fixed;
        left:50%;
        top:50%;
    }
</style>
<body>
<div class="align-center"><h3>对不起您无权访问此页面，请与管理员联系！</h3></div>

</body>--%>
</html>