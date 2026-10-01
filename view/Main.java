package view;

import java.util.Scanner;
import domain.*;
public class Main {

    public static  Scanner scanner = new Scanner(System.in);
    public static Shape [] shapes = new Shape[100];
    public static int totalShapes = 0;
    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println( " --- Ingrese una de las opciones --- ");
            System.out.println( " --- 1. Crear una nueva figura (Cuadrado, Rectangulo, Triangulo, Circulo, Elipse). --- ");
            System.out.println( " --- 2. Mostrar informacion sobre las figuras almacenadas --- ");
            System.out.println( " --- 3. Mostrar informacion sobre una figura especifica --- ");
            System.out.println( " --- 4. Calcular y mostrar el area total y el perimetro de todas las figuras almacenadas --- ");
            System.out.println( " --- 5.  Salir --- ");

            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        makeShape();
                        break;
                    case 2:
                        printInformationAll();
                        break;
                    case 3:
                        printInformationOne();
                        break;
                    case 4:
                        printTotalAreaPerimeter();
                        break;
                    case 5:
                        System.out.println(" --- Gracias por usar el programa. Saliendo ... --- ");
                        break;
                    default:
                        System.out.println(" --- Opcion fuera de rango ( 1 - 5 ). Vuelva a intentarlo --- ");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println( " --- Error: debe ingresar un numero valido --- ");
            } 

        } while (option != 5);
    }
    public static void makeShape(){
        if (totalShapes >= shapes.length) {
            System.out.println( " --- Error: No hay espacio para guardar las figuras --- ");
            return;
        }

        try {
            System.out.println( " --- ¿Que figura desea crear? --- ");
            System.out.println( " --- 1. Cuadrado --- ");
            System.out.println( " --- 2. Rectangulo --- ");
            System.out.println( " --- 3. Triangulo --- ");
            System.out.println( " --- 4. Circulo --- ");
            System.out.println( " --- 5. Elipse --- ");
        
            int tipo = Integer.parseInt(scanner.nextLine());

            System.out.println( " --- Ingrese el ID de la figura. este debe ser de 3 digitos. Ejemplo 001 o 255. --- ");
            String id = scanner.nextLine();

            if (id == null || !id.matches("\\d{3}")) {
                System.out.println(" --- Formato de ID invalido: debe ser de 3 digitos --- ");
                return;
            }

            if (validedId(id)){
                System.out.println(" --- El id ya esta ocupado use otro --- ");
                return;
            }

            
            System.out.println( " --- Ingrese la cordenada x --- ");
            float x = Float.parseFloat(scanner.nextLine());

            System.out.println( " --- Ingrese la cordenada y --- ");
            float y = Float.parseFloat(scanner.nextLine());

            Shape newShape = null;
            switch (tipo) {
                case 1:
                    System.out.println( " --- Ingrese la longitud de el lado de el cuadrado --- ");
                    float side = Float.parseFloat(scanner.nextLine());
                    newShape = new Square(x, y, id, side);
                    break;
                case 2:
                    System.out.println( " --- Ingrese la altura de el rectangulo --- ");
                    float heigt = Float.parseFloat(scanner.nextLine());
                    System.out.println( " --- Ingrese la base de el rectangulo --- ");
                    float base = Float.parseFloat(scanner.nextLine());
                    newShape = new Rectangle(x, y, id, heigt, base);
                    break;
                case 3:
                    System.out.println( " --- Ingrese la longitud de el primer lado --- ");
                    float side1 = Float.parseFloat(scanner.nextLine());
                    System.out.println( " --- Ingrese la longitud de el segundo lado --- ");
                    float side2 = Float.parseFloat(scanner.nextLine());
                    System.out.println( " --- Ingrese la longitud de el tercer lado --- ");
                    float side3 = Float.parseFloat(scanner.nextLine());
                    newShape = new triangle(x, y, id, side1, side2, side3);
                    break;
                case 4:
                    System.out.println( " --- Ingrese la longitud de el radio --- ");
                    float radio = Float.parseFloat(scanner.nextLine());
                    newShape = new Circle(x, y, id, radio);
                    break;
                case 5:
                    System.out.println( " --- Ingrese la longitud de el primer radio --- ");
                    float radio1 = Float.parseFloat(scanner.nextLine());
                    System.out.println( " --- Ingrese la longitud de el segundo radio --- ");
                    float radio2 = Float.parseFloat(scanner.nextLine());
                    newShape = new Ellipce(x, y, id, radio1, radio2);
                    break;
                default:
                    System.out.println( " --- Opcion no valida --- ");
                    return;
            }

            shapes[totalShapes] = newShape;
            totalShapes++;
            System.out.println( " --- Figura agregada con exito --- ");

            } catch (NumberFormatException e) {
                System.out.println( " --- Error: Debe ingresar un numero valido --- ");
            } catch (IllegalArgumentException e){
                System.out.println( " --- Error de validacion: ---");
                System.out.println(e.getMessage());
            }
    }
    public static void printInformationAll(){
        if (totalShapes == 0 ){
            System.out.println(" --- La lista esta vacia por el momento --- ");
            return ;
        }
        System.out.println( " --- Figurar Creadas --- ");
        for (int i = 0; i < totalShapes; i++){
            printInformationOnly(i);
        }
    }
    public static void  printInformationOne(){
        if (totalShapes == 0 ){
            System.out.println(" --- La lista esta vacia por el momento --- ");
            return ;
        }
        System.out.println( " --- Ingrese el id de la figura --- ");
        String idSearch = scanner.nextLine();
        if ( idSearch == null || !idSearch.matches("\\d{3}")){
            System.out.println( " --- Formato de ID invalido: debe ser de 3 digitos --- ");
            return ;
        }
        for ( int i = 0; i < totalShapes; i++){
            if (shapes[i].getId().equals(idSearch)){
                printInformationOnly(i);
                return;
            }
        } System.out.println( " --- No se ha encontrado la figura --- ");
    }
    public static void printTotalAreaPerimeter(){
        if (totalShapes == 0 ){
            System.out.println(" --- La lista esta vacia por el momento --- ");
            return ;
        }
        double totalPerimeter = 0;
        double totalArea = 0;
        for (int i = 0;i < totalShapes; i++){
            totalPerimeter += shapes[i].getPerimeter();
            totalArea += shapes[i].getArea();
        }
        System.out.println( " --- El perimetro total de las figuras es: " + String.format("%.2f", totalPerimeter) + " ---");
        System.out.println( " --- El area total de las figuras es: " + String.format("%.2f", totalArea) + " ---");
    }

    public static  void printInformationOnly(int a){
        System.out.println( " --- ID: " + shapes[a].getId() + " ---");
        System.out.println( " --- Coordenadas: " + shapes[a].getX() + ", " + shapes[a].getY() + " ---");
        System.out.println( " --- Area: " + shapes[a].getArea() + " ---");
        System.out.println( " --- Perimetro: " + shapes[a].getPerimeter() + " ---");
        System.out.println( " --- ---");
    }
    public static boolean validedId(String id){
        for (int i = 0; i < totalShapes; i++){
            if (shapes[i].getId().equals(id)){
                return true;
            } 
        }
        return false;
    }
}
