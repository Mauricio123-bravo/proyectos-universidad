/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author LENOVO
 */
public class VectorIterator {
	private int[] _vector;
    private int _posicion;
 	
    public VectorIterator(Vector vector) {
        _vector = vector._datos;
        _posicion = 0;
    }
 	 	
    public boolean hasNext(){
        if (_posicion < _vector.length) 
        	return true;
        else
			return false;
    }

    public Object next(){
    	int valor = _vector[_posicion];
    	_posicion++;
    	return valor;
    }
}
