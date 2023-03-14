<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaCrearProgramas.php" method="post" name="frm">
    <h2>Crear Programa: </h2>

    <output>Nombre Programa:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombrePrograma" name="nombrePrograma"></input>
    </output>

    <br/>
    <br/>

    <button type="submit">Registrar</button>
</form>