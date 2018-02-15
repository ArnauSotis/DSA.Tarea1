public class Rectangle {

    private int l1;
    private int l2;

    public int calcularAreaRectangle(){

        return getL1() * getL2();

    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }
}
