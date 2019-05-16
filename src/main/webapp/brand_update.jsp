<%-- 
    Document   : brand_update
    Created on : 06-mar-2019, 16:56:46
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Actualiza una Marca</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Actualiza una Marca</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <form method="post" action="BrandUpdate">
                        <input name="id" type="hidden" value="${brand.id}">
                        <br><label style="color: white">Actualiza una Marca</label><br>
                     
                        <input required pattern="(.*[a-z])" type="text" name="name_brand" value="${brand.name_brand}">
                        <button class="button">Actualizar</button>
                        <a href="BrandList" class="button">Volver</a>
                    </form>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
