package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Dias implements Serializable{
    private boolean arma,festivo,radioscopia,radio,radioB,vacaciones;
    private String servicio1,servicio2,entrada1,entrada2,salida1,salida2,claveServicio;
    private double tempHoras;
    private double tempNocturnas;
    private double tempFestivas;
    private int diaSemana;

    public void calculoDia(){
       
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
