<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$id_semestre= $_POST['id_semestre'];
$id_pensum = $_POST['id_pensum'];
$id_materia = $_POST['id_materia'];

//Consulta SQL
$sql= "INSERT INTO materiapemsums (id_semestre, id_pensum, id_materia) VALUES ('$id_semestre','$id_pensum','$id_materia')";

//ejecutar 
$result = pg_query($conn, $sql);

if(!$result) {
  die("Error");
}

header("Location: listarMateriaPensum.php");
exit();
?>
