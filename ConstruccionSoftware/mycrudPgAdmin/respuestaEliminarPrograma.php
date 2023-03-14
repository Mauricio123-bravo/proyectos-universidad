<?php include("db.php") ?>

<?php

$idprograma= $_GET['idprograma'];

//Consulta SQL
$sql= "DELETE FROM programas WHERE  idprograma = $idprograma";

//ejecutar
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarProgramas.php");
exit();
?>
