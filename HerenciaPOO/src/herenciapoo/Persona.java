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
    
    // Método para imprimir los datos de los usuarios en pantalla
   
    public static void imprimirDatos(Persona persona) {

        // Obtener mediante el uso de getters y setters los datos del usuario
        int idUsuario = persona.getId();
        String nombreUsuario = persona.getNombres();
        String apellidosUsuario = persona.getApellidos();
        int edadUsuario = persona.getEdad();
        float horaEntradaUsuario = persona.getHoraEntrada();
        float horaSalidaUsuario = persona.getHoraSalida();

        // Imprimir datos del usuario en la consola
        System.out.println("¡Hola, " + nombreUsuario + " " + apellidosUsuario);
        System.out.println("Tu ID de usuario es: " + idUsuario);
        System.out.println("Tu edad es de: " + edadUsuario + " años");
        System.out.println("Hora de entrada: " + horaEntradaUsuario);
        System.out.println("Hora de salida: " + horaSalidaUsuario);
    }
    
}
