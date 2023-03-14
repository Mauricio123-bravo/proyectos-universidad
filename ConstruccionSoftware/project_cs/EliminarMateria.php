<?php include("db.php")?>


<?php

        $materiaid= $_GET['idmaterias'];

        //consulta pg

        $pg = "DELETE FROM materias WHERE idmaterias=$materiaid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listarMaterias.php");
         
         exit();


?>