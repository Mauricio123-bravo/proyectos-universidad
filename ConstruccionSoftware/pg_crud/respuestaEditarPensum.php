<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $idpen= $_GET['idpensums'];
        $nom= $_POST['valornompensumedit'];
        $per = $_POST['valorperpensumedit'];
    
       
       


        $query = "UPDATE pensums set   nombrepensums= '$nom', periodopensum= '$per'
        WHERE idpensums = '$idpen' ";

        mysqli_query($conn, $query);

       header("Location: listarPensums.php");


    }

?>