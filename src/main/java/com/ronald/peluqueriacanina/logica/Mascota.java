
package com.ronald.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Ronald Almada
 */

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String esAlergico;
    private String esEspecial;
    private String observaciones;
    @OneToOne
    private Cliente cliente;
    

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String esAlergico, String esEspecial, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.esAlergico = esAlergico;
        this.esEspecial = esEspecial;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public String isEsEspecial() {
        return esEspecial;
    }

    public void setEsEspecial(String esEspecial) {
        this.esEspecial = esEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
