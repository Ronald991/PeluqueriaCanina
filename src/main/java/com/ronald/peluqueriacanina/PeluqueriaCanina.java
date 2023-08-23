package com.ronald.peluqueriacanina;

import com.ronald.peluqueriacanina.gui.VentanaPrincipal;
/**
 *
 * @author Ronald Almada
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        VentanaPrincipal app = new VentanaPrincipal();
        final String NOMBRE_LOCAL = "Patitas";
        app.setTitle(NOMBRE_LOCAL);
        app.setVisible(true);
        app.setLocationRelativeTo(null);
        
    }
}
