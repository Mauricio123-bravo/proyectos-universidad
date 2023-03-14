<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

    
        $idfacultad= $_GET['facultadid'];
        $nombre = $_POST['valorEditNombre'];
        
       


        $query = "UPDATE facultad set nombre= '$nombre' 
        WHERE facultadid = '$idfacultad' ";

        mysqli_query($conn, $query);

       header("Location: listarFacultades.php");


    }

?>