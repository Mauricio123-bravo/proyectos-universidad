//declaramos variables

var operandoa;
var operandob;
var operacion;

function init(){

//variables

var resultado = document.getElementById('resultado');
var reset = document.getElementById('Nuevo');
var suma = document.getElementById('Suma');
var resta = document.getElementById('Resta');
var multiplicacion = document.getElementById('Multiplicacion');
var division = document.getElementById('Division');
var igual = document.getElementById('Igual');
var cero = document.getElementById('Cero');
var uno = document.getElementById('Uno');
var dos = document.getElementById('Dos');
var tres = document.getElementById('Tres');
var cuatro = document.getElementById('Cuatro');
var cinco = document.getElementById('Cinco');
var seis = document.getElementById('Seis');
var siete = document.getElementById('Siete');
var ocho = document.getElementById('Ocho');
var nueve = document.getElementById('Nueve');



//eventos de click
cero.onclick = function(e){

    resultado.textContent = resultado.textContent + "0";
}

uno.onclick = function(e){

    resultado.textContent = resultado.textContent + "1";
}

dos.onclick = function(e){

    resultado.textContent = resultado.textContent + "2";
}

tres.onclick = function(e){

    resultado.textContent = resultado.textContent + "3";
}

cuatro.onclick = function(e){

    resultado.textContent = resultado.textContent + "4";
}

cinco.onclick = function(e){

    resultado.textContent = resultado.textContent + "5";
}

seis.onclick = function(e){

    resultado.textContent = resultado.textContent + "6";
}

siete.onclick = function(e){

    resultado.textContent = resultado.textContent + "7";
}

ocho.onclick = function(e){

    resultado.textContent = resultado.textContent + "8";
}

nueve.onclick = function(e){

    resultado.textContent = resultado.textContent + "9";
}

reset.onclick = function(e){

    resetear();
}

suma.onclick = function(e){

    operandoa = resultado.textContent;
    operacion="+";
    limpiar();

}

resta.onclick = function(e){

    operandoa = resultado.textContent;
    operacion="-";
    limpiar();

}

multiplicacion.onclick = function(e){

    operandoa = resultado.textContent;
    operacion="*";
    limpiar();


}

division.onclick = function(e){

    operandoa = resultado.textContent;
    operacion="/";
    limpiar();

}

igual.onclick = function(e){

    operandob = resultado.textContent;
    
    resolver();

}

function limpiar(){

    resultado.textContent = "";

}

function resetear(){

    resultado.textContent = "";
    operandoa=0;
    operandob=0;
    operacion="";

}

function resolver(){

    var res = 0;
    switch(operacion){

        case "+":

        res = parseFloat(operandoa)+parseFloat(operandob);
        break;
            
        case "-":

        res = parseFloat(operandoa)-parseFloat(operandob);
        break;

        case "*":

        res = parseFloat(operandoa)*parseFloat(operandob);
        break;

        case "/":

        res = parseFloat(operandoa)/parseFloat(operandob);
        break;
    }

    resetear();

    resultado.textContent = res;


}


function muestraMensaje(){

    var aux = document.getElementById("foo").value;
    var auxDos = document.getElementById("fooD").value;
    console.log(aux);
    console.log(auxDos);
    var result = parseInt(aux)+parseInt(auxDos);
    document.getElementById("re").value = result;


}









}
















