<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $idsem= $_GET['idsemestres'];
        $nom= $_POST['valornombresemedit'];
       
    
       
       


        $query = "UPDATE pensums set   nombresemestre= '$nom'
        WHERE idsemestres = '$idsem' ";

        mysqli_query($conn, $query);

       header("Location: listarSemestres.php");


    }

?>