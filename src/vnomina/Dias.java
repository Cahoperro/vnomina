package vnomina;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author cahoperro
 */
public class Dias implements Serializable {

    private boolean arma, festivo, radioscopia, radio, radioB, vacaciones;
    private String servicio1, servicio2, entrada1, entrada2, salida1, salida2, claveServicio;
    private double tempHoras, tempNocturnas, tempFestivas, tempRadio, tempRadioB;
    private double tempHoras1, tempHoras2,tempNoct1,tempNoct2,tempFest1,temFest2;
    private int diaSemana;
    private int HEntrada1, MEntrada1, HSalida1, MSalida1;
    private int HEntrada2, MEntrada2, HSalida2, MSalida2;
    private GregorianCalendar gc22,gc6,gcEnt, gcSal;

    

    public void calHoras() {
        String[] ste;
        String[] sts;
        
        if (entrada1 != null && salida1 != null && !entrada1.isEmpty() && !salida1.isEmpty()) {
            ste = entrada1.split(":");
            sts = salida1.split(":");
            HEntrada1 = Integer.parseInt(ste[0]);
            MEntrada1 = Integer.parseInt(ste[1]);
            HSalida1 = Integer.parseInt(sts[0]);
            MSalida1 = Integer.parseInt(sts[1]);
            tempHoras1 = calculo(HEntrada1, MEntrada1, HSalida1, MSalida1);
            tempNoct1 = calNocturnas(HEntrada1, MEntrada1, HSalida1, MSalida1);
        } else {
            tempHoras1 = 0;
        }
        

        if (entrada2 != null && salida2 != null && !entrada2.isEmpty() && !salida2.isEmpty()) {
            ste = entrada2.split(":");
            sts = salida2.split(":");
            HEntrada2 = Integer.parseInt(ste[0]);
            MEntrada2 = Integer.parseInt(ste[1]);
            HSalida2 = Integer.parseInt(sts[0]);
            MSalida2 = Integer.parseInt(sts[1]);
            tempHoras2 = calculo(HEntrada2, MEntrada2, HSalida2, MSalida2);
            tempNoct2 = calNocturnas(HEntrada2, MEntrada2, HSalida2, MSalida2);
            
        } else {
            tempHoras2 = 0;
            tempNocturnas = 0;
        }
        tempHoras = tempHoras1 + tempHoras2;
        tempNocturnas = tempNoct1 + tempNoct2;
        
        tempRadio = 0;
        tempRadioB = 0;
        if(radio){
           tempRadio = tempHoras;
        }else if (radioB){
            tempRadioB = tempHoras;
         }
    }

    private double calculo(int h1, int m1, int h2, int m2) {
        gcEnt = new GregorianCalendar(2013, 7, 12, h1, m1);
        gcSal = new GregorianCalendar(2013, 7, 12, h2, m2);
        double uno = gcEnt.getTimeInMillis();
        double dos = gcSal.getTimeInMillis();
        double res = (dos - uno) / 3600000;
        if(res < 0){
            res = res +24;
        }
        return res;
    }

    private double calNocturnas(int h1, int m1, int h2, int m2) {
        double noct = 0;
        double nocta;
        double noctb;
        
        gc22 = new GregorianCalendar(2013, 1, 1, 22, 0);
        gc6 = new GregorianCalendar(2013, 1, 1, 6, 0);
        gcEnt = new GregorianCalendar(2013, 1, 1, h1, m1);
        gcSal = new GregorianCalendar(2013, 1, 1, h2, m2);
        
        double h22 = gc22.getTimeInMillis();
        double h6 = gc6.getTimeInMillis();
        double hEnt = gcEnt.getTimeInMillis();
        double hSal = gcSal.getTimeInMillis();
        
        nocta = (hEnt - h22) / 3600000;
        noctb = (h6 - hSal) / 3600000;
        if (nocta < 0){
            nocta = 0;
        }
        
        if (noctb < 0){
            noctb = 0;
        }
        
        noct = 8-(nocta + noctb);
        if (noct < 0){
           noct = noct+24;
        }
        
        return noct;
       
    }

    private void calFestivas() {
        
    }

    public double getTempRadio() {
        return tempRadio;
    }

    public double getTempRadioB() {
        return tempRadioB;
    }
    
    

    public boolean isVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(boolean vacaciones) {
        this.vacaciones = vacaciones;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public boolean isRadioscopia() {
        return radioscopia;
    }

    public void setRadioscopia(boolean radioscopia) {
        this.radioscopia = radioscopia;
    }

    public boolean isRadioB() {
        return radioB;
    }

    public void setRadioB(boolean radioB) {
        this.radioB = radioB;
    }

    public double getTempHoras() {
        return tempHoras;
    }

    public void setTempHoras(double tempHoras) {
        this.tempHoras = tempHoras;
    }

    public double getTempNocturnas() {
        return tempNocturnas;
    }

    public void setTempNocturnas(double tempNocturnas) {
        this.tempNocturnas = tempNocturnas;
    }

    public double getTempFestivas() {
        return tempFestivas;
    }

    public void setTempFestivas(double tempFestivas) {
        this.tempFestivas = tempFestivas;
    }

    public boolean isArma() {
        return arma;
    }

    public void setArma(boolean arma) {
        this.arma = arma;
    }

    public boolean isFestivo() {
        return festivo;
    }

    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public String getServicio1() {
        return servicio1;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    public String getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(String entrada1) {
        this.entrada1 = entrada1;
    }

    public String getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(String entrada2) {
        this.entrada2 = entrada2;
    }

    public String getSalida1() {
        return salida1;
    }

    public void setSalida1(String salida1) {
        this.salida1 = salida1;
    }

    public String getSalida2() {
        return salida2;
    }

    public void setSalida2(String salida2) {
        this.salida2 = salida2;
    }

    public String getClaveServicio() {
        return claveServicio;
    }

    public void setClaveServicio(String claveServicio) {
        this.claveServicio = claveServicio;
    }
}
