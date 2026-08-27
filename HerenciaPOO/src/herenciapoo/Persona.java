package herenciapoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rojas
 */
public class Persona {
    
    // Definiendo los atributos de la clase Persona
    
    public String nombres;
    public String apellidos;
    public int edad;
    private int id;
    private float horaEntrada;
    private float horaSalida;
    
    // Métodos getter y setter para la clase Persona
    // Nombres
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    // Apellidos
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Edad
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Identificador
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Hora de entrada
    
    public float getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(float horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    // Hora de salida
    
    public float getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(float horaSalida) {
        this.horaSalida = horaSalida;
    }
    
}
