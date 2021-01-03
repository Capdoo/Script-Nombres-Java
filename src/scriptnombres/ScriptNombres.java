
package scriptnombres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Capddo <rafael.capdoo@boccer.com>
 */
public class ScriptNombres {

        public static void main(String[] args) throws Exception {
                // TODO code application logic here
                AbridorDeTxt obj = new AbridorDeTxt();
                
                 List<Paciente> mi_lista = new ArrayList<>();
                mi_lista = obj.leer_datos();
                
                for (Paciente e : mi_lista) {
                                obj.insertar_paciente(e);
                 }
                
        }
        
}
