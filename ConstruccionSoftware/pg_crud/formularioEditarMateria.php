<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarMateria.php?idmaterias=<?php echo $_GET['idmaterias'] ?>" method="post">


        <h2>Editar Materia</h2>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nommateriaedit" name="valornommateriaedit"></input>

        <br/>
        <br/>
        </output>

    
        <output> Referencia:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe la referencia..." id="refmatedit" name="valorrefmatedit"></input>

        <br/>
        <br/>
        </output>


        

        <button  name="update" >Actualizar</button>

        

        

</form>