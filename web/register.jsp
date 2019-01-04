<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halloween event</title>
    </head>
    <body>
        <form action="addStudent" method="POST">
            
            Roll: <input required type="text" name="roll"/> <br/>
            Name: <input required type="text" name="name"/> <br/>
            Class: <input required type="text" name="className"/> <br/>
            Email: <input required type="email" name="email"/> <br/>
            <input type="submit" value="Add Student"/>
            
        </form>
        <a href="/JSF-Struts/view.jsp">Students have been registered</a>
    </body>
</html>
