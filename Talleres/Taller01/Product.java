public class Product {
    //Atributos
    private String name; 
    private int  stock;
    private double price;
    //Constructor
    public  Product(String name, int stock, double price){
        setName(name);
        setStock(stock);
        setPrice(price);
    }
    public void setName(String name){
        if (name != null){
            this.name = name;
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
        }
    }
    public void setStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El valor no puede ser negativo ");
        }
    }
    public void  setPrice(double price){
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0");
        }
    }
}
