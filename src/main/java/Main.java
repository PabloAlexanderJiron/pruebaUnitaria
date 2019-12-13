public class Main {
    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        System.out.println("HOLA MUNDO!");
        System.out.println("La suma de 5 + 5 = "+op.Suma(5, 5));
        System.out.println("La resta de 6 - 5 = "+op.Resta(6, 5));
        System.out.println("La multiplicacion de 5 * 5 = "+op.Multiplicacion(5, 5));
        System.out.println("La division de 20 / 5 = "+op.División(20, 5));
    }
}
