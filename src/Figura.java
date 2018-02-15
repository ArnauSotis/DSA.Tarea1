import com.sun.media.jfxmedia.logging.Logger;

abstract class Figura implements Comparable{

    public abstract double getArea();

    public int compareTo(Object O){

        if(O instanceof Figura) {    //Comprobar que el objecte del argument es una Figura
            Figura f = (Figura) O;
            if(this.getArea()<f.getArea())
                return 1;
            else if(this.getArea()>f.getArea())
                return -1;
            else
                return 0;
        }
        else {
            Logger.logMsg(Logger.ERROR, "S'ha intentat comparar un objecte que no és una Figura");
            return -1;               //L'objecte no és una Figura
        }
    }
}
