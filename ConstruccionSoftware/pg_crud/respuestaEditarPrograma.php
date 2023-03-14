<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $idprog= $_GET['idprograma'];
        $nom= $_POST['valornombreprogedit'];
       
    
       
       


        $query = "UPDATE pensums set   nombreprograma= '$nom'
        WHERE idprograma = '$idprog' ";

        mysqli_query($conn, $query);

       header("Location: listarProgramas.php");


    }

?>