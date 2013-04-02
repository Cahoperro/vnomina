
package vnomina;

import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author cahoperro
 */
public class Impresion {
    
    public static void imprimir(Principal Obj, String mes){
    try {
            JTextArea texto = new JTextArea();
            texto.append(mes + " de " +Obj.anio +"\n\n");
            texto.append("PERCEPCIONES SALARIALES: \tDEDUCCIONES:\n\n");
            texto.append("Salario base: \t" + Obj.salarioBase + "\tC.comunes: \t" + Obj.dCcomunes + "\n");
            texto.append("Horas extra: \t" + Obj.tExtra + "\tDesempleo: \t" + Obj.desempleo + "\n");
            texto.append("Antiguedad: \t" + Obj.tAntiguedad + "\tF.profesional: \t" + Obj.fp + "\n");
            texto.append("Plus festivos: \t" + Obj.festivos + "\tT.aportaciones: \t" + Obj.tAportaciones + "\n");
            texto.append("Peligrosidad: \t" + Obj.pPeligrosidad + "\tIRPF: \t" + Obj.IRPF + "\n");
            texto.append("Nocturnos: \t" + Obj.nocturnos + "\tTotal a deducir: \t" + Obj.tDeducir + "\n");
            texto.append("P. pagas extra: \t" + Obj.pPagasExtras + "\tLiquido a percibir: \t" + Obj.liquido + "\n");
            texto.append("Plus arma: \t" + Obj.tArma + "\n");
            texto.append("Radioscopia: \t" + (Obj.tHorasRadio + Obj.tHorasRadioB)+ "\n\n");
            texto.append("PERCEPCIONES NO SALARIALES: \n\n");
            texto.append("Plus transporte: \t" + Obj.pTransporte+ "\n");
            texto.append("Plus vestuario: \t" + Obj.pVestuario+ "\n");
            texto.append("Total devengado: \t" + Obj.tDevengado+ "\n");
            
            texto.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error al imprimir", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
