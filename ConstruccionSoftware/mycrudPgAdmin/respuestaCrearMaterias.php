<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$nombremateria= $_POST['nombremateria'];
$referenciamateria = $_POST['referenciamateria'];

//Consulta SQL
$sql= "INSERT INTO materias (nombremateria, referenciamateria) VALUES ('$nombremateria','$referenciamateria')";

//ejecutar pg_query
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarMaterias.php");
exit();
?>
