package lab7.pkg2;

public class Lab72 {
    public static void main(String[] args) {
        figura[] papa = new figura[6];//arreglo de las figuras trigonometricas(alberga todo tipo de objetos)
        cuadrado cuadradito = new cuadrado("cuadradito",5);//objeto cuadrado
        triangulo triangulito = new triangulo("triangulito",5,6);//objeto triangulo
        circulo circulito = new circulo("circulito",5);//objeto circulo
        cubo cubito = new cubo("cubito",5);//objeto cubo
        tetraedro tetraedrito = new tetraedro("tetraedrito",5);//objeto tetraedro
        esfera esferita = new esfera("esferita",5);//objeto esfera
        papa[0]=cuadradito;
        papa[1]=triangulito;
        papa[2]=circulito;
        papa[3]=cubito;
        papa[4]=tetraedrito;
        papa[5]=esferita;
        for(int i=0;i<6;i++){
            papa[i].mostrarDescripcion();
            if(papa[i].tipo==2){//si es un objeto de tipo "figura bidimensional"
                System.out.println("Mi area es: "+papa[i].obtenerArea());
            }else{//si es un objeto de tipo "figura tridimensional"
                System.out.println("Mi area es: "+papa[i].obtenerArea());
                System.out.println("Mi volumen es: "+papa[i].obtenerVolumen());
            }
            System.out.println("");//espacio para que salga mas bonito
        }
    }   
}