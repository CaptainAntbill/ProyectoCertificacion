<%-- 
    Document   : list_models
    Created on : 05-mar-2019, 16:52:14
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
        <title>Modelos</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Modelos</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                    <div><a href="InsertModel" class="button button2">Nuevo</a></div>
                </aside>
                <main class="main">
                    <table>
                        <tr>
                            <th>No. Id</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Existencia</th>
                            <th>Marca</th>
                            <th>Tipo</th>
                            <th>Editar</th>
                        </tr>
                        <c:forEach items="${lista}" var="model">
                            <tr>
                                <td>${model.id}</td>
                                <td>${model.name_model}</td> 
                                <td>${model.price}</td> 
                                <td>${model.units}</td> 
                                <td>${model.branShoe}</td>
                                <td>${model.typeShoe}</td>
                                <td><a class="button1" href="ModelId?id=${model.id}">Ver</a></td>
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
