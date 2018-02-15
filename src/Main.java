import java.util.Arrays;

public class Main {
    Figura[] arrayfiguras = new Figura[]{};


    public static double sumaFiguras(Figura[] l){
        double res = 0;
        for(Figura f : l){
            //res += f.getArea();
        }
        return res;
    }

    public static void ordenaFiguras(Figura[] l){
        Arrays.sort(l);
    }

    public static void main(String[] args) {



    }
}
