<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>
        <th> Codigo Docente</th>
        <th>Documento Docente</th>
        <th>Nombre Docente</th>
        <th>Apellido Docente</th>
        <th>Tipo Docente</th>
        <th>Codigo Facultad</th>
        <th></th>
        <th></th>
       

    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM Docente";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['cod_docente'] ?></td>
                    <td><?php echo $row['documento_docente'] ?></td>
                    <td><?php echo $row['nombres_docente'] ?></td>
                    <td><?php echo $row['apellidos_docente'] ?></td>
                    <td><?php echo $row['tipoDocente'] ?></td>
                    <td><?php echo $row['cod_facultad'] ?></td>
                    <td> <a href="formularioEditarDocente.php?cod_docente=<?php echo $row['cod_docente'] ?>">Editar</a></td>
                    <td> <a href="respuestaEliminarDocente.php?cod_docente=<?php echo $row['cod_docente'] ?>">Eliminar</a></td>
                
                </tr>
           <?php } ?>
        
    </tbody>
</table>