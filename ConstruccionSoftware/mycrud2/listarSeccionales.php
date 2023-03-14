<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>
        <th> Id Seccional</th>
        <th>Direccion Seccional</th>
        <th>Nombre Seccional</th>
        <th>Id Universidad</th>
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM Seccional";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idSeccional'] ?></td>
                    <td><?php echo $row['direccionSeccional'] ?></td>
                    <td><?php echo $row['nombreSeccional'] ?></td>
                    <td><?php echo $row['idUniversidad'] ?></td>
                </tr>
           <?php } ?>
        
    </tbody>
</table>