<?php include("db.php") ?>

<?php

$idpensums= $_GET['idpensums'];

//Consulta SQL
$sql= "DELETE FROM pensums WHERE  idpensums = $idpensums";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarPensums.php");
exit();
?>
