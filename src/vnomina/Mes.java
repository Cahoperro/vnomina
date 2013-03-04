package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Mes implements Serializable{
    Dias[] dia;
    int n;
    
    public Mes(int i, boolean bis){
        if (i == 3 || i == 5 || i == 8 || i == 10){
           n = 30; 
        }else if (i == 1){
           if (bis == false){
               n = 28;
           }else{
               n = 29;
           }
        }else{
            n = 31;
        }
        dia = new Dias[n];
    }
}
