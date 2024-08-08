/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casocolegiado4;

import javax.swing.JOptionPane;

/**
 *
 * @author jimec
 */
public class CasoColegiado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiantes arrEstudiantes[] = new Estudiantes[2];
        
        for(int x=0; x< arrEstudiantes.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos de los estudiantes" +x);
            String nombre = JOptionPane.showInputDialog(null, "Nombre del estudiante:");
            String curso = JOptionPane.showInputDialog(null, "Curso del estudiante:");
            String profesor = JOptionPane.showInputDialog(null, "Nombre del profesor:");
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota del estudiante:"));
      
            
            
        }
        
        for(int x=0;x<arrEstudiantes.length;x++){
            JOptionPane.showInternalMessageDialog(null, arrEstudiantes[x].getNombre()+""+ arrEstudiantes[x].getCurso()+ "" +arrEstudiantes[x].getProfesor()+ "" +arrEstudiantes[x].getCalificacion());
        }
        
    }
    
}
