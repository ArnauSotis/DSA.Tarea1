public class Cercle extends Figura{

    private double radi;

    @Override
    public double getArea(){
        return Math.PI*Math.pow(getRadi(),2);
    }

    public double getRadi() {
        return (int) radi; //Cambio a int
    }
    public void setRadi(double radi) {
        this.radi = radi;
    }
}
