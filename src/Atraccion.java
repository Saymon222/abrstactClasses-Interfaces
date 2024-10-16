abstract class Atraccion {
    private String nombre;

    public Atraccion(String nombre) {
        this.nombre = nombre;
    }

   abstract void abrir();
    abstract void cerrar();

    public void mostrarNombre(){
        System.out.println("Atracción: "+ nombre);


        }
    }

