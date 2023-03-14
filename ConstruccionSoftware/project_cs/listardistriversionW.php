<?php include("db.php")?>
<?php include("src/includes/headerWindows.php")?>

<br/>


 
 <nav class="nav" style="font-size:24px">
  
  <a class="nav-link" href="formularioCrearDVW.php">Crear distribucion/version</a>
  
</nav>


<br/>


 <table class="table table-dark table-striped">
    <thead>

        <th>Id Distribucion/version</th>
        <th>Nombre </th>
        <th>Descripcion</th>
        <th>Id sistema</th>
        <th>Editar</th>
        <th>Eliminar</th>
      
    </thead>

    <tbody>
        <?php 
            
            $query = "SELECT * FROM distriversion dis INNER JOIN sistemaoperativo sis ON sis.idsistemao = dis.idsistema WHERE dis.idsistema=1";
           
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                    <td><?php echo $row['id_distriversion'] ?></td>
                    <td><?php echo $row['nombredv'] ?></td>
                    <td><?php echo $row['descripciondv'] ?></td>
                    <td><?php echo $row['nombresis'] ?></td>    
                    <td> <a style="color:#FFFF00" href="formularioEditarDistriversionW.php?id_distriversion=<?php echo $row['id_distriversion'] ?>">Editar</a></td>
                    <td> <a style="color:red" href="EliminarDistriversionW.php?id_distriversion=<?php echo $row['id_distriversion'] ?>">Eliminar</a></td>
            
                
                </tr>
           <?php } ?>
        
    </tbody>
</table>
<hr> 

<strong >SI CONOCE OTRA DISTRIBUCION O VERSION Y DESEA CREARLA PUEDE HACERLO DANDO CLICK EN CREAR <strong>

<?php 


