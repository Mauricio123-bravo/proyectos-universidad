<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $codfacultad = $_POST['valorcodigofacultad'];
        $nomfacultad= $_POST['valornombrefacultad'];
        $idseccional= $_POST['valoridseccional'];
        

        $sql = "INSERT INTO Facultad ( cod_facultad ,nombre_facultad ,idSeccional) 
            VALUES ('$codfacultad', '$nomfacultad',
         '$idseccional')";

         $result = mysqli_query($conn, $sql);
         header("Location: listarFacultad.php");
        

         exit();



?>

