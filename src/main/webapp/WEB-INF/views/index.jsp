<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<html>
<head>
    <jsp:include page="fragments/headTag.jsp"/>
    <title>Home</title>
</head>

<body>
<jsp:include page="fragments/bodyHeader.jsp"/>
<div class="container">
    <h1>Something is coming</h1>

    <form class="form-horizontal" method="POST" action="uploadFile" enctype="multipart/form-data">
        <fieldset>
            <div class="form-group">
                <label for="inputFile" class="col-md-2 control-label">File</label>

                <div class="col-md-10">
                    <input type="text" readonly="" class="form-control" placeholder="Browse...">
                    <input type="file" id="inputFile" name="file">
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-10 col-md-offset-2">
                    <button type="button" class="btn btn-default">Cancel</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </fieldset>
    </form>

</div>


<script>
    $.material.init();
</script>
</body>

</html>
