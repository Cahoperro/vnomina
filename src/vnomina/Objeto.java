package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable{
    private boolean guardado = false;
    Mes[] mes; 
    Datos datos;
    boolean bis;
    int anio;
    public Objeto(Datos datosRec, int year){
        anio = year;
        mes = new Mes[12];
        datos = datosRec;
        if (year % 4 == 0){
            bis = true;
        }else{
            bis = false;
        }
        for (int i = 0; i <= 11; i++){
            mes[i] = new Mes(i,bis);
        }
    }

    public boolean isGuardado() {
        return guardado;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }
    
}
