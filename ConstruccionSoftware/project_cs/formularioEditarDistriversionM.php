<?php include("db.php")?>
<?php include("src/includes/headerMacOs.php")?>


<br/>
<form class="formulario" action="respuestaEditarDistriversionM.php?id_distriversion=<?php echo $_GET['id_distriversion'] ?>" method="post">


        <h2>Editar Distribucion/Version</h2>

        <output> Nombre:  </output>
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nomdvedit" name="valornomdvedit"></input>

        <br/>
        <br/>
       

    
        <output> Descripcion:</output>
        <br/>
        <br/>

        <input type="text" maxlength="400" placeholder="Escribe la descripcion..." id="descredit" name="valordescredit"></input>

        <br/>
        
        <small>No escriba mas de 400 caracteres en la descripcion por favor</small>


        <br/>
        <br/>
        
        <input type="number" value="3"  readOnly id="idso" name="valorso" style="display:none;"></input>

      
        <br/>
        <br/>

     
        

        <button style="text-align:center"  name="update" >Actualizar</button>

       
        


</form>