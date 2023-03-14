<?php include("db.php") ?>
<?php include("src/includes/header.php")?>



<br/>

<form  class="form" action="respuestaCrearPensums.php" method="post" name="frm">

        <h2>Crear Pensum:</h2>

        <output> Id Pensum:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idpensum" name="valoridpensum"></input>

       
        <br/>
        <br/>
        </output>

      
        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombrepensum" name="valornombrepensum"></input>

        <br/>
        <br/>
        </output>

    

        <output> Periodo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el periodo..." id="perpensum" name="valorperpensum"></input>

        <br/>
        <br/>
        </output>

        <output> Id Programa:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idprog" name="valoridprog"></input>

        <br/>
        <br/>
        </output>


        <button type="submit">Registrar</button>





</form>