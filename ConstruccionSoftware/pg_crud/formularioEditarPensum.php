<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<form class="form" action="respuestaEditarPensum.php?idpensums=<?php echo $_GET['idpensums'] ?>" method="post">


        <h2>Editar Pensum</h2>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nompensumedit" name="valornompensumedit"></input>

        <br/>
        <br/>
        </output>

        <output> Periodo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el periodo..." id="perpensumedit" name="valorperpensumedit"></input>

        <br/>
        <br/>
        </output>

       

    
        <button  name="update" >Actualizar</button>

        

        

</form>