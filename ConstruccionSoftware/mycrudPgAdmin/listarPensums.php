<?php include("db.php")?>
<?php include("src/includes/header.php") ?>

<br/>


<table class="tabla">
    <thead>
        <th>Id </th>
        <th>Nombre Pensum</th>
        <th>Periodo Pensum</th>
        <th>Nombre Programa</th>
        <th></th>
        <th></th>
    </thead>
    <tbody>
        <?php 
            $query = "SELECT * FROM pensums pen INNER JOIN programas prog ON pen.id_programa = prog.idprograma";
            $result = pg_query($conn, $query);

            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idpensums'] ?></td>
                    <td><?php echo $row['nombrepensum'] ?></td>
                    <td><?php echo $row['periodopensum'] ?></td>
                    <td><?php echo $row['nombreprograma'] ?></td>
                    <td><a href="formularioEditPensum.php?idpensums=<?php echo $row['idpensums']?>">Editar</a></td>
                    <td><a href="respuestaEliminarPensums.php?idpensums=<?php echo $row['idpensums']?>">Eliminar</a></td>
                </tr>
            <?php } ?>

    </tbody>
</table>

<br/>
<a href="formularioCrearPensums.php">Crear un pensum</a>