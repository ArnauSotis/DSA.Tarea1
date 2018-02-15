public class Cercle {

    private double radi;

    public double calcularAreaCercle(){
        //Pi*sqr(radi)
        return getRadi() *6.28;  //!!!!Cuidado, es un double!!!!!
    }

    public double getRadi() {
        return radi;
    }
    public void setRadi(double radi) {
        this.radi = radi;
    }
}
