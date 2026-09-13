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
    public boolean setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
            return true;
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
            return false;
        }
    }
    public boolean setStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
            return true;
        } else {
            System.out.println("Error: El valor no puede ser negativo ");
            return false;
        }
    }
    public boolean setPrice(double price){
        if (price > 0) {
            this.price = price;
            return true;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0");
            return false;
        }
    }
    public String getname(){
        return this.name;
    }
    public int getstock(){
        return this.stock;
    }
    public double getprice(){
        return this.price;
    }
}
