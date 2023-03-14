<?php include("db.php") ?>
<?php include("src/includes/headerLinux.php")?>



<br/>

<form  class="formulario" action="respuestaCrearDVL.php" method="post" name="frm">

        <h2>Crear Distribucion/Version</h2>
        <br/>
        <br/>

        
        <output> Nombre:  </output>
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nomdvl" name="valornomdvl"></input>

        <br/>
        <br/>
     

        
        
        <output> Descripcion: </output>
        <br/>
        <br/>

        <input type="text" maxlength="400" placeholder="Escribe la descripcion..." id="descrdvl" name="valordescrl"></input>
        <br/>
        
        <small>No escriba mas de 400 caracteres en la descripcion por favor</small>


        <br/>
        <br/>
        
        <input type="number" value="2"  readOnly id="idso" name="valorso" style="display:none;"></input>

      
        <br/>
        <br/>
        <button type="submit">Guardar</button>





</form>