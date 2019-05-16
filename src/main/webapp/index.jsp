<%-- 
    Document   : index
    Created on : 08-mar-2019, 16:33:46
    Author     : Anthony Mejía
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>SHOETIFY</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav" style="display: flex; flex-direction: column">
                <label style="margin: auto; font-size: 60px">SHOETIFY</label><br>
            </nav>
            <main class="main">
                <div style="margin: auto">
                    <a href="ModelList" class="button">Modelo de Tennis</a>
                    <a href="TypeList" class="button">Tipos de Calzado</a>
                    <a href="BrandList" class="button">Marcas</a>
                    <a href="InsertModel" class="button">Ingresar Modelo</a>
                    <a href="create_brand.jsp" class="button">Crear Marca</a>
                    <a href="create_type.jsp" class="button">Crear nuevo Tipo</a>
                </div>
            </main>
    </body>

</html>
