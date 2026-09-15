import java.util.Scanner;

public class testProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("product", 1, 1);
        String nameInput;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            nameInput = scanner.nextLine();
            if(product.setName(nameInput) == false){
                System.out.println("Error: El nombre no puede estar vacio");
            }
        } while (!product.setName(nameInput));
        int stockInput;
        do {
            System.out.print("Ingrese la cantidad en stock: ");
            stockInput = scanner.nextInt();
            if (product.setStock(stockInput) == false){
                System.out.println("Error: El valor no puede ser negativo ");
            }
        } while (!product.setStock(stockInput));
        double priceInput;
        do {
            System.out.print("Ingrese el precio de el producto: ");
            priceInput = scanner.nextDouble();
            if (product.setPrice(priceInput) == false) {
                System.out.println("Error: El precio debe ser mayor a 0");
            }
        } while (!product.setPrice(priceInput));
        System.out.println("--- EL PRODUCTO AGREGADO ES: ---");
        System.out.println("El nombre de el producto es: " + product.getname());
        System.out.println("La cantidad en stock es: " + product.getstock() + " cajas");
        System.out.println("El precio del producto es: " + product.getprice() + "$");
        scanner.close();
    }
}
