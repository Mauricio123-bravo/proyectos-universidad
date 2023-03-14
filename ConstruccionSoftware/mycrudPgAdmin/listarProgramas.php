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
            $query = "SELECT * FROM programas";
            $result = pg_query($conn, $query);

            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idprograma'] ?></td>
                    <td><?php echo $row['nombreprograma'] ?></td>
                    <td><a href="formularioEditPrograma.php?idprograma=<?php echo $row['idprograma']?>">Editar</a></td>
                    <td><a href="respuestaEliminarPrograma.php?idprograma=<?php echo $row['idprograma']?>">Eliminar</a></td>
                </tr>
            <?php } ?>

    </tbody>
</table>

<br/>
<a href="formularioCrearProgramas.php">Crear un programa</a>