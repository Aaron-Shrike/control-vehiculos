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
public class Auto extends Vehiculo {
    //private String placa;
    //private String marca;
    private TipoMotor motor;
    private TipoCombustible combustible;
    //private int año;

    public Auto() {
        super();
        this.motor = null;
        this.combustible = null;
    }

    public Auto(String propietario, double costo, String placa, String marca, int año, TipoMotor motor, TipoCombustible combustible) {
        super(propietario, costo, placa, marca, año);
        this.motor = motor;
        this.combustible = combustible;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String presentarDetalle() {
        return "Placa: " + getPlaca() + 
                "\nMarca: " + getMarca() + 
                "\nMotor: " + motor.getNombre() + 
                "\nCombustible: " + combustible.name() + 
                "\nAño adquisicion: " + getAño() + "\n";
    }

    @Override
    public String presentarLineal() {
        return getPlaca() + "\t" + getMarca() + "\t" + motor.getNombre() + "\t" + combustible.name() + "\t" + getAño();
    }
       
}
