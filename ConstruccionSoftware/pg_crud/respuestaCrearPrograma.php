<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idprograma = $_POST['valoridprograma'];
        $nombprograma= $_POST['valornombreprog'];
       
        $pg = "INSERT INTO programas (idprograma, nombreprograma ) 
        VALUES ('$idprograma', '$nombprograma')";

         $result = pg_query($conn, $pg);
         header("Location: listarProgramas.php");
        

         exit();



?>