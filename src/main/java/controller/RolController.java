/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Rol;
import java.util.LinkedList;

/**
 *
 * @author D-Nexus
 */
public class RolController {
    
    public void createRol(int id,String nombre,String horario,int salario,String descripcion) throws Exception {
        //Excepcion para verificar si ya existe el mismo ID
        for (Rol rol : Rol.getRols()) {
            if (rol.getId() == id || rol.getNombre().equals(nombre)) {
                throw new Exception("Ya existe un rol con el mismo ID o Nombre.");
            }
        }
        //Creamos la intencia de rol
        Rol rol = new Rol(id, salario, nombre,descripcion, horario);
        //Guardamos en la lista
        Rol.getRols().add(rol);
    }
    
    public LinkedList<Rol> readRol(){
        return Rol.getRols();
    }
    
    public String updateRol(int id,String nombre,String horario,int salario,String descripcion){
        //Modificar valores
        for (Rol rol : Rol.getRols()) {
            if (rol.getId() == id) {
                rol.setNombre(nombre);
                rol.setHorarioDeTrabajo(horario);
                rol.setSalario(salario);
                rol.setDescripcion(descripcion);
                return "Modificacion exitosa";
            }
        }
        return "El ID del rol a modificar no existe";
    }
    
    public String deleteRol(int id){
        String mensaje = "No se encontro el elemento";
        Rol objetoEliminar = null;
        for (Rol rol : Rol.getRols()) {
            if (rol.getId() == id) {
                objetoEliminar = rol;
                mensaje = "Elemento eliminado con exito";
            }
        }
        Rol.getRols().remove(objetoEliminar);
        return mensaje;
    }
}
