<?php

        //cadena de conexion a bd de postgreSQL

        $conexion= "host='localhost' dbname='pg_mycrud' port='5432' user='user_node' password='0000'";

        //funcion para conectar a postgres
        $conn= pg_connect($conexion) or die ("error al conectar ".pg_last_error());
?>