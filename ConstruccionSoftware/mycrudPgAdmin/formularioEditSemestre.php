<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaEditarSemestre.php?idsemestre=<?php echo $_GET['idsemestre']; ?>" method="POST">
  <h2>Actualizar Semestre</h2>

  <output>Nombre Semestre:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombreSemestre" name="nombreSemestre"></input>
  </output>

    <br/>
    <br/>

  <button  name="update">Actualizar</button>

</form>