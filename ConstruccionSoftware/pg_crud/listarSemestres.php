<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Semestre</th>
        <th>Nombre Semestre</th>
        <th></th>
        <th></th>
      
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM semestres";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idsemestres'] ?></td>
                    <td><?php echo $row['nombresemestre'] ?></td>
                    <td> <a href="formularioEditarSemestre.php?idsemestres=<?php echo $row['idsemestres'] ?>">Editar</a></td>
                    <td> <a href="EliminarSemestre.php?idsemestres=<?php echo $row['idsemestres'] ?>">Eliminar</a></td>

                
                </tr>
           <?php } ?>
        
    </tbody>
</table>