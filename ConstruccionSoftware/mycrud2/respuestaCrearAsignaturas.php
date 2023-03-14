<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idasignatura = $_POST['valoridasignatura'];
        $semestre= $_POST['valorsemestreasignatura'];
        $nombreasig= $_POST['valornombreasignatura'];
        $codigoasig= $_POST['valorcodigoasignatura'];
        $tipoasignatura= $_POST['valortipoasignatura'];
        $iddocente= $_POST['valoriddocente'];

        $sql = "INSERT INTO Asignaturas (idAsignatura, semestreAsignatura ,
         nombreAsignatura ,codigoAsignatura ,tipoAsignatura, idDocente) VALUES ('$idasignatura', '$semestre',
         '$nombreasig', ' $codigoasig', '$tipoasignatura', '$iddocente')";

         $result = mysqli_query($conn, $sql);
         header("Location: listarAsignatura.php");
        

         exit();



?>

