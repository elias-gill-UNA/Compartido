package lab6.pkg1;
import java.util.Scanner;

public class Lab61 {

    public static void main(String[] args) {
        /*arreglo con tamaño 4, porque 4 numeros son los que son necesarios almacenar*/
        int[] arreglo={0,0,0,0};
        int numero=0;
        int contador=0;
        
        while(contador<5){//se le pide al usuario ingresar 5 numeros siempre
            while(numero <= 10 || numero >= 100){//si no esta entre el rango solicitado
                System.out.println("ingrese un valor entre 10 y 100");
                Scanner eleccion = new Scanner(System.in);
                numero = eleccion.nextInt();
                System.out.println("");
            }
            
            if(encontrarDuplicado(arreglo,numero)==0){//si no es duplicado, lo imprimimos
                System.out.println("El numero es: "+numero);
                System.out.println("");
            }
            if(contador!=4){//porque no es necesario seguir cargando valores en el arreglo de duplicados
                arreglo[contador]=numero;
            }
            contador++;//para finalizar la bandera
            numero=0;//para que entre en el while de la linea 12
        }
    }
    
    static int encontrarDuplicado(int[] arreglo,int elemento){//funcion que detecta si hay un numero repetido
        int bandera=0;//bandera que se activa si es un numero duplicado
        for(int i=0;i<arreglo.length;i++){//recorre el arreglo hasta encontrar el valor duplicado
            if(elemento==arreglo[i]){//si encuntra un valor duplicado, ejecuta la linea de abajo
                bandera=1;//si encuntra un valor duplicado activa la bandera
            }
        }
        return bandera;//retorna la bandera
    }
}
