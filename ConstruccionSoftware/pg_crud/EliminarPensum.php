<?php include("db.php")?>


<?php

        $pensumid= $_GET['idpensums'];

        //consulta pg

        $pg = "DELETE FROM pensums WHERE idpensums=$pensumid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listarPensums.php");
         
         exit();


?>