<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>

        <th>Id Pensum</th>
        <th>Nombre Pensum</th>
        <th>Periodo pensum</th>
        <th>Id programa</th>
        <th></th>
        <th></th>
      
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM pensums pens INNER JOIN programas prog ON prog.idprograma = pens.id_programa;";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idpensums'] ?></td>
                    <td><?php echo $row['nombrepensums'] ?></td>
                    <td><?php echo $row['periodopensum'] ?></td>
                    <td><?php echo $row['id_programa'] ?></td>
                    <td> <a href="formularioEditarPensum.php?idpensums=<?php echo $row['idpensums'] ?>">Editar</a></td>
                    <td> <a href="EliminarPensum.php?idpensums=<?php echo $row['idpensums'] ?>">Eliminar</a></td>

                
                </tr>
           <?php } ?>
        
    </tbody>
</table>