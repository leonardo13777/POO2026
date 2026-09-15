public class roomReservation {
    private String nameGuest;
    private int roomNumber;
    private int numberNigth;
    private double priceNigth;
    private double totalPrice;
    public  roomReservation(String nameGuest, int roomNumber, int numberNigth, double priceNigth, double totalPrice){
        setnameGuest(nameGuest);
        setroomNumber(roomNumber);
        setnumberNigth(numberNigth);
        setpriceNigth(priceNigth);
        settotalPrice(priceNigth, numberNigth);
    }
    public boolean setnameGuest(String nameGuest){
        if (nameGuest != null && !nameGuest.isEmpty()){
            this.nameGuest = nameGuest;
            return true;
        } else {
            System.out.println("El nombre no es valido Intentalo de nuevo");
            return false;
        }
    }
    public boolean setroomNumber(int roomNumber){
        if (roomNumber > 0 ){
            this.roomNumber = roomNumber;
            return true;
        } else {
            System.out.println("El numero de habitacion es invalido");
            return false;
        }
    }
    public boolean setnumberNigth(int numberNigth){
        if (numberNigth > 0 ){
            this.numberNigth = numberNigth;
            return true;
        } else {
            System.out.println("El numero de noches es invalido");
            return false;
        }
    }
    public boolean setpriceNigth(double priceNigth){
        if (priceNigth > 0){
            this.priceNigth = priceNigth;
            return  true;
        } else {
            System.out.println("El precio de la noche es invalido");
            return false;
        }
    }
    public void settotalPrice(double priceNigth, int numberNigth){
        this.totalPrice = priceNigth * numberNigth;
    }
    public  String getnameGuest(){
        return this.nameGuest;
    }
    public int getroomNumber(){
        return this.roomNumber;
    }
    public int getnumberNigth(){
        return this.numberNigth;
    }
    public double getpriceNigth(){
        return this.priceNigth;
    }
    public double gettotalPrice(){
        return this.totalPrice;
    }
}
