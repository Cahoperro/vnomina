
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
            texto.append("PERCEPCIONES SALARIALES: \t\tDEDUCCIONES:");
            texto.append("Salario base: \t" + Obj.salarioBase + "\t\tC.comunes: \t" + Obj.cComunes + "\n");
            texto.append("Horas extra: \t" + Obj.tExtra + "\t\tDesempleo: \t" + Obj.desempleo + "\n");
            texto.append("Antiguedad: \t" + Obj.tAntiguedad + "\t\tF.profesional: \t" + Obj.fp + "\n");
            texto.append("Plus festivos: \t" + Obj.festivos + "\t\tT.aportaciones: \t" + Obj.tAportaciones + "\n");
            texto.append("Peligrosidad: \t" + Obj.pPeligrosidad + "\t\tIRPF: \t" + Obj.tIrpf + "\n");
            texto.append("Plus nocturnos: \t" + Obj.nocturnos + "\t\tTotal a deducir: \t" + Obj.tDeducir + "\n");
            texto.append("P. pagas extra: \t" + Obj.pPagasExtras + "\t\tLiquido a percibir: \t" + Obj.liquido + "\n");
            texto.append("Plus arma: \t\n" + Obj.tArma);
            texto.append("Radioscopia: \t\n" + (Obj.tHorasRadio + Obj.tHorasRadioB));
            texto.append("PERCEPCIONES NO SALARIALES: \n");
            texto.append("Plus transporte: \t\n" + Obj.pTransporte);
            texto.append("Plus vestuario: \t\n" + Obj.pVestuario);
            texto.append("Total devengado: \t\n" + Obj.tDevengado);
            
            texto.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error al imprimir", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
