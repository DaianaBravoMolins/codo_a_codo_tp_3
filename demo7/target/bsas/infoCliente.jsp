<%@ page contentType="text/html" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Informacion del registro</title>
    <link rel="stylesheet" href="Styles.css">
</head>
<body>
    <section>
        <h2>Datos del cliente ID ${c.getid()}</h2>
        <p>nombre: ${c.getnombre()}</p>
        <p>apellido: ${c.getapellido()}</p>
        <p>contacto: ${c.getcontacto()}</p>

    </section>    
</body>
</html> 