package vnomina;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable{
    Mes[] mes; 
    Datos datos;
    HashMap<String, Dias> claves;
    private boolean guardado = false;
    int mesActual;
    int diaActual;
    int anio;
    boolean bis;
    double cComunes;
    double desempleo;
    double FProfesional;
    double totalAportaciones;
    
    public Objeto(Datos datosRec, int year){
        claves = new HashMap<>();
        mesActual = 0;
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
