public class ToboganAcuatico extends Atraccion implements Mantenible{
    public ToboganAcuatico(String nombre) {
        super(nombre);
    }


    void abrir() {
        System.out.println("El tobogán acuático está abierto al público.");
    }


    void cerrar() {
        System.out.println("El tobogán acuático está cerrado.");
    }


    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento al tobogán acuático.");
    }

    // Metodo específico de los toboganes acuáticos para llenarse de agua
    public void llenarAgua() {
        System.out.println("El tobogán acuático se está llenando de agua.");
    }
}

