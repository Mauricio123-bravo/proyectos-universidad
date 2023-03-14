<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idpensum = $_POST['valoridpensum'];
        $nompensums= $_POST['valornombrepensum'];
        $periodopen= $_POST['valorperpensum'];
        $id_programa= $_POST['valoridprog'];
       
        $pg = "INSERT INTO pensums (idpensums, nombrepensums , periodopensum, id_programa ) 
        VALUES ('$idpensum', '$nompensums','$periodopen', '$id_programa')";

         $result = pg_query($conn, $pg);
         header("Location: listarPensums.php");
        

         exit();



?>