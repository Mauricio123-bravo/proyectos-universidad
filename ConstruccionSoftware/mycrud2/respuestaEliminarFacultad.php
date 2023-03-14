<?php include("db.php")?>


<?php

        $facultadid= $_GET['cod_facultad'];

        //consulta SQL

        $sql = "DELETE FROM Facultad WHERE cod_facultad=$facultadid";

        //ejecutar Query

         $result = mysqli_query($conn, $sql);


         if(!$result){

                die("Error");

         }

         header("Location: listarFacultad.php");
         
         exit();


?>