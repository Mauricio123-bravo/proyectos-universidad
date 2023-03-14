<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaCrearSemestres.php" method="post" name="frm">
    <h2>Crear Semestre: </h2>

    <output>Nombre Semestre:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombreSemestre" name="nombreSemestre"></input>
    </output>

    <br/>
    <br/>

    <button type="submit">Registrar</button>
</form>