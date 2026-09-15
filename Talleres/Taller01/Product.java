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
            return false;
        }
    }
    public boolean setStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
            return true;
        } else {
            return false;
        }
    }
    public boolean setPrice(double price){
        if (price > 0) {
            this.price = price;
            return true;
        } else {
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
