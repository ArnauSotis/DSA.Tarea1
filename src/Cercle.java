public class Cercle {

    private int radi;

    public double calcularAreaCercle(){
        //Pi*sqr(radi)
        return getRadi() *6.28;  //!!!!Cuidado, es un double!!!!!
    }

    public int getRadi() {
        return radi;
    }
    public void setRadi(int radi) {
        this.radi = radi;
    }
}
