<?php include("db.php")?>
<?php include("src/includes/header.php")?>


<br/>

<table class="tabla"> 
    <thead>
        <th> Codigo Faultad</th>
        <th>Nombre Facultad</th>
        <th>Id Seccional</th>
        <th> Direccion Seccional</th>
        <th></th>
        <th></th>
       
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM Facultad INNER JOIN Seccional ON Facultad.idSeccional= Seccional.idSeccional";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['cod_facultad'] ?></td>
                    <td><?php echo $row['nombre_facultad'] ?></td>
                    <td><?php echo $row['nombreSeccional'] ?></td>
                    <td><?php echo $row['direccionSeccional'] ?></td>
                    <td> <a href="formularioEditarFacultad.php?cod_facultad=<?php echo $row['cod_facultad'] ?>">Editar</a></td>
                    <td> <a href="respuestaEliminarFacultad.php?cod_facultad=<?php echo $row['cod_facultad'] ?>">Eliminar</a></td>
                
                   
                </tr>
           <?php } ?>
        
    </tbody>
</table>