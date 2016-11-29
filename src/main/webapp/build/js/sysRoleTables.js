/**
 * Created by Administrator on 2016-09-21.
 */
var table;
$(function() {

    table = $('#datatable-scroller').DataTable({
        dom: "l<'pull-right'B>rtip",
        "pagingType": "full_numbers",//设置分页控件的模式
        buttons: [
            {
                extend: "copy",
                className: "btn-sm pull-right",
                title: 'Supplier List',
                exportOptions:{
                    columns: "thead th:not(.td-checkbox)"
                }
            },
            {
                extend: "csv",
                className: "btn-sm pull-right",
                title: 'Supplier List',
                exportOptions:{
                    columns: "thead th:not(.td-checkbox)"
                }
            },
            {
                extend: "excel",
                className: "btn-sm pull-right",
                title: 'Supplier List',
                exportOptions:{
                    columns: "thead th:not(.td-checkbox)"
                }
            },
            {
                extend: "print",
                className: "btn-sm pull-right",
                title: 'Supplier List',
                exportOptions:{
                    columns: "thead th:not(.td-checkbox)"
                }
            },

        ],
        responsive: true,
        searching: false,//屏蔽datatales的查询框
        "lengthMenu": [
            [5,10, 20, 50, 100, 150, -1],
            [5,10, 20, 50, 100, 150, "All"] // change per page values here
        ],
        "bLengthChange": true,//屏蔽tables的一页展示多少条记录的下拉列表
        "oLanguage": {  //对表格国际化
            "sLengthMenu": "每页显示 _MENU_条",
            "sZeroRecords": "没有找到符合条件的数据",
            //  "sProcessing": "&lt;img src=’./loading.gif’ /&gt;",
            "sInfo": "当前第 _START_ - _END_ 条　共计 _TOTAL_ 条",
            "sInfoEmpty": "木有记录",
            "sInfoFiltered": "(从 _MAX_ 条记录中过滤)",
            "sSearch": "搜索：",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "前一页",
                "sNext": "后一页",
                "sLast": "尾页",
                "page": "Page",
                "pageOf": "of"
            }
        },
        "processing": true, //打开数据加载时的等待效果
        serverSide:true,
        ajax: {
            // async:false,
            "url"  : "../../../sysRole/select.form",
            "data" : function ( d ) {
                var level1 = "%"+$('#level1').val()+"%";
                //添加额外的参数传给服务器
                d.keyword = level1;
            },
        },

        "columns": [
            { //复选框单元格
                className: "td-checkbox",
                orderable: false,
                width: "30px",
                data: "usId",
                render: function (data, type, row, meta) {
                    return '<input type="checkbox" class="check-box" value='+data+'>';
                }
            },
            { //行号
                // className: "td-checkbox",
                orderable: false,
                width: "auto",
                data: "",
                render: function (data, type, row, meta) {
                    return '<span>'+(meta.row+1)+'</span>';
                }
            },
            { "data": "rlId" },
            { "data": "rlName" },
            { //用户状态
                // className: "td-checkbox",
                orderable: false,
                width: "auto",
                data: "rlStatus",
                render: function (data, type, row, meta) {
                    var status = "";
                    if (data==1) {
                        status = "激活";
                    }else{
                        status = "锁定";
                    }
                    return '<span>'+status+'</span>';
                }
            }
        ],
        "columnDefs": [
            { "orderable": false, "targets": "_all" },
            { "visible": false, "targets": [2] },
            { "defaultContent":"", "targets":"_all"}
        ],
        initComplete:initComplete,
        'drawCallback': function( settings ) {
            $('#checkAll').checked = false;//取消全选状态
        }
    });

    function initComplete(data) {
        var editButtons = '<button   class="btn btn-danger btn-sm" id="deleteAll">批量删除</button> <button   class="btn btn-success btn-sm "  id="addBtn">新 增</button> <button   class="btn btn-warning btn-sm "  id="editBtn">修 改</button>';
        $("#editButtons").append(editButtons);//在表格上方topPlugin DIV中追加HTML
    }
    function search()
    {
        table.ajax.reload();
    }
    $(document).keydown(function(event){
        if(event.keyCode==13){
            search();
        }
    });
    $("#level2").click(function(){
            search();
    });
    /**
     * 多选选中和取消选中,同时选中第一个单元格单选框,并联动全选单选框
     */
    $('#datatable-scroller tbody').on('click', 'tr', function(event) {
        var allChecked=$('#checkAll');//关联全选单选框
        $($(this).children()[0]).children().each(function(){
            if(this.type=="checkbox" && (!$(event.target).is(":checkbox") && $(":checkbox",this).trigger("click"))){
                if(!this.checked){
                    this.checked = true;
                    var selected=table.rows('.selected').data().length;//被选中的行数
                    //全选单选框的状态处理
                    var recordsDisplay=table.page.info().recordsDisplay;//搜索条件过滤后的总行数
                    var iDisplayStart=table.page.info().start;// 起始行数
                    if(selected === table.page.len()||selected === recordsDisplay||selected === (recordsDisplay - iDisplayStart)){
                        allChecked.checked = true;
                    }
                }else{
                    this.checked = false;
                    allChecked.checked = false;
                }
            }
        });
        $(this).toggleClass('selected');//放在最后处理，以便给checkbox做检测
    });



    /**
     * 全选按钮被点击事件
     */
    $('#checkAll').click(function(){
        if(this.checked){
            $('#datatable-scroller tbody tr').each(function(){
                if(!$(this).hasClass('selected')){
                    $(this).click();
                }
            });
        }else{
            $('#datatable-scroller tbody tr').click();
        }
    });
});
/**
 * 单击修改角色按钮
 */
