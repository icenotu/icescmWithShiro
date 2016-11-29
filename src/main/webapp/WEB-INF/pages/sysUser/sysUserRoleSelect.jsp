<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<div class="checkbox" style="text-align: center">
    <c:forEach items="${sysRole}" var="allRoles">
        <label>
            <input type="checkbox" class="flat" value="${allRoles.rlId}"> ${allRoles.rlName}
        </label>
    </c:forEach>
</div>
<script>

</script>



  </body>
</html>