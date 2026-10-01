package domain;

public class Rectangle extends Shape{
    
    // Atributos 
    private float height;
    private float base;

    // Metodos abstractos

    @Override 
    public void setperimeter(){
        this.perimeter = (this.height * 2) + (this.base * 2);
    }
    
    @Override 
    public void setarea(){
        this.area = this.base * this.height;
    }

    // Setter and Getters

    public void setHeight(float hight){
        if (hight <= 0 ){
            throw new IllegalArgumentException("La altura del rectangulo debe ser mayor a 0");
        }
        this.height = hight;
    }

    public void setBase(float base){
        if (base <= 0 ){
            throw new IllegalArgumentException("La base del rectangulo debe ser mayor a 0");
        }
        this.base = base;
    }

    //Constructor

    public Rectangle(float x, float y, String id, float height, float base) {
        super( x, y, id);
        setBase(base);
        setHeight(height);
        setperimeter();
        setarea();
    }
}
