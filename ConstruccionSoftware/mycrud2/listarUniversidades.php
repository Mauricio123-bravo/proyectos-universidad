<?php include("db.php")?>
<?php include("src/includes/header.php")?>

<br/>

<table class="tabla"> 
    <thead>
        <th> Id Universidad</th>
        <th>Nombre Universidad</th>
        <th>NIT Universidad</th>
    </thead>

    <tbody>
        <?php 
            $query = "SELECT * FROM Universidad";
            $result = mysqli_query($conn, $query);
            
            while($row = mysqli_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['idUniversidad'] ?></td>
                    <td><?php echo $row['nombreUniversidad'] ?></td>
                    <td><?php echo $row['nitUniversidad'] ?></td>
                </tr>
           <?php } ?>
        
    </tbody>
</table>