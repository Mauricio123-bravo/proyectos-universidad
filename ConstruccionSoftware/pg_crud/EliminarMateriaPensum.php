<?php include("db.php")?>


<?php

        $mpid= $_GET['idmateriapensum'];

        //consulta pg

        $pg = "DELETE FROM materiaspensums WHERE idmateriapensum=$mpid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listarMateriasPensum.php");
         
         exit();


?>