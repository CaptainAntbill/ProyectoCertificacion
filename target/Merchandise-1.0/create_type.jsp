<%-- 
    Document   : create_type
    Created on : 05-mar-2019, 15:21:04
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Nuevo Tipo</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Nuevo Tipo de Calzado</label>
            </nav>
            <div class="container">
                <aside class="aside">
                    <div><a href="index.jsp" class="button button2">Ir Inicio</a></div>
                    <div><a href="ModelList" class="button button2">Modelo</a></div>
                    <div><a href="TypeList" class="button button2">Calzado</a></div>
                    <div><a href="BrandList" class="button button2">Marcas  </a></div>
                </aside>
                <main class="main">
                    <form method="post" action="CreateType">
                        <br><label style="color: white">Nuevo Tipo de Calzado</label>
                        <input pattern="(.*[a-z])" required name="name" type="text" required minlength="2">
                        <button class="button">Ingresar</button>
                    </form>
                </main>
            </div>
            <footer>
                <p></p>
            </footer>
    </body>
</html>
