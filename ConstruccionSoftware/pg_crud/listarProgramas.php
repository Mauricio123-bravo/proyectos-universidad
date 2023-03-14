<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Porgrama</th>
        <th>Nombre Programas</th>
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
                    <td> <a href="formularioEditarPrograma.php?idprograma=<?php echo $row['idprograma'] ?>">Editar</a></td>
                    <td> <a href="EliminarPrograma.php?idprograma=<?php echo $row['idprograma'] ?>">Eliminar</a></td>

                
                </tr>
           <?php } ?>
        
    </tbody>
</table>