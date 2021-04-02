public class MyMath {
    private double number1;
    private double number2;

    public MyMath(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double sum(){
        return this.number1 +this.number2 ;
    }
    public double minus(){
        return  this.number1 - this.number2 ;

    }
    public  double mutimle(){
        return  this.number1 * this.number2 ;

    }
    public  double devide(){
        return  this.number1 / this.number2 ;

    }


}
