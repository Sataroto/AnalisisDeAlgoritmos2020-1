/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamico;

import ordenamiento.Burbuja;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class TSP {
    int[][] array;
    boolean[] lista={false, false, false, false, false, false, false, false, false, false};
    String Sentencia="";
    String[] ciudades={"a","b","c","d","e","f","g","h","i","j"};
    int camino=0;
    public TSP(int inicio, int[][] array){
        this.array=array;
        int siguiente=inicio;
        int previo;
        this.lista[inicio]=true;
        Sentencia=Sentencia+ciudades[inicio]+"-";
        while(!(lista[0]&&lista[1]&&lista[2]&&lista[3]&&lista[4]&&lista[5]&&lista[6]&&lista[7]&&lista[8]&&lista[9])){
            for(int x=0;x<10;x++){
                    if(!lista[x]){
                        previo=siguiente;
                        siguiente=Menor( siguiente);
                        lista[siguiente]=true;
                        camino+=array[previo][siguiente];
                        Sentencia=Sentencia+ciudades[siguiente]+"-";
                }
            }
            System.out.println();
        }
        System.out.println("El camino es: "+Sentencia);
        System.out.println("El camino de pasos es: "+ camino);
    
    
       }
    public int Menor( int fila){
        int indicemenor=0;
        int numeromenor=1000;
        for(int i=0; i<10;i++)
        {
            if(fila != i){
                if(!lista[i]){
                    if(array[fila][i]<numeromenor){
                        indicemenor=i;
                        numeromenor=array[fila][i];
                        }
                    }
            }
        }
        return indicemenor;
    }
}
