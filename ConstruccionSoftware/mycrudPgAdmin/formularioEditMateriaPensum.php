<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaEditarMateriaPensum.php?idmateriapensum=<?php echo $_GET['idmateriapensum']; ?>" method="POST">
  <h2>Actualizar Estudiante</h2>
  <output>Semestre:
        <br/>
        <br/>
        <?php  
            $query = "SELECT * FROM semestres";
            $result = pg_query($conn, $query);
        ?>
        <select name="id_semestre">
            <?php  
                while($fila = pg_fetch_assoc($result)):
                    $idsemestre = $fila['idsemestre'];
                    $nombresemestre = $fila['nombresemestre'];
                    echo "<option value=$idsemestre>$nombresemestre</option>";
                endwhile;
            ?>
        </select>
    </output>

    <br/>
    <br/>

    <output>Pensum:
        <br/>
        <br/>
        <?php  
            $query = "SELECT * FROM pensums";
            $result = pg_query($conn, $query);
        ?>
        <select name="id_pensum">
            <?php  
                while($fila = pg_fetch_assoc($result)):
                    $idpensums = $fila['idpensums'];
                    $nombrepensum = $fila['nombrepensum'];
                    echo "<option value=$idpensums>$nombrepensum</option>";
                endwhile;
            ?>
        </select>
    </output>

    <br/>
    <br/>

    <output>Materia:
        <br/>
        <br/>
        <?php  
            $query = "SELECT * FROM materias";
            $result = pg_query($conn, $query);
        ?>
        <select name="id_materia">
            <?php  
                while($fila = pg_fetch_assoc($result)):
                    $idmateria = $fila['idmateria'];
                    $nombremateria = $fila['nombremateria'];
                    echo "<option value=$idmateria>$nombremateria</option>";
                endwhile;
            ?>
        </select>
    </output>

    <br/>
    <br/>

  <button  name="update">Actualizar</button>

</form>