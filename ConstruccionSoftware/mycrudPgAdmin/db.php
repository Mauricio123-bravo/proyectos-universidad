<?php
session_start();

//cadena de conexion con postgresql
$conexion = "host='localhost' dbname= 'phpPostgresCrudExample' port='5432' user='user_java' password='0000'";

//funcion pg_conect
$conn = pg_connect($conexion) or die ("Error en la conexion".pg_last_error());
//echo "Conexion Exitosa <hr />";


?>