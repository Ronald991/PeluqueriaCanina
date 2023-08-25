
package com.ronald.peluqueriacanina.logica;

import com.ronald.peluqueriacanina.persistencia.ControladoraPersistencia;

/**
 *
 * @author Ronald Almada
 */
public class Controladora {
    
    ControladoraPersistencia controladoraPersistencia = 
            new ControladoraPersistencia();

    public void crearCliente(String nombre, String telefono, String direccion,
            String mascotaNombre, String mascotaRaza, String mascotaColor,
            String observaciones, String esAlergico, String esEspecial) {
        
        Mascota mascota = new Mascota();
        Cliente cliente = new Cliente();
        
        //Establecemos los parámetros manualmente, falta el id que lo va a asignar
        //aumáticamente la base de datos
        
                //cliente
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        
        //mascota
        mascota.setNombre(mascotaNombre);
        mascota.setRaza(mascotaRaza);
        mascota.setColor(mascotaColor);
        mascota.setObservaciones(observaciones);
        mascota.setEsAlergico(esAlergico);
        mascota.setEsEspecial(esEspecial);
        mascota.setCliente(cliente);
        

        
        controladoraPersistencia.crearCliente(cliente, mascota);
        
    }

   
    
}
