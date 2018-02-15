public class Rectangle extends Figura{

    private double l1;
    private double l2;


    public Rectangle(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    //Getters i setters
    public double getL1() {
        return l1;
    }
    public void setL1(int l1) {
        this.l1 = l1;
    }
    public double getL2() {
        return l2;
    }
    public void setL2(int l2) {
        this.l2 = l2;
    }

    public double getArea(){
        return getL1()*getL2();
    }

}
