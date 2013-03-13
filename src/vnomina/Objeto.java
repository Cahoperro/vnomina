package vnomina;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable {

    Mes[] mes;
    Datos datos;
    boolean guardado = false;
    HashMap<String, Dias> claves;
    int mesActual;
    int diaActual;
    int anio;
    boolean bis;
    double cComunes;
    double desempleo;
    double FProfesional;
    double totalAportaciones;
    GregorianCalendar gc;

    public Objeto(Datos datosRec, int year) {
        claves = new HashMap<>();
        mesActual = 0;
        anio = year;
        mes = new Mes[12];
        datos = datosRec;
        if (year % 4 == 0) {
            bis = true;
        } else {
            bis = false;
        }
        for (int i = 0; i <= 11; i++) {
            mes[i] = new Mes(i, bis);
        }
        // rellenar los dias festivos
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < mes[i].getN(); j++) {
                gc = new GregorianCalendar(anio, i, j);
                int d = gc.get(Calendar.DAY_OF_WEEK);
                mes[i].dia[j].setDiaSemana(d);
                if (d == 6 || d == 7) {
                    mes[i].dia[j].setFestivo(true);
                } else {
                    mes[i].dia[j].setFestivo(false);
                }
            }
        }
        mes[0].dia[0].setFestivo(true);
        mes[0].dia[5].setFestivo(true);
        mes[4].dia[0].setFestivo(true);
        mes[7].dia[14].setFestivo(true);
        mes[9].dia[11].setFestivo(true);
        mes[10].dia[0].setFestivo(true);
        mes[11].dia[5].setFestivo(true);
        mes[11].dia[7].setFestivo(true);
        mes[11].dia[24].setFestivo(true);
    }
}
