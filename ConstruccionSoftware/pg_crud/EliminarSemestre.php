<?php include("db.php")?>


<?php

        $semid= $_GET['idsemestres'];

        //consulta pg

        $pg = "DELETE FROM semestres WHERE idsemestres=$semid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listarSemestres.php");
         
         exit();


?>