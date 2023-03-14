<?php include("db.php") ?>
<?php include("src/includes/headerLinux.php")?>


<?php 

        $nombredvl= $_POST['valornomdvl'];
        $descripdvl= $_POST['valordescrl'];
        $idsisope= $_POST['valorso'];
       
        $pg = "INSERT INTO DistriVersion (nombredv, descripciondv,idsistema ) 
        VALUES ('$nombredvl', '$descripdvl','$idsisope') ";

         $result = pg_query($conn, $pg);
         header("Location: listardistriversionL.php");
        

         exit();

?>

