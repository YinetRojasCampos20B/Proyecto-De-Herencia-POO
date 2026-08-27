/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciapoo;

/**
 *
 * @author rojas
 */
public class HerenciaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciando un objeto Residente 1 de clase hija Residente

        Residente residente1 = new Residente();
    
        // Asignando atributos al objeto Residente 1
       
        residente1.setNombres("Maria Antonieta");
        residente1.setApellidos(" de Francia");
        residente1.setEdad(41);
        residente1.setId(1);
        residente1.setHoraEntrada(17.20f);
        residente1.setHoraSalida(20.40f);
        residente1.setAñoMudanza(2021);
    
    
    }
    
}
