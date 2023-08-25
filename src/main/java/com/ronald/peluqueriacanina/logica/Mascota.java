
package com.ronald.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private boolean esAlergico;
    private boolean esEspecial;
    private String observaciones;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, boolean esAlergico, boolean esEspecial, String observaciones) {
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

    public boolean isEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(boolean esAlergico) {
        this.esAlergico = esAlergico;
    }

    public boolean isEsEspecial() {
        return esEspecial;
    }

    public void setEsEspecial(boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
