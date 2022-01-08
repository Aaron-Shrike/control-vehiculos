/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_datos;

import cap_logica.Auto;
import cap_logica.Moto;
import cap_logica.TipoModelo;
import cap_logica.TipoMotor;
import cap_logica.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sh
 */
public class ListaVehiculos {
    private static ArrayList<Vehiculo> datos = new ArrayList<>();
    
    public static void agregar(Vehiculo obj){
        datos.add(obj);
    }
    
    public static ArrayList<Vehiculo> obtener(){
        return datos;
    }
    
    public static Vehiculo buscarAuto(String placa){
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(v.getPlaca().equalsIgnoreCase(placa)){
                    return v;
                }
            }
        }
        
        return null;
    }
    
    public static Vehiculo buscarMoto(String placa){
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Moto){
                if(v.getPlaca().equalsIgnoreCase(placa)){
                    return v;
                }
            }
        }
        
        return null;
    }
    
    public static ArrayList<Vehiculo> listaAutosMotosSegunPersona(String tipo, String nombre){
        ArrayList<Vehiculo> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(tipo.equalsIgnoreCase("Auto")){
                if(v instanceof Auto){
                    if(v.getPropietario().equalsIgnoreCase(nombre)){
                        lista.add(v);
                    }
                }    
            }
            
            if(tipo.equalsIgnoreCase("Moto")){
                if(v instanceof Moto){
                    if(v.getPropietario().equalsIgnoreCase(nombre)){
                        lista.add(v);
                    }
                }    
            }
        }
        
        return lista;
    }
    
    public static int[] cantidadAutosMotor(){
        Iterator<Vehiculo> it;
        int contador[] = new int[4];
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(((Auto) v).getMotor() == TipoMotor.MOTOR1){
                    contador[0]++;
                }
                
                if(((Auto) v).getMotor() == TipoMotor.MOTOR2){
                    contador[1]++;
                }
                
                if(((Auto) v).getMotor() == TipoMotor.MOTOR3){
                    contador[2]++;
                }
                
                if(((Auto) v).getMotor() == TipoMotor.MOTOR4){
                    contador[3]++;
                }
            }
        }
        
        return contador;
    }
    
    public static ArrayList<Vehiculo> listaAutosMotosSegunAño(String tipo, int año){
        ArrayList<Vehiculo> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(tipo.equalsIgnoreCase("Auto")){
                if(v instanceof Auto){
                    if(v.getAño() == año){
                        lista.add(v);
                    }
                }    
            }
            
            if(tipo.equalsIgnoreCase("Moto")){
                if(v instanceof Moto){
                    if(v.getAño() == año){
                        lista.add(v);
                    }
                }    
            }
        }
        
        return lista;
    }
    
    public static ArrayList<Moto> listaMotosUrbanas(){
        ArrayList<Moto> lista = new ArrayList<>();
        Iterator<Vehiculo> it;
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Moto){
                if(((Moto) v).getModelo() == TipoModelo.URBANA && v.getCosto() < 3500){
                    lista.add((Moto)v);
                }
            }
        }
        
        return lista;
    }
    
    public static int[] cantidadVehiculosAños(int año1, int año2){
        Iterator<Vehiculo> it;
        int contador[] = new int[4];
        
        it = datos.iterator();
        while(it.hasNext()){
            Vehiculo v = it.next();
            
            if(v instanceof Auto){
                if(v.getAño() == año1){
                    contador[0]++;
                }
                
                if(v.getAño() == año2){
                    contador[2]++;
                }
            }
            
            if(v instanceof Moto){
                if(v.getAño() == año1){
                    contador[1]++;
                }
                
                if(v.getAño() == año2){
                    contador[3]++;
                }
            }
        }
        
        return contador;
    }
    
}
