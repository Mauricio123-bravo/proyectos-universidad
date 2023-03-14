<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Estudiante</th>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Codigo</th>
        <th>Id Facultad</th>
        <th></th>
        <th></th>
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM estudiante";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['estudianteid'] ?></td>
                    <td><?php echo $row['nombres_estudiantes'] ?></td>
                    <td><?php echo $row['apellidos_estudiantes'] ?></td>
                    <td><?php echo $row['codigo'] ?></td>
                    <td><?php echo $row['idfacultad'] ?></td>
                    <td> <a href="formularioEditarEstudiante.php?estudianteid=<?php echo $row['estudianteid'] ?>">Editar</a></td>
                    <td> <a href="respuestaEliminarEstudiante.php?estudianteid=<?php echo $row['estudianteid'] ?>">Eliminar</a></td>
                    

                </tr>
           <?php } ?>
        
    </tbody>
</table>