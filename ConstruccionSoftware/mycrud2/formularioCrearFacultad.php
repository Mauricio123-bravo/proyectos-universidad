<?php include("db.php") ?>
<?php include("src/includes/header.php")?>
<?php include("src/includes/headerFacultad.php")?>


<br/>

<form  class="form" action="respuestaCrearFacultad.php" method="post" name="frm">

        <h2>Crear Facultad:</h2>

        <output> Codigo :
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el codigo..." id="codigofacultad" name="valorcodigofacultad"></input>

       
        <br/>
        <br/>
        </output>

      
        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombrefacultad" name="valornombrefacultad"></input>

        <br/>
        <br/>
        </output>

    

        <output> Id Seccional:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idseccional" name="valoridseccional"></input>

        <br/>
        <br/>
        </output>


        <button type="submit">Registrar</button>





</form>