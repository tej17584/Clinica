/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Alejandro
 */
public class ArrayCasillas {
    private Guardia[] array;
    
    public ArrayCasillas(){
        array= new Guardia[2];
    }
    
    public void setIntegrantes(Medico m, Enfermera e){
        array[0]=m;
        array[1]=e;
    }
    public Guardia[] getIntegrantes(){
        return array;
    }
    
}
