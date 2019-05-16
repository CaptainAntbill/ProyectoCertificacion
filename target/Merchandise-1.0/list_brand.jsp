<%-- 
    Document   : list_brand
    Created on : 05-mar-2019, 14:59:52
    Author     : Anthony Mejía
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Marcas</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Marcas</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <table>
                        <tr>
                            <th>No. Id</th>
                            <th>Marca</th>
                            <th>Editar</th>
                        </tr>
                        <c:forEach items="${lista}" var="brand">
                            <tr>
                                <td>${brand.id}</td>
                                <td><button class="button1" onClick="location.href = 'BrandFiltrer?marca=${brand.name_brand}&id=${brand.id}'">${brand.name_brand}</button></td>
                                <td><a class="button1" href="BrandId?id=${brand.id}">Ver</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
