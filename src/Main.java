//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Atraccion montanaRusa = new MontanaRusa("El Krater");
        montanaRusa.mostrarNombre();       // Salida: Atracción: El krater
        montanaRusa.abrir();               // Salida: La montaña rusa está abierta al público.
        montanaRusa.cerrar();              // Salida: La montaña rusa está cerrada.
        ((Mantenible) montanaRusa).realizarMantenimiento(); // Salida: Realizando mantenimiento a la montaña rusa.

        ToboganAcuatico toboganAcuatico = new ToboganAcuatico("Tronquitos");
        toboganAcuatico.mostrarNombre();   // Salida: Atracción: Tronquitos
        toboganAcuatico.abrir();           // Salida: El tobogán acuático está abierto al público.
        toboganAcuatico.llenarAgua();      // Salida: El tobogán acuático se está llenando de agua.
        toboganAcuatico.cerrar();          // Salida: El tobogán acuático está cerrado.
        toboganAcuatico.realizarMantenimiento(); // Salida: Realizando mantenimiento al tobogán acuático.
    }
}