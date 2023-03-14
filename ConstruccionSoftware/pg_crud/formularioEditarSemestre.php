<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarSemestre.php?idsemestres=<?php echo $_GET['idsemestres'] ?>" method="post">


        <h2>Editar Semestre</h2>

    

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombresemedit" name="valornombresemedit"></input>

        <br/>
        <br/>
        </output>

      

        <button  name="update" >Actualizar</button>

        

        

</form>