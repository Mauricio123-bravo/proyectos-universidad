<?php include("db.php") ?>
<?php include("src/includes/header.php")?>


<?php 

        $coddocente = $_POST['valorcodigodocente'];
        $docdocente= $_POST['valordocumentodocente'];
        $nombredoc= $_POST['valornombredocente'];
        $apellidodoc= $_POST['valorapellidodocente'];
        $tipodoc= $_POST['valortipodocente'];
        $codigofac= $_POST['valorcodigofacultad'];

        $sql = "INSERT INTO Docente (cod_docente ,documento_docente ,nombres_docente ,
        apellidos_docente ,tipoDocente,cod_facultad ) VALUES ('$coddocente', '$docdocente',
         '$nombredoc', ' $apellidodoc', '$tipodoc', '$codigofac')";

         $result = mysqli_query($conn, $sql);
         header("Location: listarDocente.php");
        

         exit();



?>

