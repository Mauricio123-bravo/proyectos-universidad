<?php include("db.php")?>
<?php include("src/includes/headerWindows.php")?>

<br/>


<table class="table table-bordered border-dark">
    <thead>

        
        <th>Nombre </th>
    
        <th>Id sistema</th>
       
      
    </thead>

    <tbody>
        <?php 
            
            $query = "SELECT * FROM Provedor INNER JOIN sistemaOperativo ON Provedor.idsistema= sistemaOperativo.idsistemao
            where nombrepro='Microsoft'";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    
                    <td><?php echo $row['nombrepro'] ?></td>
                    <td><?php echo $row['nombresis'] ?></td>    
                   
                
                </tr>
           <?php } ?>
        
    </tbody>
</table>
<br/>
<img clase="center-block" src="src/imagenes/microsoft.jpg" />



<?php 
         