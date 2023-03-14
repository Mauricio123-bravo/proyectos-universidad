<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $idmp= $_GET['idmateriapensum'];
        $idpen= $_POST['valoridpemedit'];
        $idmat = $_POST['valordmatedit'];
        $idsem = $_POST['valoridsemedit'];
       
       


        $query = "UPDATE materiaspensums set   id_pensum= '$idpen', id_materia= '$idmat', id_semestre=' $idsem'
        WHERE idmateriapensum = '$idmp' ";

        mysqli_query($conn, $query);

       header("Location: listarMateriasPensum.php");


    }

?>