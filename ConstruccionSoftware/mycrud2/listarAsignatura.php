<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<table class="tabla"> 
    <thead>
        <th> Id Asignatura</th>
        <th>Semestre Asignatura </th>
        <th>Nombre Asignatura </th>
        <th>Codigo Asignatura</th>
        <th> Tipo Asignatura </th>
        <th>  Id Docente </th>
        <th></th>
        <th></th>
       

    </thead>

    <tbody>
        <?php 
             $query = "SELECT * FROM Asignaturas INNER JOIN Docente ON Asignaturas.idDocente= Docente.cod_docente";
             $result = mysqli_query($conn, $query);
             
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idAsignatura'] ?></td>
                    <td><?php echo $row['semestreAsignatura'] ?></td>
                    <td><?php echo $row['nombreAsignatura'] ?></td>
                    <td><?php echo $row['codigoAsignatura'] ?></td>
                    <td><?php echo $row['nombres_docente'] ?></td>
                    <td> <a href="formularioEditarAsignaturas.php?idAsignatura=<?php echo $row['idAsignatura'] ?>">Editar</a></td>
                    <td> <a href="respuestaEliminarAsignaturas.php?idAsignatura=<?php echo $row['idAsignatura'] ?>">Eliminar</a></td>
                </tr>
           <?php } ?>
        
    </tbody>
</table>