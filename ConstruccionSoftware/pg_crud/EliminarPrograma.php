<?php include("db.php")?>


<?php

        $progid= $_GET['idprograma'];

        //consulta pg

        $pg = "DELETE FROM programas WHERE idprograma=$progid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listarProgramas.php");
         
         exit();


?>