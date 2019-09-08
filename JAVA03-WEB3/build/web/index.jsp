<%-- 
    Document   : index
    Created on : Aug 10, 2019, 3:28:28 PM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="name" value="HUONG" scope="page"/> <%--khai báo biến --%>
        <%-- <c:out value="${name}" />
        <c:remove var="name" scope="page"/>
        <c:out value="${name}" />
        --%>
        <hr/>
        <c:set var="age" value="${93}" scope="page" />
        <c:if test="${age > 18}">
            <h1>Welcome ${name}</h1>
        </c:if>
        <c:if test="${age <= 18}">
            <h1>${name} khong hop le!</h1>
        </c:if>
        <c:choose>
            <c:when test="${age<=18}">
                <h1>Khong hop le</h1>
            </c:when>
            <c:when test="${age<90}">
                <h1>Welcome ${name}</h1>
            </c:when>
            <c:otherwise>
                <h1>Qua tuoi roi</h1>
            </c:otherwise>
        </c:choose>
        <hr/>
        <ul>
            <c:forEach var="i" begin="0" end="10" step="1">
                <li>Item ${i}</li>
            </c:forEach>
        </ul>
        <hr/>
        <sql:setDataSource
            var="conn"
            driver= "com.mysql.cj.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/sinhvien"
            user="root" password="Ftu.9907@" />
        <sql:query var="rs" dataSource="${conn}"
                   sql="SELECT * FROM info" />
        <c:forEach var="item" items="${rs.rows}">
            <p>
                <c:out value="${item.ten}"/>
            </p>
        </c:forEach>
    </body>
</html>
