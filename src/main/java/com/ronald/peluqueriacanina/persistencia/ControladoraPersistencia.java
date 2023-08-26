
package com.ronald.peluqueriacanina.persistencia;

import com.ronald.peluqueriacanina.logica.Cliente;
import com.ronald.peluqueriacanina.logica.Mascota;
import java.util.List;

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
    
}
