package domain;

public abstract class Shape {

    // Atributos

    protected  double perimeter;
    protected  double area;
    protected String id;
    protected float x;
    protected float y;

    // Metodos

    public abstract void setperimeter();

    public abstract void setarea();

    // Constructor
    public Shape (float x, float y, String id){
        setId(id);
        setX(x);
        setY(y);
    }

    // Setters and Getters

    public String getId() {
        return id;
    }
    public double getPerimeter(){
        return this.perimeter;
    }
    public double getArea(){
        return this.area;
    }

    public void setId(String id) {
        if (id == null || !id.matches("\\d{3}")){
            throw new IllegalArgumentException("El id debe de contener 3 numeros ejemplo: 001, 999, 450");
        }
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
}
