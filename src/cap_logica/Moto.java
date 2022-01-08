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
public class Moto extends Vehiculo {
    //private String placa;
    //private String marca;
    private TipoModelo modelo;
    private float velocidadMax;
    //private int año;

    public Moto() {
        super();
        this.modelo = null;
        this.velocidadMax = 0f;
    }

    public Moto(String propietario, double costo, String placa, String marca, int año, TipoModelo modelo, float velocidadMax) {
        super(propietario, costo, placa, marca, año);
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
    }

    public TipoModelo getModelo() {
        return modelo;
    }

    public void setModelo(TipoModelo modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(float velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String presentarDetalle() {
        return "Placa: " + getPlaca() + 
                "\nMarca: " + getMarca() + 
                "\nModelo: " + modelo.name() + 
                "\nVelocidad maxima: " + velocidadMax + 
                "\nAño adquisicion: " + getAño() + "\n";
    }

    @Override
    public String presentarLineal() {
        return getPlaca() + "\t" + getMarca() + "\t" + modelo.name() + "\t" + velocidadMax + "\t" + getAño();
    }
     
}
