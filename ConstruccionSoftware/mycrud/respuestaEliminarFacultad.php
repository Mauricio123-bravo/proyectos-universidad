<?php include("db.php")?>


<?php

        $facultadid= $_GET['facultadid'];

        //consulta SQL

        $sql = "DELETE FROM facultad WHERE facultadid=$facultadid";

        //ejecutar Query

         $result = mysqli_query($conn, $sql);


         if(!$result){

                die("Error");

         }

         header("Location: listarFacultades.php");
         
         exit();


?>