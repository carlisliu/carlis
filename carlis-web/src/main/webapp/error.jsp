<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html class="error-page">
    <head>
        <title>500 error page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <h1>Error Page.</h1>
        <p>
        	<s:property value="exception.message" />
        </p>
    </body>
</html>
