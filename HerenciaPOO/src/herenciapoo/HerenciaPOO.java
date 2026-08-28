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
        
        // Usar el método Imprimir Datos de la clase madre Persona para mostrar en consola su respectiva información
        
        residente1.imprimirDatos(residente1);

        // Usar el método Imprimir Datos Residente de la clase hija Residente para mostrar en consola su respectiva información
        
        residente1.imprimirDatosResidente(residente1);

        // Separador de la información en consola
        
        System.out.println("---------------------------------------------------------");
    
        // Instanciando un objeto Visitante 1 de la clase hija Visitante
        
        Visitante visitante1 = new Visitante();
        
         // Asignación de atributos al objeto Visitante 1
        
        visitante1.setNombres("Mario Aníbal");
        visitante1.setApellidos("Conrado");
        visitante1.setEdad(29);
        visitante1.setId(2);
        visitante1.setHoraEntrada(4.08f);
        visitante1.setHoraSalida(8.05f);
        visitante1.setTiempoEstadia(2);
        visitante1.setAcompaniaA(residente1.getNombres() + residente1.getApellidos());
        
        // Usar el método Imprimir Datos de la clase madre Persona para mostrar en consola su respectiva información
        
        visitante1.imprimirDatos(visitante1);
        
        
    }
    
}
