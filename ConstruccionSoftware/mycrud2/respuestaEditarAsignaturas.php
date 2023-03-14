<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

    
        $idasig= $_GET['idAsignatura'];
        $semes = $_POST['valorsemestreedit'];
        $nombre = $_POST['valornombreasigedit'];
        $tip = $_POST['valortipoasigedit'];
        
       


        $query = "UPDATE Asignaturas set   semestreAsignatura= '$semes', nombreAsignatura= '$nombre',
         tipoAsignatura= '$tip'
        WHERE idAsignatura = '$idasig' ";

        mysqli_query($conn, $query);

       header("Location: listarAsignatura.php");


    }

?>