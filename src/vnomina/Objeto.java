package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable{
    private boolean guardado = false;
    Meses enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,
          octubre,noviembre,diciembre;
    Datos datos;
    public Objeto(Datos datosRec){
        datos = datosRec;
        
    }

    public boolean isGuardado() {
        return guardado;
    }

    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }
    
}
