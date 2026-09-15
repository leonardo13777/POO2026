import java.util.Scanner;;

public class testStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stundet student = new stundet("Persona", 1, 1, 1, 1);
        // Ingreso de datos
        String nameStudentInput;
        do {
            System.out.print("Ingrese el nombre del estudiante: ");
            nameStudentInput = scanner.nextLine();
            if (student.setnameStudent(nameStudentInput)) {
                System.out.println(" --- El nombre no es valido, vuelva a intentarlo --- ");
            }
        } while (!student.setnameStudent(nameStudentInput));
        int studentIdInout;
        do {
            System.out.print("Ingrese el id del estudiante: ");
            studentIdInout = scanner.nextInt();
            if (student.setstudentId(studentIdInout)) {
                System.out.println(" --- El numero no es valido, vuelva a intentarlo --- ");
            }
        } while (!student.setstudentId(studentIdInout));
        double qualification1Int;
        do {
            System.out.print("Ingrese la primera calificacion: ");
            qualification1Int = scanner.nextDouble();
            if (student.setqualification1(qualification1Int)) {
                System.out.println(" --- El valor de la nota es invalido, vuelva a intentarlo --- ");
            }
        } while (!student.setqualification1(qualification1Int));
        double qualification2Int;
        do {
            System.out.print("Ingrese la segunda calificacion: ");
            qualification2Int = scanner.nextDouble();
            if (student.setqualification2(qualification2Int)) {
                System.out.println(" --- El valor de la nota es invalido, vuelva a intentarlo --- ");
            }
        } while (!student.setqualification2(qualification2Int));
        double qualification3Int;
        do {
            System.out.print("Ingrese la tercera calificacion: ");
            qualification3Int = scanner.nextDouble();
            if (student.setqualification3(qualification3Int)) {
                System.out.println(" --- El valor de la nota es invalido, vuelva a intentarlo --- ");
            }
        } while (!student.setqualification3(qualification3Int));
        System.out.println(" ---- Estudiante registrado con exito --- ");
        student.setaverage(qualification1Int, qualification2Int, qualification3Int);
        // Cambio de daatos que sean neccesarios
        int validator = 0;
        while (validator >= 0 && validator <= 5 ) {
            System.out.println(" --- INGRESE UNA OPCION --- ");
            System.out.println(" --- Escriba 1 para consultar informaciondel estudiante --- ");
            System.out.println(" --- Escriba 2 para cambiar el nombre del estudiante --- ");
            System.out.println(" --- Escriba 3 para cambiar la primera nota --- ");
            System.out.println(" --- Escriba 4 para cambiar la segunda nota --- ");
            System.out.println(" --- Escriba 5 para cambiar la tercera nota --- ");
            System.out.println(" --- Escriba cualquier otro numero para terminar diferente a 0, 1, 2, 3, 4, 5 --- ");
            validator = scanner.nextInt();
            scanner.nextLine();
            if ( validator == 1 ){
                System.out.println(" --- El nombre del estudiante es: " + student.getnameStudent()  + " --- ");
                System.out.println(" --- La primera nota es:" + student.getqualification1() + " --- ");
                System.out.println(" --- La segunda nota es: " + student.getqualification2() + " --- ");
                System.out.println(" --- La tercera nota es: " + student.getqualification3() + " --- ");
                System.out.println(" --- El promedio de el estudiante es: " + student.getaverage() + " ---" );
            } else if (validator == 2) {
                System.out.println("Ingrese el nuevo nombre: ");
                nameStudentInput = scanner.nextLine();
                student.setnameStudent(nameStudentInput);
            } else if ( validator == 3 ) {
                System.out.println(" --- Ingrese la nueva nota ---");
                qualification1Int = scanner.nextDouble();
                student.setqualification1(qualification1Int);
                student.setaverage(qualification1Int, qualification2Int, qualification3Int);;
            } else if ( validator == 4 ) {
                System.out.println(" --- Ingrese la nueva nota--- ");
                qualification2Int = scanner.nextInt();
                student.setqualification2(qualification2Int);
                student.setaverage(qualification1Int, qualification2Int, qualification3Int);;
            } else if ( validator == 5 ) {
                System.out.println(" --- Ingrese la nueva nota --- ");
                qualification3Int = scanner.nextInt();
                student.setqualification3(qualification3Int);
                student.setaverage(qualification1Int, qualification2Int, qualification3Int);
                }
        }
    scanner.close();
    }
}