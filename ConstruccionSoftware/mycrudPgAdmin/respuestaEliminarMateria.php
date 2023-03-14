<?php include("db.php") ?>

<?php

$idmateria= $_GET['idmateria'];

//Consulta SQL
$sql= "DELETE FROM materias WHERE  idmateria = $idmateria";

//ejecutar mysql_query
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarMaterias.php");
exit();
?>
