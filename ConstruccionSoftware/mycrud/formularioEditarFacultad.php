<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarFacultad.php?facultadid=<?php echo $_GET['facultadid'] ?>" method="post">


        <h2>Editar Facultad</h2>

        

        <output> Nombre:
        <br/> 
        <input type="text" placeholder="Escriba el nombre...." id="editnombre" name="valorEditNombre" > </input>

        <br/> 
        <br/> 


       

        <button  name="update" >Actualizar</button>

        

        </output> 

</form>