<?php include("db.php") ?>
<?php include("src/includes/header.php")?>



<br/>

<form  class="form" action="respuestaCrearPrograma.php" method="post" name="frm">

        <h2>Crear Programa:</h2>

        <output> Id Programa:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idprograma" name="valoridprograma"></input>

       
        <br/>
        <br/>
        </output>

      
        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombreprog" name="valornombreprog"></input>

        <br/>
        <br/>
        </output>

    

       


        <button type="submit">Registrar</button>





</form>