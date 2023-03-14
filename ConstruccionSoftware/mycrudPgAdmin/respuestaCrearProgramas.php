<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$nombrePrograma= $_POST['nombrePrograma'];

//Consulta SQL
$sql= "INSERT INTO programas (nombreprograma) VALUES ('$nombrePrograma')";

//ejecutar mysql_query
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarProgramas.php");
exit();
?>
