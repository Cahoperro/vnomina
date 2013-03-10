package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Mes implements Serializable {

    Dias[] dia;
    private int n;
    private double horasMes,horasNocturnas,horasFestivas,horasRadio,HorasRadioB;
    private double totalRadio,totalRadioB;
    private double totalFestivos;
    private double totalNocturnidad;
    private double prorrata;
    private double totalDevengado;
    private double irpf;
    private double totalDeducir;
    private double liquido;
    public Mes(int i, boolean bis) {
        if (i == 3 || i == 5 || i == 8 || i == 10) {
            n = 30;
        } else if (i == 1) {
            if (bis == false) {
                n = 28;
            } else {
                n = 29;
            }
        } else {
            n = 31;
        }
        dia = new Dias[n];
        for (int j = 0; j < n; j++) {
            dia[j] = new Dias();
        }
    }
    
    public void calculoMes(){
        
    }

    public double getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(double horasMes) {
        this.horasMes = horasMes;
    }

    public double getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(double horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public double getHorasFestivas() {
        return horasFestivas;
    }

    public void setHorasFestivas(double horasFestivas) {
        this.horasFestivas = horasFestivas;
    }

    public double getHorasRadio() {
        return horasRadio;
    }

    public void setHorasRadio(double horasRadio) {
        this.horasRadio = horasRadio;
    }

    public double getHorasRadioB() {
        return HorasRadioB;
    }

    public void setHorasRadioB(double HorasRadioB) {
        this.HorasRadioB = HorasRadioB;
    }

    public double getTotalRadio() {
        return totalRadio;
    }

    public void setTotalRadio(double totalRadio) {
        this.totalRadio = totalRadio;
    }

    public double getTotalRadioB() {
        return totalRadioB;
    }

    public void setTotalRadioB(double totalRadioB) {
        this.totalRadioB = totalRadioB;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public double getTotalFestivos() {
        return totalFestivos;
    }

    public void setTotalFestivos(double totalFestivos) {
        this.totalFestivos = totalFestivos;
    }

    public double getTotalNocturnidad() {
        return totalNocturnidad;
    }

    public void setTotalNocturnidad(double totalNocturnidad) {
        this.totalNocturnidad = totalNocturnidad;
    }

    public double getProrrata() {
        return prorrata;
    }

    public void setProrrata(double prorrata) {
        this.prorrata = prorrata;
    }

    public double getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(double totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getTotalDeducir() {
        return totalDeducir;
    }

    public void setTotalDeducir(double totalDeducir) {
        this.totalDeducir = totalDeducir;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }
    
}
