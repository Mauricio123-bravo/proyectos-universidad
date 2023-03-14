<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $idfacultad = $_POST['valoridfacultad'];
        $nombrefacultad= $_POST['valornombrefacultad'];
        

        $sql = "INSERT INTO facultad ( facultadid , nombre_facultad ) VALUES ('$idfacultad', ' $nombrefacultad')";

         $result = mysqli_query($conn, $sql);
         header("Location: listarFacultades.php");
        

         exit();



?>

