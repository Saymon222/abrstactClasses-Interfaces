public class MontanaRusa extends Atraccion implements Mantenible{

    public MontanaRusa(String nombre) {
        super(nombre);
    }

    @Override
    void abrir() {
        System.out.println("La montaña rusa está abierta al público.");
    }

    @Override
    void cerrar() {
        System.out.println("La montaña rusa está cerrada.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento a la montaña rusa.");
    }
}

