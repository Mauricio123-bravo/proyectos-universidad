<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarMateriaPensum.php?idmateriapensum=<?php echo $_GET['idmateriapensum'] ?>" method="post">


        <h2>Editar MateriaPensum</h2>

        <output> Id Pensum:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idpemedit" name="valoridpemedit"></input>

        <br/>
        <br/>
        </output>

        <output> Id Materia:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idmatedit" name="valordmatedit"></input>

        <br/>
        <br/>
        </output>

        <output> Id Semestre:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idsemedit" name="valoridsemedit"></input>

        <br/>
        <br/>
        </output>

    
        <button  name="update" >Actualizar</button>

        

        

</form>