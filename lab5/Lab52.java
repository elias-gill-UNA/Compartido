package lab5.pkg2;
import java. util. Scanner;

public class Lab52 {
    
    public static void main(String[] args) {
        Scanner numeroProducto = new Scanner(System.in);
        Scanner cantidadVendida = new Scanner(System.in);
        Scanner seguir = new Scanner(System.in);
        
        int ganancias[] = {0,0,0,0,0};
        
        int precios[] = {10000,15000,20000,25000,30000};
        
        int numero,vendidos,bandera=1,contador=0;
        
        System.out.println("ingrese 1 si quiere continuar, ingrese cualquier otro numero si quiere deternerse");
        bandera=seguir.nextInt();
        
        while(bandera==1){
            
            System.out.println("");
            
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
                    break;
            } 
            
            System.out.println("");
            System.out.println("ingrese 1 si quiere continuar, ingrese cualquier otro numero si quiere deternerse");
            bandera=seguir.nextInt();
        }
        
        bandera=0;
        while(bandera==0){
            System.out.println("La cantidad de productos"+(contador+1)+" que se vendieron son "+ganancias[contador]+" y las ganancias fueron "+ganancias[contador]*precios[contador]);
            contador++;
            if(contador==5){
                bandera=1;
            }
        }
    }
    
}
