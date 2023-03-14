<?php include("db.php") ?>
<?php include("src/includes/header.php")?>
<?php include("src/includes/headerEstudiante.php")?>

<br/>

<form  class="form" action="respuestaCrearEstudiante.php" method="post" name="frm">

        <h2>Crear Estudiante:</h2>
        <output> Id Estudiante:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el id..."  id="idestudiante" name="valoridestudiante"></input>

        <br/>
        <br/>
        </output>

        <output> Nombres:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombreestudiante" name="valornombreestudiante"></input>
        
        <br/>
        <br/>
        </output>

        <output> Apellidos:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el apellido..." id="apellidoestudiante" name="valorapellidoestudainte"></input>

        <br/>
        <br/>
        </output>

        <output> Codigo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el codigo..." id="codigoestudiante" name="valorcodigoestudiante"></input>

        <br/>
        <br/>
        </output>

        <output> Estado:
        <br/>
        <br/>

        
        <input type="text" placeholder="Escribe el codigo..." id="estadoestudiante" name="valorestadoestudiante"></input>


        <br/>
        <br/>
        </output>

        <output> Id Facultad:
        <br/>
        <br/>

        <input type="number" value="4"  readOnly id="idfacultad" name="valoridfacultad" ></input>

        <br/>
        <br/>
        </output>

        <button type="submit">Registrar</button>





</form>