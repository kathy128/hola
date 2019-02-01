/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadorbsbbbh;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ComparadorBSBBBH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] V = new int[10000];
        int cont = 0, n, valTemp, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de elementos en el vector");
        n = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < n; i++) {
            V[i] = i;
        }
       System.out.println("Valor a encontrar por Secuencial");
       valor = sc.nextInt();
       Secuencial(V,n,valor);
       System.out.println("Valor a  encontrar por Binaria");
       valor = sc.nextInt();
       Binaria(V,n,valor);
       System.out.println("Valor a  encontrar por Hash");
       valor = sc.nextInt();
       Hash(V,n,valor);
    }
    
static void Secuencial(int V[],int n, int valor ){
        int cont,nis,valTemp;
        cont=0;
        nis=0;   
        valTemp = 0;
        nis=nis+4;
        while (valTemp == 0 && cont < n) {
            if (V[cont] == valor) {
                System.out.println("Valor encontrado por Secuencial en posición: " + cont);
                valTemp = 1;
                nis=nis+2;
            } else {
                cont++;
                nis=nis+1;
            }
        }

        if (valTemp == 0) {
            System.out.println("Valor no se encuentra en vector");
        }
        System.out.println("Instrtucciones Secuencial="+nis);
    }

static void Binaria(int V[],int n, int valor){
        int mid,bot,top,sw,nib;
        nib=0;
        bot=0;
        top=n-1;
        sw=0;
        nib=nib+5;
        while (bot <= top && sw == 0) {
            mid = (top + bot) / 2;
            nib=nib+1;
            if (V[mid] == valor) {
                System.out.println("Valor encontrado por Binaria en posición:" + mid);
                sw=1;
                nib=nib+2;
            } else if (valor < V[mid]) {
                top = mid - 1;
                nib=nib+1;
            } else {
                bot = mid + 1;
                nib=nib+1;
            }
        }
        if (sw==0) {
            System.out.println("No se encontró el valor deseado");
            nib=nib+1;
        }
        System.out.println("Número de instrucciones por Búsqueda Binarioa "+nib);
    }
static void Hash(int V[],int n,int valor){
    int nih;
    nih=0;
    if(V[valor]==valor){
        System.out.println("Por Hash el elemento"+V[valor]+" está en "+valor);
        nih=nih+1;
    }else{
        System.out.println("Elemento no encontrado por Hash "+valor);
        nih=nih+1;
    }
    System.out.println("Numero de instrucciones por Búsqueda Hash "+nih);
    

}
}

        
        
        
        
        
        
        

