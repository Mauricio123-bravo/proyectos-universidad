<?php include("db.php") ?>
<?php include("src/includes/header.php")?>



<br/>

<form  class="form" action="respuestaEditarSemestre.php" method="post" name="frm">

        <h2>Crear Semestre:</h2>

        <output> Id Semestre:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idsem" name="valoridsem"></input>

       
        <br/>
        <br/>
        </output>

      
        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombresem" name="valornombresem"></input>

        <br/>
        <br/>
        </output>

    


        <button type="submit">Registrar</button>





</form>