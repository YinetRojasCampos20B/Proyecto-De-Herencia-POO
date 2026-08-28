/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapoo;

/**
 *
 * @author rojas
 */
public class Contratista extends Persona {
    
    // Asignando atributos a la clase Contratista

    public String empresa;
    private double tiempoEstadia;
    
    // Métodos getter y setter de la clase Contratista
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String nombreEmpresa) {
        this.empresa = nombreEmpresa;
    }

    // Tiempo estadía
    
    public double getTiempoEstadia() {
        return tiempoEstadia;
    }

    public void setTiempoEstadia(int tiempoEstadia) {
        this.tiempoEstadia = tiempoEstadia;
    }
    
    // Método para imprimir los datos específicos de un objeto de la clase Contratista
    
    public static void imprimirDatosContratista(Contratista contratista) {
        String empresaContratista = contratista.getEmpresa();
        System.out.println("Empresa: " + empresaContratista);
        System.out.println("Eres: Contratista");
    }
    
}
