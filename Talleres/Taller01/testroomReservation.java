import java.util.Scanner;

public class testroomReservation {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        roomReservation roomReservation = new roomReservation("Persona", 1, 1, 1, 1);
        // Ingreso de para la reservacion de la habitacion
        String nameInput;
        do {
            System.out.print("Escriba el nombre de la persona que reservo: ");
            nameInput = scaner.nextLine();
            if (roomReservation.setnameGuest(nameInput) == false) {
                System.out.println("El nombre no es valido Intentalo de nuevo");
            }
        } while (!roomReservation.setnameGuest(nameInput));
        int numberRoomInput;
        do {
            System.out.print("Escriba el numero de la habitacion a reservar: ");
            numberRoomInput = scaner.nextInt();
            if (roomReservation.setroomNumber(numberRoomInput)) {
                System.out.println("El numero de habitacion es invalido");
            }
        } while (!roomReservation.setroomNumber(numberRoomInput));
        int numberNigthInput;
        do {
            System.out.print("Ingrese el numero de noches a reservar: ");
            numberNigthInput = scaner.nextInt();
            if (roomReservation.setnumberNigth(numberNigthInput)) {
                System.out.println("El numero de noches es invalido");
            }
        } while (!roomReservation.setnumberNigth(numberNigthInput));
        double priceNigthInput;
        do {
            System.out.print("Ingrese el precio por noche: ");
            priceNigthInput = scaner.nextDouble();
            if (roomReservation.setpriceNigth(priceNigthInput)) {
                System.out.println("El precio de la noche es invalido");
            }
        } while (!roomReservation.setpriceNigth(priceNigthInput));
        //Calcular el costo total de la reservacion
        roomReservation.settotalPrice(priceNigthInput, numberNigthInput);
        System.out.println(" --- RESERVACION EXITOSA --- ");
        //Consulta y cambios de informacion
        int validator = 0;
        while (validator >= 0 && validator <= 4 ) {
            System.out.println(" --- INGRESE UNA OPCION --- ");
            System.out.println(" --- Escriba 1 para consultar informacion --- ");
            System.out.println(" --- Escriba 2 para cambiar el precio por noche --- ");
            System.out.println(" --- Escriba 3 para cambiar el numero de noches --- ");
            System.out.println(" --- Escriba 4 para cambiar el numero de habitacion --- ");
            System.out.println(" --- Escriba cualquier otro numero para terminar diferente a 0,1,2,3,4 --- ");
            validator = scaner.nextInt();
            //Consulta de informacion y cambio de datos
            if ( validator == 1 ){
                System.out.println(" --- La reservacion esta a nombre de: " + roomReservation.getnameGuest() + " --- ");
                System.out.println(" --- La habitacion reservada es la numero: "  + roomReservation.getroomNumber() + " --- ");
                System.out.println(" --- El numero de noches que reservo es: " + roomReservation.getnumberNigth() + " --- ");
                System.out.println(" --- El precio por noche es : " + roomReservation.getpriceNigth() + "$ --- ");
                System.out.println(" --- El costo total de la reserva es: " + roomReservation.gettotalPrice() + "$ ---" );
            } else if ( validator == 2 ) {
                System.out.println(" --- Ingrese el nuevo precio por noche ---");
                priceNigthInput = scaner.nextDouble();
                roomReservation.setpriceNigth(priceNigthInput);
                roomReservation.settotalPrice(priceNigthInput, numberNigthInput);
            } else if ( validator == 3 ) {
                System.out.println(" --- Ingrese el nuevo numero de noches --- ");
                numberNigthInput = scaner.nextInt();
                roomReservation.setnumberNigth(numberNigthInput);
                roomReservation.settotalPrice(priceNigthInput, numberNigthInput);
            } else if ( validator == 4 ) {
                System.out.println(" --- Ingrese el nuevo nummero de habitacion --- ");
                numberRoomInput = scaner.nextInt();
                roomReservation.setroomNumber(numberNigthInput);
                }
            }
        scaner.close();
        }
        
}

