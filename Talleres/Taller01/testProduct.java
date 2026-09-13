import java.util.Scanner;

public class testProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product("product", 1, 1);
        String nameInput;
        do {
            System.out.print("Ingrese el nombre del producto: ");
            nameInput = scanner.nextLine();
        } while (!product.setName(nameInput));
        int stockInput;
        do {
            System.out.print("Ingrese la cantidad en stock: ");
            stockInput = scanner.nextInt();
        } while (!product.setStock(stockInput));
        double priceInput;
        do {
            System.out.print("Ingrese el precio de el producto: ");
            priceInput = scanner.nextDouble();
        } while (!product.setPrice(priceInput));
        System.out.println("--- EL PRODUCTO AGREGADO ES: ---");
        System.out.println("El nombre de el producto es: " + product.getname());
        System.out.println("La cantidad en stock es: " + product.getstock() + " cajas");
        System.out.println("El precio del producto es: " + product.getprice() + "$");
    }
}
