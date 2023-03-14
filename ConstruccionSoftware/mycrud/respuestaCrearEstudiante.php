<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idestudiante = $_POST['valoridestudiante'];
        $nombreestudiante= $_POST['valornombreestudiante'];
        $apellidoestudiante= $_POST['valorapellidoestudainte'];
        $codigoestudiante= $_POST['valorcodigoestudiante'];
        $estadoestudiante= $_POST['valorestadoestudiante'];
        $idfacultad= $_POST['valoridfacultad'];

        $sql = "INSERT INTO estudiante (estudianteid, nombres_estudiantes ,
         apellidos_estudiantes ,codigo ,estado, idfacultad) VALUES ('$idestudiante', '$nombreestudiante',
         '$apellidoestudiante', ' $codigoestudiante', '$estadoestudiante', '$idfacultad')";

         $result = mysqli_query($conn, $sql);
         header("Location: listarEstudiantes.php");
        

         exit();



?>

