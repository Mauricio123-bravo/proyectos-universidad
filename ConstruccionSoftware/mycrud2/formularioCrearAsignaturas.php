<?php include("db.php") ?>
<?php include("src/includes/header.php")?>
<?php include("src/includes/headerAsignatura.php")?>


<br/>

<form  class="form" action="respuestaCrearAsignaturas.php" method="post" name="frm">

        <h2>Crear Asignatura:</h2>
        <br/>
        <br/>

        <output> Semestre :
        <br/>
        <br/>
        <input type="number"  placeholder="Escribe el semestre..." id="semestreasignatura" name="valorsemestreasignatura"></input>
        
        <br/>
        <br/>
        </output>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombreasignatura" name="valornombreasignatura"></input>

        <br/>
        <br/>
        </output>

        <output> Codigo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el codigo..." id="codigoasignatura" name="valorcodigoasignatura"></input>

        <br/>
        <br/>
        </output>

        <output> Tipo:
        <br/>
        <br/>

        <select id="tipoasignatura" name="valortipoasignatura">
                <option value="De carrera">De carrera</option>
                <option value="Ciencias Basicas">Ciencias Basicas</option>
                <option value="Humanidades">Humanidades</option>
                <option value="Idiomas">Idiomas</option>
        </select>
        <br/>
        <br/>
        </output>

        <output> Id Docente:
        <br/>
        <br/>
        <?php 
                $query ="SELECT * FROM Docente";
                $aux = mysqli_query($conn,$query);
        
        ?>
        <select id="iddocente" name="valoriddocente">
        <?php 
                while($fila=$aux -> fetch_assoc()):
                      $iddocente=$fila['cod_docente'];
                      $nomdocente=$fila['nombres_docente'];
                      echo"<option value=$iddocente>$nomdocente</option>";
                endwhile;
        ?>
        </select>
        <br/>
        <br/>
        </output>

        <button type="submit">Registrar</button>





</form>