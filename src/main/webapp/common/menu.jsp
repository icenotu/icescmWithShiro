<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-09-26
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <a href="${proPath}/base/goURL/index/index.form" class="site_title"><i class="fa fa-paw"></i> <span>SCM System</span></a>
        </div>

        <div class="clearfix"></div>

        <!-- menu profile quick info -->
        <div class="profile">
            <div class="profile_pic">
                <img src="${proPath}/images/picture.jpg" alt="..." class="img-circle profile_img">
            </div>
            <div class="profile_info">
                <span>Welcome,</span>
                <h2>${activeUser.usUsername}</h2>
            </div>
        </div>
        <!-- /menu profile quick info -->

        <br />

        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                    <li><a><i class="fa fa-home"></i> 主页 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li class="current-page"><a href="${proPath}/first.form">公司简介</a></li>
                        </ul>
                    </li>
                    <c:if test="${activeUser.firstMenus!=null }">
                            <c:forEach items="${activeUser.firstMenus}" var="firstMenu">
                                <%--<li><div>
                                    <a title="${menu.name }" ref="1_1" href="#"
                                       rel="${baseurl }/${menu.url }" icon="icon-log"><span
                                            class="icon icon-log">&nbsp;</span><span class="nav"><a href=javascript:addTab('${menu.name }','${baseurl }/${menu.url }')>${menu.name }</a></span></a>
                                </div></li>--%>
                                <li><a><i class="fa fa-gear"></i> ${firstMenu.pmName} <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu">
                                        <c:forEach items="${activeUser.secondMenus}" var="secondMenu">
                                            <c:if test="${secondMenu.pmParentid==firstMenu.pmId}">
                                                <li>
                                                    <a href="${proPath}${secondMenu.pmUrl}">${secondMenu.pmName}</a>
                                                </li>
                                            </c:if>
                                        </c:forEach>
                                    </ul>
                                </li>
                            </c:forEach>
                    </c:if>
                    <%--<li><a><i class="fa fa-gear"></i> 系统设置 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a><i class="fa fa-sitemap"></i>基础参数设置<span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="${proPath}/base/goURL/sysParam/supTypeSetting.form">供应商类型设置</a>
                                    </li>
                                    <li>
                                        <a href="${proPath}/base/goURL/sysParam/goodsColorSetting.form">商品颜色设置</a>
                                    </li>
                                 </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> 采购模块 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${proPath}/base/goURL/suppliers/supplierManagement.form">供应商信息</a></li>
                            <li><a href="${proPath}/base/goURL/purchase/purchaseGoods.form">采购商品</a></li>
                            <li><a href="${proPath}/base/goURL/purchase/buyOrderView.form">采购订单查询</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> 库存模块 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${proPath}/base/goURL/goods/storeHouseManagement.form">仓库列表</a></li>
                            <li><a href="${proPath}/base/goURL/goods/goodsManagement.form">商品信息</a></li>
                            <li><a href="${proPath}/base/goURL/goods/inventoryView.form">库存信息</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> 销售模块 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${proPath}/base/goURL/sales/distributorManagement.form">经销商信息</a></li>
                            <li><a href="${proPath}/base/goURL/sales/salesGoods.form">销售商品</a></li>
                            <li><a href="${proPath}/base/goURL/sales/salesContractView.form">销售订单查询</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> 报表模块 <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${proPath}/base/goURL/report/salesCostReport.form">销售成本表</a></li>
                            <li><a href="${proPath}/base/goURL/report/salesProfitReport.form">销售利润表</a></li>
                            <li class="current-page"><a href="${proPath}/base/goURL/chart/chartjs2.form">统计图表</a></li>
                        </ul>
                    </li>--%>
                </ul>
            </div>
        </div>
        <!-- /sidebar menu -->
    </div>
</div>

<!-- top navigation -->
<div class="top_nav">
    <div class="nav_menu">
        <nav class="" role="navigation">
            <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li class="">
                    <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <img src="${proPath}/images/picture.jpg" alt="">${activeUser.usUsername}
                        <span class=" fa fa-angle-down"></span>
                    </a>
                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                        <li><a href="javascript:;"> 资料</a></li>
                        <li>
                            <a href="javascript:;">
                                <span class="badge bg-red pull-right">50%</span>
                                <span>设置</span>
                            </a>
                        </li>
                        <li><a href="javascript:;">帮助</a></li>
                        <li><a id="logoutBtn" href="javascript:void(0);"><i class="fa fa-sign-out pull-right"></i> 登出</a></li>
                    </ul>
                </li>



                <%--<li role="presentation" class="dropdown">
                    <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                        <i class="fa fa-envelope-o"></i>
                        <span class="badge bg-green">6</span>
                    </a>
                    <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                        <li>
                            <a>
                                <span class="image"><img src="${proPath}/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                            </a>
                        </li>
                        <li>
                            <a>
                                <span class="image"><img src="${proPath}/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                            </a>
                        </li>
                        <li>
                            <a>
                                <span class="image"><img src="${proPath}/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                            </a>
                        </li>
                        <li>
                            <a>
                                <span class="image"><img src="${proPath}/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                            </a>
                        </li>
                        <li>
                            <div class="text-center">
                                <a>
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </div>
                        </li>
                    </ul>
                </li>--%>
            </ul>
        </nav>
    </div>
</div>
<!-- /top navigation -->


<!--登出确认对话框begin-->
<div class="modal fade" id="logoutTip" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <form class="form-horizontal" role="form">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close"
                            data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabelDel">
                        提示信息
                    </h4>
                </div>
                <div class="modal-body" style="text-align: left;">
                    <h5>您确定要登出系统吗？</h5>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default"
                            data-dismiss="modal">取消
                    </button>
                    <button type="button" class="btn btn-primary" id="logout">
                        确认
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div>
    </form>
</div>
<!--登出确认对话框end-->

</body>
</html>
