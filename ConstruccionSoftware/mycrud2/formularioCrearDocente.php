<?php include("db.php") ?>
<?php include("src/includes/header.php")?>
<?php include("src/includes/headerDocente.php")?>


<br/>

<form  class="form" action="respuestaCrearDocente.php" method="post" name="frm">

        <h2>Crear Docente:</h2>

        <output> Codigo Docente:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el codigo..." id="codigodocente" name="valorcodigodocente"></input>

       
        <br/>
        <br/>
        </output>

        <output> Documento :
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el documento..." id="documentodocente" name="valordocumentodocente"></input>
        
        <br/>
        <br/>
        </output>

        <output> Nombre:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el nombre..." id="nombredocente" name="valornombredocente"></input>

        <br/>
        <br/>
        </output>

    
        <output> Apellido:
        <br/>
        <br/>

        <input type="text"  placeholder="Escribe el apellido..." id="apellidodocente" name="valorapellidodocente"></input>

        <br/>
        <br/>
        </output>

        <output> Tipo:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el tipo..." id="tipodocente" name="valortipodocente" ></input>

        <br/>
        <br/>
        </output>

        <output> Codigo Facultad:
        <br/>
        <br/>

        <input type="number"  placeholder="Escribe el codigo..." id="codigofacultad" name="valorcodigofacultad"></input>

        <br/>
        <br/>
        </output>


        <button type="submit">Registrar</button>





</form>