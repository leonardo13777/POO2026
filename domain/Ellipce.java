package domain;

public class Ellipce extends Shape {
    
    // Atributos
    private double radio1;
    private double radio2;

    // Metodos override

    @Override 
    public void setperimeter(){
        double above = (this.radio1 - this.radio2);  
        double below = (this.radio1 + this.radio2);
        double height = (above * above) / (below * below);
        this.perimeter = (Math.PI * below) * (1 + ( (3 * height)/(10 + Math.sqrt(4 - 3 * height)))); 
    }

    @Override 

    public  void setarea(){
        this.area =Math.PI * radio1 * radio2;
    }

    // Setters and Getters

    public void setRadio(double radio){
        if (radio <= 0 ) {
            throw new IllegalArgumentException("El radio debe de ser mayor a 0");
        }
        this.radio1 = radio;
    }

    public void setRadio2(double radio){
        if (radio <= 0 ) {
            throw new IllegalArgumentException("El radio debe de ser mayor a 0");
        }
        this.radio2 = radio;
    }

    // Constructor

    public Ellipce(float x, float y, String id, double radio1, double radio2){
        super(x, y, id);
        setRadio(radio1);
        setRadio2(radio2);
        setperimeter();
        setarea();
    }

}
