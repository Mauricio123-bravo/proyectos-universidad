<?php include("db.php")?>


<?php

        $dvid= $_GET['id_distriversion'];

        //consulta pg

        $pg = "DELETE FROM DistriVersion WHERE id_distriversion=$dvid";

        //ejecutar Query

         $result = pg_query($conn, $pg);


         if(!$result){

                die("Error");

         }

         header("Location: listardistriversionW.php");
         
         exit();


?>