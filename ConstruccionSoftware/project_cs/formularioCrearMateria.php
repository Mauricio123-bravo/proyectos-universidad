<?php include("db.php") ?>
<?php include("src/includes/header.php")?>



<br/>

<form  class="form" action="respuestaCrearMateria.php" method="post" name="frm">

        <h2>Crear Materia:</h2>
        <br/>
        <br/>

        <output> Nombre Materia :
        <br/>
        <br/>
        <input type="text"  placeholder="Escribe el nombre ..." id="nommateria" name="valorsnommateria"></input>
        
        <br/>
        <br/>
        </output>

        <output> Referencia:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe la referencia..." id="refmateria" name="valorrefmateria"></input>

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

      

        <button type="submit">Registrar</button>





</form>