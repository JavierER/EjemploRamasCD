package boletin18_1;

import java.util.Random;

/**
 *
 * @author Javii
 */
public class ArrayDeNumeros {
    int [] numeros = new int[6];
    
  public void CargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*5+1);
}   
  }
    public void visualizarInverso(){
      for(int i=numeros.length-1;i>=0;i--)
      System.out.println(numeros[i]+" ");
  }   
}