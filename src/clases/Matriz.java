/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matia
 */
public class Matriz {
    
    int matriz[][] = new int[4][];

    public Matriz() {
        matriz[0] = new int[4];
        matriz[1] = new int[3];
        matriz[2] = new int[5];
        matriz[3] = new int[2];
    }
    
    public void armar(){
        
        int index = 0;
        int fila1[] = new int[4];
        int fila2[] = new int[3];
        int fila3[] = new int[5];
        int fila4[] = new int[2];
        
        for(int i = 0; i < 4; i++){
            matriz[0][i] = (int) (Math.random()*100 + 1);
            if(matriz[0][i] % 2 == 0){
                fila1[index] = matriz[0][i];
                index++;
            }
            System.out.print(matriz[0][i] + " ");
        }
        
        System.out.println("");
        index = 0;
        
        for(int i = 0; i < 3; i++){
            matriz[1][i] = (int) (Math.random()*100 + 1);
            if(matriz[1][i] % 2 == 0){
                fila2[index] = matriz[1][i];
                index++;
            }
            System.out.print(matriz[1][i] + " ");
        }
        
        System.out.println("");
        index = 0;
        
        for(int i = 0; i < 5; i++){
            matriz[2][i] = (int) (Math.random()*100 + 1);
            if(matriz[2][i] % 2 == 0){
                fila3[index] = matriz[2][i];
                index++;
            }
            System.out.print(matriz[2][i] + " ");
        }
        
        System.out.println("");
        index = 0;
        
        for(int i = 0; i < 2; i++){
            matriz[3][i] = (int) (Math.random()*100 + 1);
            if(matriz[3][i] % 2 == 0){
                fila4[index] = matriz[3][i];
                index++;
            }
            System.out.print(matriz[3][i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Fila 1 ----> "+ mostrar(fila1));
        System.out.println("Fila 2 ----> "+ mostrar(fila2));
        System.out.println("Fila 3 ----> "+ mostrar(fila3));
        System.out.println("Fila 4 ----> "+ mostrar(fila4));
        
        
    }
    
    public List<Integer> mostrar(int a[]){
        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                lista.add(a[i]);
            }
        }
        return lista;
    }
    
   
    
    
    
    
}
