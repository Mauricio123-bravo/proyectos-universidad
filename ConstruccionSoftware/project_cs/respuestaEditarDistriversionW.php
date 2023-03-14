<?php include("db.php")?>

<?php

  

    if(isset($_POST['update'])){

        $iddvt= $_GET['id_distriversion'];
        $nombre= $_POST['valornomdvedit'];
        $des = $_POST['valordescredit'];
       
       


        $query = "UPDATE DistriVersion set   nombredv= '$nombre', descripciondv= '$des'
        WHERE id_distriversion = '$iddvt' ";

         pg_query($conn, $query);

       header("Location: listardistriversionW.php");


    }

?>