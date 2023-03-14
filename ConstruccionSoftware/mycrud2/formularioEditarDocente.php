<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarDocente.php?cod_docente=<?php echo $_GET['cod_docente'] ?>" method="post">


        <h2>Editar Docente</h2>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombredocedit" name="valornombredocedit"></input>

        <br/>
        <br/>
        </output>

    
        <output> Apellido:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el apellido..." id="apellidodocedit" name="valorapellidodocedit"></input>

        <br/>
        <br/>
        </output>


        <output> Tipo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el tipo..." id="tipodocedit" name="valortipodocedit" ></input>

        <br/>
        <br/>
        </output>

        <button  name="update" >Actualizar</button>

        

        

</form>