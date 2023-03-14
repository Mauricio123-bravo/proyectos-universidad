<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idmateria = $_POST['valoridmateria'];
        $nombremateria= $_POST['valorsnommateria'];
        $referenciamateria= $_POST['valorrefmateria'];
       
        $pg = "INSERT INTO materias (idmaterias, nombremateria , referenciamateria ) 
        VALUES ('$idmateria', '$nombremateria','$referenciamateria')";

         $result = pg_query($conn, $pg);
         header("Location: listarMaterias.php");
        

         exit();



?>

