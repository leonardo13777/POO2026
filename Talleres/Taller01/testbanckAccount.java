import java.util.Scanner;

public class testbanckAccount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        banckAccount banckAccount = new banckAccount("Persona", 1, 1);

        String nameImput;
        do {
            System.out.print("Ingrese su nombre completo: ");
            nameImput = scanner.next();
        } while (!banckAccount.setnameHolder(nameImput));
        scanner.nextLine();
        int numberAccountInput;
        do {
            System.out.print("Ingrese el numero de cuenta de 5 números: ");
            numberAccountInput = scanner.nextInt();
        } while (!banckAccount.setnumberAccount(numberAccountInput));
        scanner.nextLine();
        double balanceInput;
        do {
            System.out.print("Escribe el saldo de su cuenta: ");
            balanceInput = scanner.nextDouble(); 
        } while (!banckAccount.setbalance(balanceInput));

        System.out.println("La persona titular de la cuenta es: " + banckAccount.getnameholder());
        System.out.println("El número de cuenta de la persona es: " + banckAccount.getnumberAccount());
        System.out.println("El saldo de su cuenta es: " + banckAccount.getbalance());

        int validator;

        System.out.print("Ingrese 1 para hacer retiros y depositos o 0 para salir: ");
        scanner.nextLine();
        validator = scanner.nextInt();
        int condition;
        double depositInput;
        double extractInput;
        while (validator == 1) {
            System.out.print("Escriba 1 para depositos o 2 para retiros y 3 para salir: ");
            condition = scanner.nextInt();
            if (condition == 1 ){
                System.out.print("Escriba el deposito que quiere hacer a su cuenta: ");
                depositInput = scanner.nextDouble();
                if (banckAccount.setdeposit(depositInput)){
                System.out.println(" --- Deposito Exitoso --- ");
                System.out.println("--- Su nuevo saldo es: " + banckAccount.getbalance() + " --- ");
                } else {
                    System.out.println(" --- Valor invalido no fue posible hacer el deposito --- ");
                }
            } else if (condition == 2) {
                System.out.print("Escriba el valor que quiere retirar: ");
                extractInput = scanner.nextDouble();
                if (banckAccount.setwithdraw(extractInput)){
                System.out.println(" --- Retiro Exitoso --- ");
                System.out.println(" --- Su nuevo saldo: " + banckAccount.getbalance() + " --- ");
                } else {
                    System.out.println(" --- No fue posible hacer el retiro saldo insuficiente --- ");
                }
            } else if ( condition == 3){
                break;
            }
            System.out.print("Quiere seguir con el deposito o retiro? pon 1 para SI o 2 para No: ");
            validator = scanner.nextInt();
        }
        scanner.close();
    }
}
