<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
  <%@include file="/common/header.jsp"%>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <%@include file="/common/menu.jsp"%>

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3 class="page_title">用户信息列表</h3>
              </div>
            </div>

            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>用户 <small>信息列表</small></h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <p class="text-muted font-13 m-b-30">
                    下表显示了系统用户的信息
                  </p>
                  <div class="pull-left">
                    <button   class="btn btn-success btn-sm "  id="addBtn">新 增</button>
                    <button   class="btn btn-warning btn-sm "  id="editBtn">修改密码</button>
                    <button   class="btn btn-danger btn-sm" id="updateRole">修改角色</button>
                  </div>
                  <div class="btn pull-right">
                    <input type="text" id="level1">
                    <input type="button" id="level2" value="查询">
                  </div>
                  <table id="datatable-scroller" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                    <thead>
                    <tr>
                      <th><input type="checkbox" id="checkAll"></th>
                      <th>行号</th>
                      <th>用户编号</th>
                      <th>用户名称</th>
                      <th>用户状态</th>
                    </tr>
                    </thead>
                    <tbody></tbody>
                  </table>

                </div>
              </div>
            </div>
            </div>
          </div>
        </div>
        <!-- /page content -->
        <!--修改角色确认对话框begin-->
        <div class="modal fade" id="updateRoleModal" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                  &times;
                </button>
                <h4 class="modal-title">
                  修改角色
                </h4>
              </div>
              <div class="modal-body">
                <form id="demo-form3" data-parsley-validate class="form-horizontal form-label-left" method="post">
                  <div class="form-group">
                    <input type="hidden" name="usId" id="selectId" class="form-control">
                  </div>
                  <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="usUsername" >用户名 <span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                      <input type="text" name="usUsername" required="required" class="form-control col-md-7 col-xs-12">
                    </div>
                  </div>
                  <div class="checkbox" style="text-align: center">
                    <c:forEach items="${sysRole}" var="allRoles">
                      <label>
                        <input type="checkbox" name="sysRoles" class="flat" value="${allRoles.rlId}"> ${allRoles.rlName}
                      </label>
                    </c:forEach>
                  </div>



                  <div class="ln_solid"></div>
                  <div class="form-group">
                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                      <button data-dismiss="modal" aria-hidden="true" class="btn btn-primary">Cancel</button>
                      <button type="submit" class="btn btn-success">Submit</button>
                    </div>
                  </div>

                </form>
              </div>
            </div><!-- /.modal-content -->
          </div>
        </div>
        <!--修改角色确认对话框end-->
        <!--新增页面开始-->
        <div class="modal fade" id="myModal-add-info" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                  &times;
                </button>
                <h4 class="modal-title" id="myModalLabelAdd">
                  新 增
                </h4>
              </div>
                <div class="modal-body">
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="usUsername">用户名 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="usUsername" name="usUsername" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="usPassword">密码 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="password" id="usPassword" name="usPassword" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="confirmPwd">确认密码 <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="password" id="confirmPwd" name="confirmPwd" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>

                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button data-dismiss="modal" aria-hidden="true" class="btn btn-primary">Cancel</button>
                          <button type="submit" class="btn btn-success">Submit</button>
                        </div>
                      </div>

                    </form>
                </div>
            </div><!-- /.modal-content -->
          </div>
        </div>
        <!--编辑页面开始-->
        <div class="modal fade" id="myModal-edit-info" tabindex="-1" role="dialog"
             aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal" aria-hidden="true">
                  &times;
                </button>
                <h4 class="modal-title" id="myModalLabelEdit">
                  修 改 密 码
                </h4>
              </div>
              <div class="modal-body">
                <form id="demo-form" data-parsley-validate class="form-horizontal form-label-left" method="post">
                  <div class="form-group">
                    <input type="hidden" name="usId" class="form-control">
                  </div>
                  <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="usUsername">用户名 <span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                      <input type="text" name="usUsername" required="required" class="form-control col-md-7 col-xs-12">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="usPassword">密码 <span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                      <input type="password" name="usPassword" required="required" class="form-control col-md-7 col-xs-12">
                    </div>
                  </div>

                  <div class="ln_solid"></div>
                  <div class="form-group">
                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                      <button data-dismiss="modal" aria-hidden="true" class="btn btn-primary">Cancel</button>
                      <button type="submit" class="btn btn-success">Submit</button>
                    </div>
                  </div>

                </form>
              </div>
            </div><!-- /.modal-content -->
          </div>
        </div>
        <!-- footer content -->
        <%@include file="/common/footer.jsp"%>
        <!-- /footer content -->
      </div>
    </div>

    <%@include file="/common/footerJs.jsp"%>
    <!-- Datatables -->
    <script src="${proPath}/build/js/sysUserTables.js"></script>
    <!-- myForms -->
    <script src="${proPath}/build/js/sysUserForms.js"></script>



  </body>
</html>