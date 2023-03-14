<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarPrograma.php?idprograma=<?php echo $_GET['idprograma'] ?>" method="post">


        <h2>Editar Programa</h2>

    

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombreprogedit" name="valornombreprogedit"></input>

        <br/>
        <br/>
        </output>

      

        <button  name="update" >Actualizar</button>

        

        

</form>