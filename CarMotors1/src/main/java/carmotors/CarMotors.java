/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carmotors;

import vista.VistaPrincipal;

/**
 *
 * @author serganimon
 */
public class CarMotors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        
        vistaPrincipal.setVisible(true);
    });
    }
    
}
// orden de creacion 

// clase se crean como esten en el la base de datos.
// dao la logica 
// controler este se encarga de conectar el dao con la vista
// vista este es la vista que creemos 
// carmotors aca esta el main 