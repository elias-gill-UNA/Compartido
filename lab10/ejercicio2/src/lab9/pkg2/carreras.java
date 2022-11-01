package lab9.pkg2;

public class carreras {
    public class piloto implements Runnable {
        String nombre;

        // constructor
        public piloto(String nombre) {
            this.nombre = nombre;
            this.run();
        }

        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                System.out.println("");
            }
        }
    }

    // carrera de autos
    public static void main(String[] args) {
    }
}
