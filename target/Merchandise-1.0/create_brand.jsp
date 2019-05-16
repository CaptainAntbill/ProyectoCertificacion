<%-- 
    Document   : create_brand
    Created on : 05-mar-2019, 15:36:19
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Nueva Marca</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Nueva Marca</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas</a></div>
                </aside>
                <main class="main">
                    <form method="post" action="CreateBrand">
                        <br><label style="color: white">Ingrese nueva Marca</label>
                        <input pattern="(.*[a-z])" required name="name" type="text">
                        <button class="button">Ingresar</button>
                    </form>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
