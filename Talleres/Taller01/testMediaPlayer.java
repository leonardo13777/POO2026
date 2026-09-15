import java.util.Scanner;

public class testMediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mediaPlayer mediaplayer = new mediaPlayer(0, false);
        int validator = 0;
        while (validator >= 0 && validator <= 5 ) {
            System.out.println( " --- INGRESE UNA OPCION DE LO QUE QUIERE HACER --- ");
            System.out.println(" --- Ingrese 1 para conocer el estado del reproductor ---");
            System.out.println(" --- Ingrese 2 para aumentar el volumen ---");
            System.out.println(" --- Ingrese 3 para disminuir el columen ---");
            System.out.println(" --- Ingrese 4 para reproducir ---");
            System.out.println(" --- Ingrese 5 para pausar ---");
            System.out.println(" --- Ingrese un numero diferente a: 0, 1, 2, 3, 4, 5 para apagar el reproductor ---");
            validator = scanner.nextInt();
            if (validator == 1 ){
                System.out.println(" --- El estado del reproducto es: ---");
                if (mediaplayer.getplayBackStatee() == true) {
                    System.out.println(" --- El reproductor se encuentra reproduciendo ---");
                } else {
                    System.out.println(" --- El reproductor se encuentra pausado ---");
                }
                System.out.println(" --- El volumen del reproductor es:" + mediaplayer.getvolumen() + " ---");
            } else if ( validator == 2) {
                if (mediaplayer.getvolumen() < 100) {
                    mediaplayer.setincrease();
                    System.out.println(" ---   SE SUBIO EL VOLUMEN CON EXITO ---");
                } else {
                    System.out.println(" --- NO ES POSIBLE SUBIR MAS EL VOLUMEN ---");
                }
            } else if (validator == 3 ) {
                if (mediaplayer.getvolumen() > 0 ){
                    mediaplayer.setdecrease();
                    System.out.println(" --- SE BAJO EL VOLUMEN CON EXITO ---");
                } else {
                    System.out.println(" --- NO ES POSIBLE BAJAR MAS EL VOLUMEN ---");
                }
            } else if (validator == 4) {
                if (mediaplayer.getplayBackStatee() == false ){
                    mediaplayer.setplaying();
                    System.out.println(" --- SE EMPEZO A REPRODDUCIR CON EXITO ---");
                } else {
                    System.out.println(" --- NO ES POSIBLE REALIZAR LA ACCION ---");
                }
            } else if (validator == 5 ) {
                if (mediaplayer.getplayBackStatee() == true ){
                    mediaplayer.setstopped();
                    System.out.println(" --- SE PAUSO EL REPRODUCTO CON EXITO ---");
                } else {
                    System.out.println(" --- NO ES POSIBLE REALIZAR LA ACCION ---");
                }
            }
        }
    scanner.close();
    }
}
