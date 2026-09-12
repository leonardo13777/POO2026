public class thermometer {
    // Atributo 
    private double temperature;
    // Constructor 
    public thermometer (double temperature){
        settemperature(temperature);
    }
    //Control de lectura
    public double gettemperature(){
        return this.temperature;
    }
    public void settemperature(double newtemperature){
        if (newtemperature >= -50 && newtemperature <= 100){
            this.temperature = newtemperature;
        } else{
            System.out.println("Error: la temperatura no esta en el rango definido");
        }
    }
}