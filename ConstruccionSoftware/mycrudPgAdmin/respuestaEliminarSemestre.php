<?php include("db.php") ?>

<?php

$idsemestre= $_GET['idsemestre'];

//Consulta SQL
$sql= "DELETE FROM semestres WHERE  idsemestre = $idsemestre";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarSemestres.php");
exit();
?>
