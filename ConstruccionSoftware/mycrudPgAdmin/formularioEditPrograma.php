<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaEditarPrograma.php?idprograma=<?php echo $_GET['idprograma']; ?>" method="POST">
  <h2>Actualizar Programa</h2>
  
  <output>Nombre Programa:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombrePrograma" name="nombrePrograma"></input>
    </output>

    <br/>
    <br/>


  <button  name="update">Actualizar</button>

</form>