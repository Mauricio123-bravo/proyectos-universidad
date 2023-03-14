<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Materia Pensum</th>
        <th>Id Pensum</th>
        <th>Id Materia</th>
        <th>Id Semestre</th>
        <th></th>
        <th></th>
      
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM materiaspensums matpen 
            INNER JOIN materias mat ON mat.idmaterias = matpen.id_materia
            INNER JOIN semestres sem ON sem.idsemestres = matpen.id_semestre
            INNER JOIN pensums pen ON pen.idpensums = matpen.id_pensum;";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idmateriapensum'] ?></td>
                    <td><?php echo $row['id_pensum'] ?></td>
                    <td><?php echo $row['id_materia'] ?></td>
                    <td><?php echo $row['id_semestre'] ?></td>
                    <td> <a href="formularioEditarMateriaPensum.php?idmateriapensum=<?php echo $row['idmateriapensum'] ?>">Editar</a></td>
                    <td> <a href="EliminarMateriaPensum.php?idmateriapensum=<?php echo $row['idmateriapensum'] ?>">Eliminar</a></td>

                
                </tr>
           <?php } ?>
        
    </tbody>
</table>