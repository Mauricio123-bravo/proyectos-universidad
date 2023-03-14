<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaEditarMateria.php?idmateria=<?php echo $_GET['idmateria']; ?>" method="post" name="frm">
    <h2>Crear Estudiante: </h2>

    <output>Nombre:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombreMateria" name="nombremateria"></input>
    </output>

    <br/>
    <br/>

    <output>Referencia:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe la referencia..." id="valorreferenciamateria" name="referenciamateria"></input>
    </output>

  <button  name="update">Actualizar</button>
</form>