/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author D-Nexus
 */
public class Rol {
    //Atributos
    private int id;
    private int salario;
    private String nombre;
    private String Descripcion;
    private String HorarioDeTrabajo;
    //Lista simulando base de datos
    private static LinkedList<Rol> rols = new LinkedList<>();

    //Constructor
    public Rol(int id, int salario, String nombre, String Descripcion, String HorarioDeTrabajo) {
        this.id = id;
        this.salario = salario;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.HorarioDeTrabajo = HorarioDeTrabajo;
    }
    
    public Rol(int id, String nombre, int salario){
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public Rol(){
    }
    
    
    //Getters
    
    public int getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getHorarioDeTrabajo() {
        return HorarioDeTrabajo;
    }

    public static LinkedList<Rol> getRols() {
        return rols;
    }
    
 
    //Setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setHorarioDeTrabajo(String HorarioDeTrabajo) {
        this.HorarioDeTrabajo = HorarioDeTrabajo;
    }

    public static void setRols(LinkedList<Rol> rols) {
        Rol.rols = rols;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", salario=" + salario + ", nombre=" + nombre + ", Descripcion=" + Descripcion + ", HorarioDeTrabajo=" + HorarioDeTrabajo + '}';
    }
    
}
