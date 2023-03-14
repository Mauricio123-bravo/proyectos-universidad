<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idsemestre = $_POST['valoridsem'];
        $nomsemestre= $_POST['valornombresem'];
       
        $pg = "INSERT INTO semestres (idsemestres, nombresemestre ) 
        VALUES ('$idsemestre', '$nomsemestre')";

         $result = pg_query($conn, $pg);
         header("Location: listarSemestres.php");
        

         exit();



?>