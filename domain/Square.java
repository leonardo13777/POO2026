package domain;

public class Square extends Shape {
    
    // Atributos

    private float side;

    // Metodos

    @Override

    public void setperimeter(){
        this.perimeter = this.side * 4;
    }

    @Override 
    public void setarea(){
        this.area = this.side * this.side;
    }

    //Setters and Getters

    public void setside(float side){
        if(side <= 0){
            throw new IllegalArgumentException("El valor es invalido, este debe ser mayor a cero");
        }
        this.side = side;
    }

    // Constructor
    public Square(float x, float y, String id, float side) {
        super(x, y, id);
        setside(side);
        setperimeter();
        setarea();
    }
    
}
