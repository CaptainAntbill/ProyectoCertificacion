<%-- 
    Document   : insert_model
    Created on : 06-mar-2019, 14:34:50
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
        <title>Nuevo Modelo</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Nuevo Modelo</label>
            </nav>
            <div class="container">
                <aside class="aside">  
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <form action="CreateModel" method="post">
                        <br><label style="color: white">Nombre del Modelo</label><br>
                        <input required name="name_model" type="text">
                        <br><label style="color: white">Precio</label><br>
                        <input required pattern="(.*[0-9])" name="price" type="text">
                        <br><label style="color: white">Existencia</label><br>
                        <input required pattern="(.*[0-9])" name="units" type="text"><br><br>
                        <div>
                        <select name="type_id">
                            <c:forEach items="${list}" var="type">
                                <option value="${type.id}">${type.type_shoe}</option>
                            </c:forEach>
                        </select>
                        <select name="brand_id">
                            <c:forEach items="${list1}" var="brand">
                                <option value="${brand.id}">${brand.name_brand}</option>
                            </c:forEach>
                        </select>
                        </div><br>
                        <button class="button">Guardar</button>
                    </form>
                </main>
            </div>
                <footer>
                    <p></p>
                </footer>
                    </body>
                    </html>
