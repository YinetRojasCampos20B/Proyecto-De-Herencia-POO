/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapoo;

/**
 *
 * @author rojas
 */
public class Visitante extends Persona {
    
    // Definiendo atributos de la clase hija Visitante
    
    private double tiempoEstadia;
    private String acompaniaA;
    
    // Métodos getter y setter para la clase hija Visitante
    
    // Tiempo estadía
    
    public double getTiempoEstadia() {
        return tiempoEstadia;
    }

    public void setTiempoEstadia(int tiempoEstadia) {
        this.tiempoEstadia = tiempoEstadia;
    }

    // Acompaña a
    
    public String getAcompaniaA() {
        return acompaniaA;
    }

    public void setAcompaniaA(String quienAcompania) {
        this.acompaniaA = quienAcompania;
    }
    
    // Método para imprimir los datos del Visitante
    
    public static void imprimirDatosVisitante(Visitante visitante) {

        float horaEntradaVisitante = visitante.getHoraEntrada();
        float horaSalidaVisitante = visitante.getHoraSalida();
        double tiempoEstadiaVisitante = visitante.getTiempoEstadia();
        String acompanianteParaVisitante = visitante.getAcompaniaA();

        System.out.println("Hora de entrada: " + horaEntradaVisitante);
        System.out.println("Hora de salida: " + horaSalidaVisitante);
        System.out.println("Tiempo de estadía: " + tiempoEstadiaVisitante);
        System.out.println("Acompaña a: " + acompanianteParaVisitante);
        System.out.println("Eres: Visitante");

    }
    
    
}
