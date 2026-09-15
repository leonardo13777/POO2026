public class banckAccount {
    private String nameHolder;
    private int numberAccount;
    private double balance;

    public banckAccount(String nameHolder,int numberAccount, double balance){
        setnameHolder(nameHolder);
        setnumberAccount(numberAccount);
        setbalance(balance);
    }
    public boolean setnameHolder(String nameHolder){
        if (nameHolder != null && !nameHolder.isEmpty()){
            this.nameHolder = nameHolder;
            return true;
        } else {
            return false;
        }
    }
    public boolean setnumberAccount(int numberAccount){
        if (numberAccount > 0  && numberAccount <= 99999){
            this.numberAccount = numberAccount;
            return true;
        } else {
            return false;
        }
    }
    public boolean setbalance(double balance){
        if(balance >= 0){
            this.balance = balance;
            return true;
        } else {
            return false;
        } 
    }
    public boolean setwithdraw(double extract){
        if (extract > 0 && extract < balance){
            this.balance = balance - extract;
            return true;
        } else {
            return false;
        }
    }
    public boolean setdeposit(double worthAdd){
        if(worthAdd > 0){
            this.balance = balance + worthAdd;
            return true;
        } else {
            return false;
        }
    }
    public String getnameholder(){
        return this.nameHolder;
    }
    public int getnumberAccount(){
        return  this.numberAccount;
    }
    public double getbalance(){
        return this.balance;
    }
}
