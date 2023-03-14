<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>


<table class="tabla">
    <thead>
        <th>Id</th>
        <th>Nombre Semestre</th>
        <th>Nombre Pensum</th>
        <th>Nombre Materia</th>
        <th></th>
        <th></th>
    </thead>
    <tbody>
        <?php 
            $query = "SELECT * FROM materiapemsums matpen INNER JOIN semestres semes ON matpen.id_semestre =
            semes.idsemestre INNER JOIN pensums pen ON matpen.id_pensum = pen.idpensums
            INNER JOIN materias mat ON matpen.id_materia = mat.idmateria";
            $result = pg_query($conn, $query);

            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idmateriapensum'] ?></td>
                    <td><?php echo $row['nombresemestre'] ?></td>
                    <td><?php echo $row['nombrepensum'] ?></td>
                    <td><?php echo $row['nombremateria'] ?></td>
                    <td><a href="formularioEditMateriaPensum.php?idmateriapensum=<?php echo $row['idmateriapensum']?>">Editar</a></td>
                    <td><a href="respuestaEliminarMateriaPensum.php?idmateriapensum=<?php echo $row['idmateriapensum']?>">Eliminar</a></td>
                </tr>
            <?php } ?>

    </tbody>
</table>

<br/>
<a href="formularioCrearMateriaPensum.php">Crear una materia relacionada a un pensum</a>