public class mediaPlayer {
    private int volumen;
    private boolean playBackState;
    public mediaPlayer(int volumen, boolean playBackState){
        this.volumen = 0;
        this.playBackState = false;
        setincrease();
        setdecrease();
        setplaying();
        setstopped();
    }
    public boolean setincrease(){
        if ( this.volumen < 100) {
            this.volumen = volumen + 5;
            return true;
        } else {
            return false;
        } 
    }
    public  boolean setdecrease(){
        if (this.volumen > 0 ) {
            this.volumen = volumen - 5;
            return true;
        } else {
            return false;
        }
    }
    public boolean setplaying(){
        if (this.playBackState == false){
            this.playBackState = true;
            return true;
        } else {
            return false;
        }
    }
    public boolean setstopped(){
        if (this.playBackState == true){
            this.playBackState = false;
            return true
        } else {
            return false;
        }
    }
    public int getvolumen(){
        return this.volumen;
    }
    public boolean getplayBackStatee(){
        return this.playBackState;
    }
}
