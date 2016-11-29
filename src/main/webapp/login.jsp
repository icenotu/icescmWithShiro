<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <c:set var="proPath" value="${pageContext.request.contextPath}" />
    <title>**公司管理系统 | </title>

    <!-- jQuery -->
    <script src="${proPath}/vendors/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap -->
    <link href="${proPath}/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${proPath}/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${proPath}/build/css/custom.min.css" rel="stylesheet">

    <link href="${proPath}/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <link href="${proPath}/vendors/google-code-prettify/bin/prettify.min.css" rel="stylesheet">
    <link href="${proPath}/vendors/select2/dist/css/select2.min.css" rel="stylesheet">
    <link href="${proPath}/vendors/switchery/dist/switchery.min.css" rel="stylesheet">
    <link href="${proPath}/vendors/starrr/dist/starrr.css" rel="stylesheet">
    <style>
      .login_content h1 p {
        text-align: center;
      }
      .login_content .iBtn {
        text-align: center;
      }
      #randomcode {
        width: 65%;
        display: inline;
        margin-bottom: 10px;
      }
      #randomCode_img {
        border-radius: 3px;
        margin-top: -2px
      }
      .login_content a {
        margin-right: 0px; font-size: 16px
      }
      .login_content .checkbox {
        text-align: left;
        /*margin-left: 75px;*/
      }
    </style>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form method="post" action="${proPath}/sysUser/login.form">
              <h1>登 录</h1>
              <div class="alert alert-danger" id="errorInfo">
                ${error}
              </div>
              <div>
                <input type="text" class="form-control" placeholder="用户名" required="" name="username"/>
              </div>
              <div>
                <input type="password" class="form-control" placeholder="密码" required="" name="password"/>
              </div>
              <div>
                <input type="text" id="randomcode" name="randomcode" class="form-control" placeholder="验证码" style="width: 65%;display: inline;"/> <img
                      id="randomCode_img" src="${proPath}/jsp/validatecode.jsp?s=s" alt=""
                      width="23%" height="35" align='absMiddle' style="border-radius: 3px;margin-top: -2px"/>
                <a href=javascript:refreshRandomCode() style="margin-right: 0px; font-size: 16px">刷新</a>
              </div>

                <div class="checkbox">
                  <label style="padding-left: 0px">
                    <input type="checkbox" class="flat" checked="checked" name="rememberMe" style="text-align: left;"> 记住我
                  </label>
                </div>

              <div class="iBtn">
                  <input class="btn btn-default submit" type="reset" value="重 置">
                  <input class="btn btn-default submit" type="submit" value="登 录" style="margin-left: 75px">

                <%--<a class="btn btn-default submit" href="${proPath}/account/login.form">Log in</a>--%>
                <%--<a class="reset_pass" href="#">Lost your password?</a>--%>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <%--<p class="change_link">New to site?
                  <a href="#signup" class="to_register"> Create Account </a>
                </p>--%>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> **公司管理系统</h1>
                  <p>©2016 All Rights Reserved. 此系统由 <a href="https://icenotu.com">Icenotu</a>设计</p>
                </div>
              </div>
            </form>
          </section>
        </div>

        <%--<div id="register" class="animate form registration_form">
            <section class="login_content">
              <form>
                <h1>Create Account</h1>
                <div>
                  <input type="text" class="form-control" placeholder="Username" required="" />
                </div>
                <div>
                  <input type="email" class="form-control" placeholder="Email" required="" />
                </div>
                <div>
                  <input type="password" class="form-control" placeholder="Password" required="" />
                </div>
                <div>
                  <a class="btn btn-default submit" href="index.html">Submit</a>
                </div>

                <div class="clearfix"></div>

                <div class="separator">
                  <p class="change_link">Already a member ?
                    <a href="#signin" class="to_register"> Log in </a>
                  </p>

                  <div class="clearfix"></div>
                  <br />

                  <div>
                    <h1><i class="fa fa-paw"></i> Gentelella Alela!</h1>
                    <p>©2016 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                  </div>
                </div>
              </form>
          </section>
        </div>--%>
      </div>
    </div>
    <!-- iCheck -->
    <script src="${proPath}/vendors/iCheck/icheck.min.js"></script>
    <!-- Bootstrap -->
    <script src="${proPath}/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script>
      // iCheck
      $(document).ready(function() {
        if ($("input.flat")[0]) {
          $(document).ready(function () {
            $('input.flat').iCheck({
              checkboxClass: 'icheckbox_flat-green',
              radioClass: 'iradio_flat-green'
            });
          });
        }
      });
      // /iCheck
    </script>
    <script>
      $(document).ready(function() {
        var a=$("#errorInfo").text();
//        alert(a.trim()=="");
        if(a==null||a.trim()==""){
          $("#errorInfo").attr("style", "display:none;");
        }else {
          $("#errorInfo").attr("style", "display:block;");
        }
      });
    </script>
    <script type="text/javascript">
      function refreshRandomCode(){
        $("#randomCode_img").attr("src","${proPath}/jsp/validatecode.jsp?s="+new Date());
      }
    </script>

  </body>
</html>