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
public enum TipoMotor {
    MOTOR1("1.3"), MOTOR2("1.6"), MOTOR3("2.0"), MOTOR4("3.0");
    
    String nombre;

    private TipoMotor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
   
}
