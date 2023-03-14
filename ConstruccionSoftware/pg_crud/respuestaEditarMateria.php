<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $idmat= $_GET['idmaterias'];
        $nombre= $_POST['valornommateriaedit'];
        $ref = $_POST['valorrefmatedit'];
       
       


        $query = "UPDATE materias set   nombremateria= '$nombre', referenciamateria= '$ref'
        WHERE idmaterias = '$idmat' ";

        mysqli_query($conn, $query);

       header("Location: listarMaterias.php");


    }

?>