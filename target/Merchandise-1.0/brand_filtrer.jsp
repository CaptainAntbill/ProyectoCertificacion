<%-- 
    Document   : brand_filtrer
    Created on : 10-mar-2019, 17:39:05
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
        <title>FMarca</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Filtrado por Marca</label>
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
                            <th>Modelo</th>
                            <th>Marca</th>
                        </tr>
                        <c:forEach items="${models}" var="model">
                            <tr>
                                <td>${model.name_model}</td> 
                                <td>${model.brand}</td>
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
