<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>


<table class="tabla">
    <thead>
        <th>Id </th>
        <th>Nombre</th>
        <th></th>
        <th></th>
    </thead>
    <tbody>
        <?php 
            $query = "SELECT * FROM semestres";
            $result = pg_query($conn, $query);

            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idsemestre'] ?></td>
                    <td><?php echo $row['nombresemestre'] ?></td>
                    <td><a href="formularioEditSemestre.php?idsemestre=<?php echo $row['idsemestre']?>">Editar</a></td>
                    <td><a href="respuestaEliminarSemestre.php?idsemestre=<?php echo $row['idsemestre']?>">Eliminar</a></td>
                </tr>
            <?php } ?>

    </tbody>
</table>

<br/>
<a href="formularioCrearSemestres.php">Crear un semestre</a>