var tree;
$(document).delegate('#updateRole','click',function() {
    var editLength = table.rows('.selected').data().length;
    if (editLength==1) {
        var data = table.row('tr.selected').data();
        $("#demo-form3").find(".form-control").each(function () {
            var text = eval("data." + $(this).attr("name"));
            $(this).val(text);
        });
        tree = $('#tree_2').jstree({
            'plugins': ["wholerow", "checkbox", "types"],
            'core': {
                "themes" : {
                    "responsive": false
                },
                'data': {
                    url:"../../../sysRole/updatePermission.form?rlId="+$("#selectId").val()
                }
            }
        }); 
        /*$.ajax({
            async:false,
            url:"../../../sysRole/updatePermission.form",
            type:"POST",
            data:{
                "rlId": $("#selectId").val()
            },
            dataType:"json",
            success:function (data) {
                $('#tree_2').jstree({
                    'plugins': ["wholerow", "checkbox", "types"],
                    'core': {
                        "themes" : {
                            "responsive": false
                        },
                        'data': data
                    }
                });
            }
        });
        $('#tree_2').jstree.redraw(true);*/
        $('#updateRoleModal').modal('show');
        
    } else {
        alert("请选择一条您要修改的记录！")
    }

});
/**
 * 修改角色权限界面不可见时清除jsTree
 */
$('#updateRoleModal').on('hidden.bs.modal', function () {
    // alert("aa");
    $.jstree.destroy ()
});
/**
 * 点击确认修改角色按钮
 */
$('#demo-form3 .btn-success').on('click', function() {
    // alert("aa");
    // alert($('#tree_2').jstree('get_selected'));
    var array = $('#tree_2').jstree('get_selected');
    var arr = [];
    $.each(array,function (n,value) {
        // alert(n + "cc" + value);
        // alert(typeof(parseInt(value)) );
        var reg = /^[0-9]+$/;
        if(reg.test(value)) {
            // alert(n + "bb" + value);
            arr.push(value)
        }
    });
    alert(arr);
    $.ajax({
        url: "../../../sysRole/confirmPermission.form",
        type: "POST",
        traditional:true,
        data:{
            rlId:$("#selectId").val(),
            ids:arr
        },
        success:function (data) {
          if(data>0) {
              alert("修改成功");
          } else {
              alert("修改失败");
          }
        }
    });
    // alert(arr);
//     var options = {
//         url:        '../../../sysUser/updateRole.form',
//         traditional:true,
//         data:{
//             "ids":array,
//         },
//         success:    function() {
//             alert('修改成功!');
//             window.location.reload();
//         }
//     };
// // pass options to ajaxForm
//     $('#demo-form3').ajaxForm(options);
    $('#updateRoleModal').modal('hide');
});

/**
 * 单击修改密码按钮
 */
$(document).delegate('#editBtn','click',function() {
    var editLength = table.rows('.selected').data().length;
    if (editLength==1) {
        var data = table.row('tr.selected').data();
        //
        // var abc = "supName";

        // alert(eval("data."+abc));
        // for(x in data) {
        //     alert(data[x]);
        // }
        $("#demo-form").find(".form-control").each(function () {
            var text = eval("data." + $(this).attr("name"));
            $(this).val(text);
        });

        $('#myModal-edit-info').modal('show');
    } else {
        alert("请选择一条您要修改的记录！")
    }
    // alert(table.rows('.selected').length);
    // alert(typeof data);
    // $.each(data, function(key,val) {
    //     alert("xx");
    //     alert(this);
    // });
});

/**
 * 点击新增按钮事件
 */
$(document).delegate('#addBtn','click',function() {
    $("#myModal-add-info").modal('show');
});
