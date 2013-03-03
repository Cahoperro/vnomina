package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable{
    Meses enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,
          octubre,noviembre,diciembre;
    Datos datos;
    public Objeto(Datos datosRec){
        datos = datosRec;
        
    }
}
