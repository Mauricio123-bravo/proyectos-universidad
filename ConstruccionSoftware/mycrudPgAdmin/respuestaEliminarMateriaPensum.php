<?php include("db.php") ?>

<?php

$idmateriapensum= $_GET['idmateriapensum'];

//Consulta SQL
$sql= "DELETE FROM materiapemsums WHERE  idMateriapensum = $idmateriapensum";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarMateriaPensum.php");
exit();
?>
