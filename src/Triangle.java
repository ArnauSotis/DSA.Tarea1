public class Triangle extends Figura {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangle(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public double getArea(){
        return getBase()*getAltura()/2;
    }
}
