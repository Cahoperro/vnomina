package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Mes implements Serializable {

    Dias[] dia;
    private int n;
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
