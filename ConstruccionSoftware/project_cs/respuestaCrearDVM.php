<?php include("db.php") ?>
<?php include("src/includes/headerMacOs.php")?>


<?php 

       
        $nombredvm= $_POST['valornomdvm'];
        $descripdvm= $_POST['valordescrm'];
        $idsisope= $_POST['valorso'];
       
        $pg = "INSERT INTO DistriVersion (nombredv, descripciondv,idsistema ) 
        VALUES ('$nombredvm', '$descripdvm','$idsisope') ";


         $result = pg_query($conn, $pg);
         header("Location: listardistriversionM.php");
        

         exit();



?>

