<?php include("db.php")?>
<?php include("src/includes/headerWindows.php")?>

<br/>
<body>

<ul class="nav justify-content-center" style="font-size:24px">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="listardistriversionW.php">Distribuciones o Versiones</a>
  </li>

  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="listarprovedorW.php">Provedor</a>
  </li>

</ul>


 <br/>  
 <br/>  
 
</body>



    <thead>

       
    <h4>Descripcion</h4>
        
    <br/>
    </thead>
    <tbody>
        <?php 
            $query = "SELECT * FROM sistemaOperativo where nombresis='Windows' ";
            $result = pg_query($conn, $query);
            
            while($row = pg_fetch_array($result)) { ?>
                <tr>
                   
                    <td><?php echo $row['descripcionsis'] ?></td>
                   
                
                </tr>
           <?php } ?>
        
    </tbody>
    <footer>

<p style="font-size:20px; text-align:center">Mauricio Bravo Cepeda, estudiante de quinto semestre <br/>
Ingenieria de Sistemas de la Universidad Santo Tomas de Colombia</p> 

</footer>
