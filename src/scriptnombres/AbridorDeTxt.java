
package scriptnombres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AbridorDeTxt {

        String nombres = "Nombres.txt";
        String apellidos = "Apellidos.txt";
        String residual = "Residual.txt";
        
                File f;
                FileReader fr;
                FileReader fr2;
                
                FileWriter fw;
                BufferedReader br;
                BufferedReader br2;
                
                BufferedWriter bw;
                PrintWriter pw;
                String datos;
                String datos2;
                Paciente paciente;
        
        public List<Paciente> leer_datos() throws Exception{
                List<Paciente> lista = new ArrayList<>();
                try{
                        /*PARA NOMBRE*/
                                //creo objeto fr y abro para lectura
                                fr = new FileReader(nombres);
                                //creo objeto br para leer datos
                                br = new BufferedReader(fr);
                                //leer primer registro
                                datos = br.readLine();
                        
                        /*PARA APELLIDO*/
                                //creo objeto fr y abro para lectura
                                fr2 = new FileReader(apellidos);
                                //creo objeto br para leer datos
                                br2 = new BufferedReader(fr2);
                                //leer primer registro
                                datos2 = br2.readLine();
                        
                        paciente = null;

                        while(datos != null && datos2 != null){
                            paciente = new Paciente();
                            StringTokenizer token = new StringTokenizer(datos,",");
                            StringTokenizer token2 = new StringTokenizer(datos2,",");

                            //asigno valores al objeto emp
                            paciente.setNombre(token.nextToken());
                            paciente.setApellido(token2.nextToken());
                            paciente.setDni(token.nextToken());
                            paciente.setEstado_vacunacion(false);

                            //agrego el objeto emp a la coleccion lista
                            lista.add(paciente);
                            datos = br.readLine();
                            datos2 = br2.readLine();
                        }
                        br.close();
                        br2.close();
                } catch(IOException e){
                        throw e;
                } finally {
                        fr.close();
                        fr2.close();
                }
                return lista;   
                }
        
        
            public void insertar_paciente(Paciente x) throws Exception {
                try{
                //creo objeto fw y abro el archivo para la escritura
                fw = new FileWriter(residual,true);
                //creo objeto pw para escribir
                pw = new PrintWriter(fw);


                //preparar dato a escribir
                datos = "("+"'"+x.getNombre() +"'"+ ",'" + x.getApellido() +"'"+ ",'" + x.getDni() +"'"+",'"+x.isEstado_vacunacion()+"'"+ "),"+"\n";
                //escribo los datos
                pw.write(datos);
                pw.close();

                
            } catch(IOException e){
                throw e;
            }finally{
                fw.close();
             }
    }
            
}
