<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$nombreSemestre= $_POST['nombreSemestre'];

//Consulta SQL
$sql= "INSERT INTO semestres (nombresemestre) VALUES ('$nombreSemestre')";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarSemestres.php");
exit();
?>
