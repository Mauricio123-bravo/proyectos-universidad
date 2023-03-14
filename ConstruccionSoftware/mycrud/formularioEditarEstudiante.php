<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarEstudiante.php?estudianteid=<?php echo $_GET['estudianteid'] ?>" method="post">


        <h2>Editar Estudiante</h2>

        <output> Nombres:
        <br/> 
        <input type="text" placeholder="Escriba el nombre...." id="nombreedit" name="valorNombreEdit" > </input>

        <br/> 
        <br/> 

        <output> Apellido:
        <br/> 
        <input type="text" placeholder="Escriba los apellidos...." id="apellidoedit" name="valorApellidoEdit" > </input>

       

        <button  name="update" >Actualizar</button>

        

        </output> 

</form>