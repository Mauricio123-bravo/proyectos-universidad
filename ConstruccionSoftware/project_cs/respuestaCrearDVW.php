<?php include("db.php") ?>
<?php include("src/includes/headerWindows.php")?>


<?php 

        
     
        $nombredvw= $_POST['valornomdvw'];
        $descripdvw= $_POST['valordescrw'];
        $idsisope= $_POST['valorso'];

        $pg = "INSERT INTO DistriVersion (nombredv, descripciondv,idsistema ) 
        VALUES ('$nombredvw', '$descripdvw','$idsisope') ";

         $result = pg_query($conn, $pg);
         header("Location: listardistriversionW.php");
        

         exit();



?>

