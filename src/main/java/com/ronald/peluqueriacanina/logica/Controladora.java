
package com.ronald.peluqueriacanina.logica;

import com.ronald.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascota> getDatos() {
        return controladoraPersistencia.getDatos();
    }

    public void eliminarMascota(int numeroCliente) {
        controladoraPersistencia.eliminarCliente(numeroCliente);
    }

    public Mascota getCliente(int numeroCliente) {
        return controladoraPersistencia.getCliente(numeroCliente);
    }

    public void actualizarCliente(Mascota mascota, String nombre, String telefono, String direccion,
            String mascotaNombre, String mascotaRaza, String mascotaColor, String observaciones,
            String esAlergico, String esEspecial) {
        
        mascota.setNombre(mascotaNombre);
        mascota.setRaza(mascotaRaza);
        mascota.setColor(mascotaColor);
        mascota.setObservaciones(observaciones);
        mascota.setEsAlergico(esAlergico);
        mascota.setEsEspecial(esEspecial);
        
        controladoraPersistencia.actualizarMascota(mascota);
        
        Cliente cliente = buscarDuenio(mascota.getCliente());
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        
        modificarDuenio(cliente);
        
        
    }

    private Cliente buscarDuenio(Cliente cliente) {
        return controladoraPersistencia.buscarCliente(cliente);
    }

    private void modificarDuenio(Cliente cliente) {
        controladoraPersistencia.actualizarCliente(cliente);
    }

   
    
}
