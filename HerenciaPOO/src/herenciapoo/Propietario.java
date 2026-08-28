/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapoo;

/**
 *
 * @author rojas
 */
public class Propietario extends Persona {
    
    // Asignando atributos a la clase Propietario
    
    private String torre;
    private String apartamento;
    
    // Métodos getter y setter de la clase Propietario
    
    // Torre
    
    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    // Apartamento
    
    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
    
    // Método complementario para imprimir datos de Propietario
    
    public void imprimirDatosPropietario (Propietario propietario) {
    
        System.out.println("Torre: "+propietario.torre);
        System.out.println("Apartamento: "+propietario.apartamento);
    }
            
    
}
