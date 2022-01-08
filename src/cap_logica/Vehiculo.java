/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public abstract class Vehiculo implements Presentable{
    private String propietario;
    private double costo;
    
    private String placa;
    private String marca;
    private int año;

    public Vehiculo() {
        this.propietario = "";
        this.costo = 0;
        this.placa = "";
        this.marca = "";
        this.año = 0;
    }
    
    public Vehiculo(String propietario, double costo, String placa, String marca, int año) {
        this.propietario = propietario;
        this.costo = costo;
        this.placa = placa;
        this.marca = marca;
        this.año = año;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
