/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Examen;
import java.util.LinkedList;

/**
 *
 * @author D-Nexus
 */
public class ExamenController {
    
    public void createExamen(int id, String fecha, String hora, String tipo, String veterinario, String paciente, String resultado) throws Exception {
        //Excepcion para verificar si ya existe el mismo ID
        for (Examen examen : Examen.getExamenes()) {
            if (examen.getId() == id) {
                throw new Exception("Ya existe un examen con el mismo ID.");
            }
        }
        //Creamos la intencia de Examen
        Examen examen = new Examen(id, veterinario, fecha , hora, tipo,resultado, paciente);
        //Guardamos en la lista
        Examen.getExamenes().add(examen);
    }
    
    public LinkedList<Examen> readExamen(){
        return Examen.getExamenes();
    }
    
    public String updateExamen(int id, String fecha, String hora, String tipo, String veterinario, String paciente, String resultado){
        //Modificar valores
        for (Examen examen : Examen.getExamenes()) {
            if (examen.getId() == id) {
                examen.setFecha(fecha);
                examen.setHora(hora);
                examen.setTipo(tipo);
                examen.setVeterinario(veterinario);
                examen.setPaciente(paciente);
                examen.setResultados(resultado);
                return "Modificacion exitosa";
            }
        }
        return "El ID del rol a modificar no existe";
    }
    
    public String deleteExamen(int id){
        String mensaje = "No se encontro el elemento";
        Examen objetoEliminar = null;
        for (Examen examen : Examen.getExamenes()) {
            if (examen.getId() == id) {
                objetoEliminar = examen;
                mensaje = "Elemento eliminado con exito";
            }
        }
        Examen.getExamenes().remove(objetoEliminar);
        return mensaje;
    }
}
