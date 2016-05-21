<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <spring:url value="/resources/js/jquery.js" var="jQuery"/>
    <script src="${jQuery}"></script>

    <spring:url value="/resources/css/bootstrap.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>

    <spring:url value="/resources/js/bootstrap.js" var="bootstrapJs"/>
    <script src="${bootstrapJs}"></script>

    <spring:url value="/resources/css/bootstrap-material-design.css" var="bootstrapMaterialCss"/>
    <link href="${bootstrapMaterialCss}" rel="stylesheet"/>

    <spring:url value="/resources/css/ripples.css" var="ripplesCss"/>
    <link href="${ripplesCss}" rel="stylesheet"/>

    <spring:url value="/resources/js/material.js" var="bootstrapMaterialJs"/>
    <script src="${bootstrapMaterialJs}"></script>

    <spring:url value="/resources/js/ripples.js" var="ripplesJs"/>
    <script src="${ripplesJs}"></script>
</head>