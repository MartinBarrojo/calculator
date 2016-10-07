"use strict";
var addend1 = 0;

function addition()
{
	// Leer el valor que tiene el input
	var addend2 = Number(document.getElementById('bf-input').value);
	
	// Llamar al servicio Addition y el resultado mostrarlo en el resultado
    addend1 = addend1 + addend2;
	document.getElementById('bf-input').value = addend1;
	
	
}

function presionarBoton(nro)
{
	document.getElementById('bf-input').value = Number(document.getElementById('bf-input').value + '' + nro);
}

document.getElementById('addition').addEventListener('click', addition);