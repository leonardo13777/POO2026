package domain;

public class Circle extends Shape{
    
    // Atributos
    private double radio;

    // Metodos override

    @Override 

    public void setperimeter(){
        this.perimeter = 2 * Math.PI * this.radio; 
    }

    public void  setarea(){
        this.area = Math.PI * this.radio * this.radio;
    }

    // Setters and Getters
    public void setRadio(float radio){
        if(radio <= 0){ 
            throw new IllegalArgumentException("El valor de el radio sebe de ser mayor a 0");
        }
        this.radio = radio;
    }


    // Constructor
    public Circle(float x, float y, String id, float radio){
        super(x, y, id);
        setRadio(radio);
        setperimeter();
        setarea();
    }
}
