<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Materias</th>
        <th>Nombre Materia</th>
        <th>Referencia Materia</th>
        <th></th>
        <th></th>
        
      
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM materias";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idmaterias'] ?></td>
                    <td><?php echo $row['nombremateria'] ?></td>
                    <td><?php echo $row['referenciamateria'] ?></td>
                    <td> <a href="formularioEditarMateria.php?idmaterias=<?php echo $row['idmaterias'] ?>">Editar</a></td>
                    <td> <a href="EliminarMateria.php?idmaterias=<?php echo $row['idmaterias'] ?>">Eliminar</a></td>
            
                    </tr>
           <?php } ?>
        
    </tbody>
</table>