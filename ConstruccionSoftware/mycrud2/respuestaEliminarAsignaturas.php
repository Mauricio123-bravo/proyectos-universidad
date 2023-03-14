<?php include("db.php")?>


<?php

        $asignaturaid= $_GET['idAsignatura'];

        //consulta SQL

        $sql = "DELETE FROM Asignaturas WHERE idAsignatura=$asignaturaid";

        //ejecutar Query

         $result = mysqli_query($conn, $sql);


         if(!$result){

                die("Error");

         }

         header("Location: listarAsignatura.php");
         
         exit();


?>