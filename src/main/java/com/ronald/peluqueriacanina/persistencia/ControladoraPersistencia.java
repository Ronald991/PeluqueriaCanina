
package com.ronald.peluqueriacanina.persistencia;

import com.ronald.peluqueriacanina.logica.Cliente;
import com.ronald.peluqueriacanina.logica.Mascota;
import com.ronald.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronald Almada
 */
public class ControladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();

    public void crearCliente(Cliente cliente, Mascota mascota) {
        //crea el cliente nuevo en la base de datos
        clienteJPA.create(cliente);
        
        //crea la mascota nueva en la base de datos
        mascotaJPA.create(mascota);
    }

    public List<Mascota> getDatos() {
        return mascotaJPA.findMascotaEntities();
    }

    public void eliminarCliente(int numeroCliente) {
        try {
            mascotaJPA.destroy(numeroCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota getCliente(int numeroCliente) {
        return mascotaJPA.findMascota(numeroCliente);
    }
    
}
