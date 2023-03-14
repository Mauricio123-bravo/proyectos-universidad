<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

$nombres = '';
$apellidos= '';

if (isset($_POST['update'])) {
  $idmateriapensum = $_GET['idmateriapensum'];
  $id_semestre= $_POST['id_semestre'];
  $id_pensum = $_POST['id_pensum'];
  $id_materia = $_POST['id_materia'];

  $query = "UPDATE materiapemsums set id_semestre = '$id_semestre', id_pensum = '$id_pensum', id_materia = '$id_materia' WHERE idMateriapensum = $idmateriapensum";
  pg_query($conn, $query);
  header("Location: listarMateriaPensum.php");
}

?>