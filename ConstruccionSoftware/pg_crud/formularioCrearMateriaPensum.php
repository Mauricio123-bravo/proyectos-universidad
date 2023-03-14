<?php include("db.php") ?>
<?php include("src/includes/header.php")?>



<br/>

<form  class="form" action="respuestaCrearMateriaPensum.php" method="post" name="frm">

        <h2>Crear MateriaPensum:</h2>

        <output> Id MateriaPensum:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idmatpen" name="valoridmatpen"></input>

       
        <br/>
        <br/>
        </output>

        <output> Id Pensum :
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idpensum" name="valoridpensum"></input>
        
        <br/>
        <br/>
        </output>

        <output> Id Materia:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idmateria" name="valoridmateria"></input>

        <br/>
        <br/>
        </output>

    
        <output> Id Semestre:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..." id="idsemestre" name="valoridsemestre"></input>

        <br/>
        <br/>
        </output>

        


        <button type="submit">Registrar</button>





</form>