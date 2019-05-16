<%-- 
    Document   : type_update
    Created on : 06-mar-2019, 16:12:40
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Actualiza un Tipo</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Actualizar un Tipo de Calzado</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <form method="post" action="TypeUpdate">
                        <input required name="id" type="hidden" value="${type.id}">
                        <br><label style="color: white">Tipo de Calzado</label><br>
                        <input required pattern="(.*[a-z])" name="type_shoe" type="text" value="${type.type_shoe}">
                        <button class="button">Actualizar</button>
                        <a href="TypeList" class="button">Volver</a>
                    </form>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
