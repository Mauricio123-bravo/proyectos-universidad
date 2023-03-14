<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

if (isset($_POST['update'])) {
  $idsemestre = $_GET['idsemestre'];
  $nombreSemestre= $_POST['nombreSemestre'];

  $query = "UPDATE semestres set nombresemestre = '$nombreSemestre' WHERE idsemestre = $idsemestre";
  pg_query($conn, $query);
  header("Location: listarSemestres.php");
}

?>