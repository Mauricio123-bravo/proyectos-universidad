<?php include("db.php")?>


<?php

        $docenteid= $_GET['cod_docente'];

        //consulta SQL

        $sql = "DELETE FROM Docente WHERE cod_docente =$docenteid";

        //ejecutar Query

         $result = mysqli_query($conn, $sql);


         if(!$result){

                die("Error");

         }

         header("Location: listarDocente.php");
         
         exit();


?>