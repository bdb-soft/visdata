<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="fragments/headTag.jsp"/>
    <title>Файл</title>
</head>

<body>
<jsp:include page="fragments/bodyHeader.jsp"/>
<div class="container">
    <h1>UPLOAD</h1>

    <div class="alert alert-dismissible alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>Отлично!</strong> Вы успешно загрузили файл
        <a href="javascript:void(0)" class="alert-link"><c:out value="${fileName}"/></a>.
    </div>
</div>


<script>
    $.material.init();
</script>
</body>

</html>