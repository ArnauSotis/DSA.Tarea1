public class Quadrat extends Rectangle{

    private double l;

    public double getL() {
        return l;
    }
    public void setL(int l) {
        this.l = l;
    }

    public Quadrat(double l)
    {   super(l,l);
    }
}
