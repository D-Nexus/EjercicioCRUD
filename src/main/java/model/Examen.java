/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Paquete
package Model;
//Librerias
import java.util.LinkedList;

/**
 *
 * @author D-Nexus
 */
public class Examen {
    //Atributos
    private int id;
    private String fecha;
    private String hora;
    private String tipo;
    private String resultados;
    private String veterinario;
    private String paciente;
    
    //Lista de examenes
    private static LinkedList<Examen> examenes = new LinkedList<>();
    
    //Constructor
    public Examen(int id, String veterinario, String fecha, String hora, String tipo, String resultados, String paciente){
        this.id = id;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
        this.resultados = resultados;
        this.paciente = paciente;
    }
    public Examen(int id, String veterinario, String paciente){
        this.id = id;
        this.veterinario = veterinario;
        this.paciente = paciente;
    }
    
    public Examen(){
    }
    
    //Getters
    
    public int getId() {
        return id;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getTipo() {
        return tipo;
    }

    public String getResultados() {
        return resultados;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public static LinkedList<Examen> getExamenes() {
        return examenes;
    }
    
    
    //Setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public static void setExamenes(LinkedList<Examen> examenes) {
        Examen.examenes = examenes;
    }
    
    @Override
    public String toString(){
        return "Examen {fecha="+fecha+", hora="+hora+", tipo="+tipo+", resultados="+resultados+"}";
    }
    
}
