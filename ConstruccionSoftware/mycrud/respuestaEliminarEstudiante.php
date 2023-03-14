<?php include("db.php")?>


<?php

        $estudianteid= $_GET['estudianteid'];

        //consulta SQL

        $sql = "DELETE FROM estudiante WHERE estudianteid=$estudianteid";

        //ejecutar Query

         $result = mysqli_query($conn, $sql);


         if(!$result){

                die("Error");

         }

         header("Location: listarEstudiantes.php");
         
         exit();


?>