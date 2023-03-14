<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarFacultad.php?cod_facultad=<?php echo $_GET['cod_facultad'] ?>" method="post">


        <h2>Editar Facultad</h2>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombrefaculedit" name="valornombrefaculedit"></input>

        <br/>
        <br/>
        </output>

    
        <button  name="update" >Actualizar</button>

        

        

</form>