package lab52;
import java.util.Scanner;

public class Lab52 {    
    
    public static void main(String[] args) {
        int bandera=0;//si el usuario quere dejar de meter valores
        int ganancias[] = {0,0,0,0,0};
        Scanner eleccion = new Scanner(System.in);
        int precios[] = {10000,15000,20000,25000,30000};
        int opcion;
        while(bandera==0){
            System.out.println("ingrese: "+ "\n1. Para cargar las ganancias"+"\n2. Para notificar las ganancias"+"\n3. Para salir");
            opcion = eleccion.nextInt();
            
            while(opcion!=1 && opcion!=2 && opcion!=3){//si el usuario mete un valor no valido para la bandera
                System.out.println("ingrese una opcion valida");
                opcion = eleccion.nextInt();
            }
            
            switch(opcion){
                case 1:
                    cargar(ganancias);
                    break;
                case 2:
                    mostrar(ganancias,precios);
                    break;
                case 3:
                    bandera=1;
                    break;
            }
            
            cls();
        }
        System.out.println("El programa termino");
    }
    
    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E){
            System.out.println("\n");
	}
    }
    
    static void cargar(int[] ganancias){
        int numero,vendidos;
        Scanner numeroProducto = new Scanner(System.in);
        Scanner cantidadVendida = new Scanner(System.in);
        System.out.println("ingrese el numero del producto");
        numero=numeroProducto.nextInt();
        System.out.println("ingrese el monto que se vendio");
        vendidos=cantidadVendida.nextInt();
        switch(numero){
            case 1:
                ganancias[0]=ganancias[0]+vendidos;
                break;
            case 2:
                ganancias[1]=ganancias[1]+vendidos;
                break;
            case 3:
                ganancias[2]=ganancias[2]+vendidos;
                break;
            case 4:
                ganancias[3]=ganancias[3]+vendidos;
                break;
            case 5:
                ganancias[4]=ganancias[4]+vendidos;
                break;
            default:
                System.out.println("El producto no existe");
                break;
        }System.out.println("");
    }
    
    static void mostrar(int[] ganancias,int[] precios){
        int bandera=0,contador=0;
        while(bandera==0){
            System.out.println("La cantidad de productos"+(contador+1)+" que se vendieron son "+ganancias[contador]+" y las ganancias fueron "+ganancias[contador]*precios[contador]);
            contador++;
            if(contador==5){
                bandera=1;
            }
        }
        System.out.println("");
    }
    
}
