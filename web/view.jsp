
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students that have been registered </title>
    </head>
    <body>
        <h1>Students that have been registered</h1>
        <table>
            <tr>
                <th>id</th>
                <th>roll</th>
                <th>name</th>
                <th>class</th>
                <th>email</th>
            </tr>
            <s:iterator value="students" var="student">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="rollNumber"/></td>
                    <td><s:property value="name"/></td>
                    <td><s:property value="className"/></td>
                    <td><s:property value="email"/></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
