/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scriptnombres;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Paciente {
        
    private String nombre;
    private String apellido;
    private String dni;
    private boolean estado_vacunacion;

    public Paciente() {
    }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public String getDni() {
                return dni;
        }

        public void setDni(String dni) {
                this.dni = dni;
        }

        public boolean isEstado_vacunacion() {
                return estado_vacunacion;
        }

        public void setEstado_vacunacion(boolean estado_vacunacion) {
                this.estado_vacunacion = estado_vacunacion;
        }


}
