<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

if (isset($_POST['update'])) {
  $idprograma = $_GET['idprograma'];
  $nombrePrograma= $_POST['nombrePrograma'];

  $query = "UPDATE programas set nombreprograma = '$nombrePrograma' WHERE idprograma = $idprograma";
  pg_query($conn, $query);
  header("Location: listarProgramas.php");
}

?>