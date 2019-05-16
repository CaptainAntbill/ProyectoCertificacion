<%-- 
    Document   : model_update
    Created on : 05-mar-2019, 20:17:42
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Actualiza un Modelo</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Actualiza un Modelo</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <form method="post" action="ModelUpdate">
                        <input required name="id" type="hidden" value="${model.id}">
                        <br><label style="color: white">Nombre del Modelo</label><br>
                        <input required name="name_model" type="text" value="${model.name_model}">
                        <br><label style="color: white">Precio</label><br>
                        <input required pattern="(.*[0-9])" name="price" type="text" value="${model.price}">
                        <br><label style="color: white">Existencia</label><br>
                        <input required pattern="(.*[0-9])" name="units" type="text" value="${model.units}">
                        <button class="button">Actualizar</button>
                        <a href="ModelList" class="button">Volver</a>
                    </form>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
