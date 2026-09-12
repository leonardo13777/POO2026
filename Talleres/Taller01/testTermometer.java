import java.util.Scanner;

public class testTermometer {
    public static void main(String[] args) {
        //Exportar el scaner
        Scanner scanner = new Scanner(System.in);
        //Crear una instancia
        thermometer t1 = new thermometer(0.0);
        System.out.println("Ingrese la temperatura");
        double newTemperature = scanner.nextDouble();
        //Usar los metodos de control(Setters y Getters) 
        t1.settemperature(newTemperature);
        System.out.println("La temperatura en este momento es " + t1.gettemperature());
        scanner.close();
    }
}
