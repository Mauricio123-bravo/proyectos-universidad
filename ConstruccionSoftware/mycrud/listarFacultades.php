<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Facultad</th>
        <th>Nombre</th>
        <th></th>
        <th></th>
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM facultad";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['facultadid'] ?></td>
                    <td> <?php echo $row['nombre_facultad'] ?> </td>



                    <td> <a href="formularioEditarFacultad.php?facultadid=<?php echo $row['facultadid'] ?>">Editar</a></td>
                    <td> <a href="respuestaEliminarFacultad.php?facultadid=<?php echo $row['facultadid'] ?>">Eliminar</a></td>

                    
                    

                </tr>
           <?php } ?>
        
    </tbody>
</table>