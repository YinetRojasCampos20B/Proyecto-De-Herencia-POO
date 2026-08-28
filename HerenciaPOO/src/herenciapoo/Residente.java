/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapoo;

/**
 *
 * @author rojas
 */
public class Residente extends Persona {
    
    // Definiendo atributos de la clase hija Residente
    
    public int anioMudanza;
    
    // Métodos getter y setter para la clase hija Residente
    
    // Año mudanza
    
    public int getAnioMudanza() {
        return anioMudanza;
    }

    public void setAnioMudanza(int anioMudanza) {
        this.anioMudanza = anioMudanza;
    }
    
    // Otros métodos complementarios
    
    // Método para imprimir los datos del Residente
    
    public static void imprimirDatosResidente(Residente residente) {
        int anioMudanza = residente.getAnioMudanza();
        System.out.println("Año de mudanza: " + anioMudanza);
        System.out.println("Eres: Residente");
    }
    
}
