<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>


<table class="tabla">
    <thead>
        <th>Id </th>
        <th>Nombre</th>
        <th>Referencia</th>
        <th></th>
        <th></th>
    </thead>
    <tbody>
        <?php 
            $query = "SELECT * FROM materias";
            $result = pg_query($conn, $query);

            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idmateria'] ?></td>
                    <td><?php echo $row['nombremateria'] ?></td>
                    <td><?php echo $row['referenciamateria'] ?></td>
                    <td><a href="formularioEditMateria.php?idmateria=<?php echo $row['idmateria']?>">Editar</a></td>
                    <td><a href="respuestaEliminarMateria.php?idmateria=<?php echo $row['idmateria']?>">Eliminar</a></td>
                </tr>
            <?php } ?>

    </tbody>
</table>

<br/>
<a href="formularioCrearMaterias.php">Crear una materia</a>