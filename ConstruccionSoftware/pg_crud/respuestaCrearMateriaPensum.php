<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idmateriapensum = $_POST['valoridmatpen'];
        $id_pensum= $_POST['valoridpensum'];
        $id_materia= $_POST['valoridmateria'];
        $id_semestre= $_POST['valoridsemestre'];
       
        $pg = "INSERT INTO materiaspensums (idmateriapensum, id_pensum , id_materia, id_semestre ) 
        VALUES ('$idmateriapensum', '$id_pensum','$id_materia')";

         $result = pg_query($conn, $pg);
         header("Location: listarMateriasPensum.php");
        

         exit();



?>
