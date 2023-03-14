<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

    
        $iddoc= $_GET['cod_docente'];
        $nombre = $_POST['valornombredocedit'];
        $apellido = $_POST['valorapellidodocedit'];
        $tip = $_POST['valortipodocedit'];
        
       


        $query = "UPDATE Docente set   nombres_docente= '$nombre', apellidos_docente= '$apellido',
         tipoDocente= '$tip'
        WHERE cod_docente = '$iddoc' ";

        mysqli_query($conn, $query);

       header("Location: listarDocente.php");


    }

?>