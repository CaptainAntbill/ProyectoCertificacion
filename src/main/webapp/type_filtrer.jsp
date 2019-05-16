<%-- 
    Document   : type_filtrer
    Created on : 11-mar-2019, 22:04:59
    Author     : Anthony Mejía
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>FTipo</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Filtrado por Tipo</label>
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
                            <th>Tipo</th>
                        </tr>
                        <c:forEach items="${models}" var="model">
                            <tr>
                                <td>${model.name_model}</td>
                                <td>${model.type}</td>
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
