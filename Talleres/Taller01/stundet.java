public class stundet {
    private String nameStudent;
    private int studentId;
    private double qualification1;
    private double qualification2;
    private double qualification3;
    private double average;
    public stundet(String nameStundet, int studentId, double qualification1, double qualification2, double qualification3){
        setnameStudent(nameStundet);
        setstudentId(studentId);
        setqualification1(qualification1);
        setqualification2(qualification2);
        setqualification3(qualification3);
        setaverage(qualification1, qualification2, qualification3);
    }
    public boolean setnameStudent(String nameStudent){
        if( nameStudent != null && !nameStudent.isEmpty() ){
            this.nameStudent = nameStudent;
            return true;
        } else {
            return false;
        }
    }
    public boolean setstudentId(int studentId){
        if ( studentId >= 0 && studentId <= 99999 ){
            this.studentId = studentId;
            return true;
        } else {
            return false;
        }
    }
    public boolean setqualification1(double qualification1){
        if( qualification1 >= 0 && qualification1 <= 5 ){
            this.qualification1 = qualification1;
            return  true;
        } else {
            return false;
        }
    }
    public boolean setqualification2(double qualification2){
        if( qualification2 >= 0 && qualification2 <= 5 ){
            this.qualification2 = qualification2;
            return  true;
        } else {
            return false;
        }
    }
    public boolean setqualification3(double qualification3){
        if( qualification3 >= 0 && qualification3 <= 5 ){
            this.qualification3 = qualification3;
            return  true;
        } else {
            return false;
        }
    }
    public void setaverage(double qualification1, double qualification2, double qualification3){
        this.average = (qualification1 + qualification2 + qualification3) / 3;
    }
    public String getnameStudent(){
        return this.nameStudent;
    }
    public int getstudentId(){
        return this.studentId;
    }
    public double getqualification1(){
        return this.qualification1;
    }
    public double getqualification2(){
        return this.qualification2;
    }
    public double getqualification3(){
        return this.qualification3;
    }
    public double getaverage(){
        return this.average;
    }
}
