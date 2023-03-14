<?php include("db.php") ?>
<?php include("src/includes/header.php") ?>

<br/>

<form class="form" action="respuestaEditarPensum.php?idpensums=<?php echo $_GET['idpensums']; ?>" method="POST">
  <h2>Actualizar Pensum</h2>

  <output>Nombre:
        <br/>
        <br/>
        <input type="text" placeholder="Escribe los Nombres..." id="valornombrepensum" name="nombrepensum"></input>
    </output>

    
    <br/>
    <br/>

    <output>Periodo:
        <br/>
        <br/>
        <select name="valorperidodopensum" id="periodopensum">
            <option value="2018">2018</option>
            <option value="2019">2019</option>
            <option value="2020">2020</option>
            <option value="2021">2021</option>
        </select>
    </output>
    
    <br/>
    <br/>

    <output>Programa:
        <br/>
        <br/>
        <?php  
            $query = "SELECT * FROM programas";
            $result = pg_query($conn, $query);
        ?>
        <select name="idprograma">
            <?php  
                while($fila = pg_fetch_assoc($result)):
                    $idprograma = $fila['idprograma'];
                    $nombreprograma = $fila['nombreprograma'];
                    echo "<option value=$idprograma>$nombreprograma</option>";
                endwhile;
            ?>
        </select>
    </output>

    <br/>
    <br/>

  <button  name="update">Actualizar</button>

</form>