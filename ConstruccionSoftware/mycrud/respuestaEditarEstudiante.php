<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

    
        $idestudiante= $_GET['estudianteid'];
        $nombres = $_POST['valorNombreEdit'];
        $apellidos = $_POST['valorApellidoEdit'];


        $query = "UPDATE estudiante set nombres_estudiantes= '$nombres', apellidos_estudiantes='$apellidos' 
        WHERE estudianteid = '$idestudiante' ";

        mysqli_query($conn, $query);

        header("Location: listarEstudiantes.php");


    }

?>