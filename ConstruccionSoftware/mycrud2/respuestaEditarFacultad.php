<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

    
        $idfac= $_GET['cod_facultad'];
        $nombre = $_POST['valornombrefaculedit'];
       
       


        $query = "UPDATE Facultad set   nombre_facultad= '$nombre'
    
        WHERE cod_facultad = '$idfac' ";

        mysqli_query($conn, $query);

       header("Location: listarFacultad.php");


    }

?>