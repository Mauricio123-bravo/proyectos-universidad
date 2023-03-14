<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$nombrepensum= $_POST['nombrepensum'];
$valorperidodopensum = $_POST['valorperidodopensum'];
$idprograma = $_POST['idprograma'];

//Consulta SQL
$sql= "INSERT INTO pensums (nombrepensum, periodopensum, id_programa) VALUES ('$nombrepensum','$valorperidodopensum','$idprograma')";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarPensums.php");
exit();
?>
