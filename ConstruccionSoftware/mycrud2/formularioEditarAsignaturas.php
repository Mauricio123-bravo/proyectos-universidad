<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarAsignaturas.php?idAsignatura=<?php echo $_GET['idAsignatura'] ?>" method="post">


        <h2>Editar Asignatura</h2>

        <output> Semestre :
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el semestre..." id="semestreedit" name="valorsemestreedit"></input>
        
        <br/>
        <br/>
        </output>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombreasigedit" name="valornombreasigedit"></input>

        <br/>
        <br/>
        </output>

        <output> Tipo:
        <br/>
        <br/>

        
        <input type="text" placeholder="Escribe el tipo..." id="tipoasigedit" name="valortipoasigedit"></input>


        <br/>
        <br/>
        </output>

        <button  name="update" >Actualizar</button>

        

        

</form>