public class Cercle {

    private double radi;

    public double calcularAreaCercle(){
        return Math.PI*Math.pow(getRadi(),2);
    }

    public double getRadi() {
        return radi;
    }
    public void setRadi(double radi) {
        this.radi = radi;
    }
}
