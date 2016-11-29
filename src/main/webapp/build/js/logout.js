/**
 * Created by Administrator on 2016-11-18.
 */
/**
 * 登出
 */
$(document).delegate('#logoutBtn','click',function() {

    $("#logoutTip").modal('show');


});
/**
 * 点击确认登出按钮
 */
$(document).delegate('#logout','click',function(){
    $('#logoutBtn').modal('hide');
    location.href = '/icescm/logout.form';
});