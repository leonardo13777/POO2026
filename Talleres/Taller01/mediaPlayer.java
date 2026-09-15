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
    public void setincrease(){
            this.volumen = volumen + 5;
    }
    public  void setdecrease(){
            this.volumen = volumen - 5;
    }
    public void setplaying(){
        if (this.playBackState == false){
            this.playBackState = true;
        }
    }
    public void setstopped(){
        if (this.playBackState == true){
            this.playBackState = false;
        }
    }
    public int getvolumen(){
        return this.volumen;
    }
    public boolean getplayBackStatee(){
        return this.playBackState;
    }
}
