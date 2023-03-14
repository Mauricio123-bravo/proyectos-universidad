<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

if (isset($_POST['update'])) {
  $idmateria = $_GET['idmateria'];
  $nombremateria= $_POST['nombremateria'];
  $referenciamateria = $_POST['referenciamateria'];

  $query = "UPDATE materias set nombremateria = '$nombremateria', referenciamateria = '$referenciamateria' WHERE idmateria = $idmateria";
  pg_query($conn, $query);
  header("Location: listarMaterias.php");
}

?>