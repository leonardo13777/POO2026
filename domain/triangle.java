package domain;

public class triangle extends Shape {

    // Atributos

    private float side1;
    private float side2;
    private float side3;
    
    // Metodos override

    @Override 
    public void setperimeter(){
        this.perimeter = side1 + side2 + side3;
    }
    public void setarea(){
        float S = (side1 + side2 + side3)/2; 
        this.area = Math.sqrt(S*(S - side1)*(S -side2 )*( S - side3));
    }

    //Setters and Getters

    public void setSide(float side){
        if (side <= 0){
            throw new IllegalArgumentException("El valor debe de ser mayor a 0");
        }
        this.side1 = side;
    }

    public void setSide2(float side){
        if (side <= 0){
            throw new IllegalArgumentException("El valor debe de ser mayor a 0");
        }
        this.side2 = side;
    }

    public void setSide3(float side){
        if (side <= 0){
            throw new IllegalArgumentException("El valor debe de ser mayor a 0");
        }
        this.side3 = side;
    }

    // Constructor

    public triangle(float x, float y, String id, float side1, float side2, float side3){
        super(x, y, id);
        setSide(side1);
        setSide2(side2);
        setSide3(side3);
        setperimeter();
        setarea();
    }
    // Metodos de soporte
    public void setValidador(float side1, float side2, float side3){
        if ((side1 + side2) > side3) {
            throw new IllegalArgumentException("La longitud de los lados es invalido. no se puede crear un triangulo");
        }
        if ((side1 + side3) > side2) {
            throw new IllegalArgumentException("La longitud de los lados es invalido. no se puede crear un triangulo");
        }
        if ((side2 + side3) > side1) {
            throw new IllegalArgumentException("La longitud de los lados es invalido. no se puede crear un triangulo");
        }
    }
}
