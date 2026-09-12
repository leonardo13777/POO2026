public class testTermometer {
    public static void main(String[] args) {
        //Crear una instancia
        thermometer t1 = new thermometer(0);
        //Usar los metodos de control(Setters y Getters)
        t1.settemperature(0);
        System.out.println("La temperatura en este momento es " + t1.gettemperature());
    }
}
