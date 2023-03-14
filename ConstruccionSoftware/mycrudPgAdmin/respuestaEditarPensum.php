<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<?php

if (isset($_POST['update'])) {
  $idpensums = $_GET['idpensums'];
  $nombrepensum= $_POST['nombrepensum'];
  $valorperidodopensum = $_POST['valorperidodopensum'];
  $idprograma = $_POST['idprograma'];

  $query = "UPDATE pensums set nombrepensum = '$nombrepensum', periodopensum = '$valorperidodopensum', id_programa = '$idprograma' WHERE idpensums = $idpensums";
  pg_query($conn, $query);
  header("Location: listarPensums.php");
}

?>