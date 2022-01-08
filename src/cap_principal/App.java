/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_principal;

import basicas.Consola;
import cap_datos.ListaVehiculos;
import cap_logica.Auto;
import cap_logica.Moto;
import cap_logica.TipoCombustible;
import cap_logica.TipoModelo;
import cap_logica.TipoMotor;
import cap_logica.Vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
import menu.Menu;
import menu.Opcion;

/**
 *
 * @author Sh
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consola objConsola = new Consola();
        Menu objMenu = new Menu();
        
        int opcion;
        
        defineMenu(objMenu);
        
        do{
            opcion = objMenu.display();
            
            switch(opcion){
                case 11:
                        Auto objA = new Auto();
                        
                        objA.setPropietario(objConsola.leer("Ingrese nombre de propietario : "));
                        objA.setCosto(objConsola.leer("Ingrese costo del auto[1-100.000] : ", 1, 100000));
                        objA.setPlaca(objConsola.leer("Ingrese placa : "));
                        objA.setMarca(objConsola.leer("Ingrese marca : "));
                            System.out.println("\t[1] " + TipoMotor.MOTOR1.getNombre());
                            System.out.println("\t[2] " + TipoMotor.MOTOR2.getNombre());
                            System.out.println("\t[3] " + TipoMotor.MOTOR3.getNombre());
                            System.out.println("\t[4] " + TipoMotor.MOTOR4.getNombre());
                            
                            int opc = objConsola.leer("Ingrese motor[1-4] : ", 1, 4);
                            TipoMotor auxTipoMotor = null;
                            
                            switch(opc){
                                case 1: auxTipoMotor = TipoMotor.MOTOR1;
                                    break;
                                case 2: auxTipoMotor = TipoMotor.MOTOR2;
                                    break;
                                case 3: auxTipoMotor = TipoMotor.MOTOR3;
                                    break;
                                case 4: auxTipoMotor = TipoMotor.MOTOR4;
                                    break;
                            }
                        objA.setMotor(auxTipoMotor);
                            System.out.println("\t[1] " + TipoCombustible.GAS.name());
                            System.out.println("\t[2] " + TipoCombustible.GASOLINA.name());
                            
                            int opc1 = objConsola.leer("Ingrese combustible[1-2] : ", 1, 2);
                            TipoCombustible auxTipoCombustible = null;
                            
                            switch(opc1){
                                case 1: auxTipoCombustible = TipoCombustible.GAS;
                                    break;
                                case 2: auxTipoCombustible = TipoCombustible.GASOLINA;
                                    break;
                            }
                        objA.setCombustible(auxTipoCombustible);
                        objA.setAño(objConsola.leer("Ingrese año de adquisicion[1900-2019] : ", 1900, 2019));
                        
                        ListaVehiculos.agregar(objA);
                        
                        System.out.println("\t* Auto registrado");
                    break;
                case 12:
                        Moto objM = new Moto();
                        
                        objM.setPropietario(objConsola.leer("Ingrese nombre de propietario : "));
                        objM.setCosto(objConsola.leer("Ingrese costo de la moto[1-100.000] : ", 1, 100000));
                        objM.setPlaca(objConsola.leer("Ingrese placa : "));
                        objM.setMarca(objConsola.leer("Ingrese marca : "));
                            System.out.println("\t[1] " + TipoModelo.URBANA.name());
                            System.out.println("\t[2] " + TipoModelo.DEPORTIVA.name());
                            
                            int opc2 = objConsola.leer("Ingrese modelo[1-2] : ", 1, 2);
                            TipoModelo auxTipoModelo = null;
                            
                            switch(opc2){
                                case 1: auxTipoModelo = TipoModelo.URBANA;
                                    break;
                                case 2: auxTipoModelo = TipoModelo.DEPORTIVA;
                                    break;
                            }
                        objM.setModelo(auxTipoModelo);
                        objM.setVelocidadMax(objConsola.leer("Ingrese velocidad maxima[1-400] : ", 1, 400));
                        objM.setAño(objConsola.leer("Ingrese año de adquisicion[1900-2019] : ", 1900, 2019));
                    
                        ListaVehiculos.agregar(objM);
                        
                        System.out.println("\t* Moto registrada");
                    break;
                    
                case 21:
                        Auto objA1;
                        String auxPlacaA;
                        
                        auxPlacaA = objConsola.leer("Ingrese placa a buscar : ");
                        objA1 = (Auto) ListaVehiculos.buscarAuto(auxPlacaA);
                        
                        if(objA1 != null){
                            objA1.setPropietario(objConsola.leer("Ingrese nombre de propietario : "));
                            objA1.setCosto(objConsola.leer("Ingrese costo del auto[1-100.000] : ", 1, 100000));
                            objA1.setPlaca(objConsola.leer("Ingrese placa : "));
                            objA1.setMarca(objConsola.leer("Ingrese marca : "));
                                System.out.println("\t[1] " + TipoMotor.MOTOR1.getNombre());
                                System.out.println("\t[2] " + TipoMotor.MOTOR2.getNombre());
                                System.out.println("\t[3] " + TipoMotor.MOTOR3.getNombre());
                                System.out.println("\t[4] " + TipoMotor.MOTOR4.getNombre());

                                int opc3 = objConsola.leer("Ingrese motor[1-4] : ", 1, 4);
                                TipoMotor auxMotor = null;

                                switch(opc3){
                                    case 1: auxMotor = TipoMotor.MOTOR1;
                                        break;
                                    case 2: auxMotor = TipoMotor.MOTOR2;
                                        break;
                                    case 3: auxMotor = TipoMotor.MOTOR3;
                                        break;
                                    case 4: auxMotor = TipoMotor.MOTOR4;
                                        break;
                                }
                            objA1.setMotor(auxMotor);
                                System.out.println("\t[1] " + TipoCombustible.GAS.name());
                                System.out.println("\t[2] " + TipoCombustible.GASOLINA.name());

                                int opc4 = objConsola.leer("Ingrese combustible[1-2] : ", 1, 2);
                                TipoCombustible auxCombustible = null;

                                switch(opc4){
                                    case 1: auxCombustible = TipoCombustible.GAS;
                                        break;
                                    case 2: auxCombustible = TipoCombustible.GASOLINA;
                                        break;
                                }
                            objA1.setCombustible(auxCombustible);
                            objA1.setAño(objConsola.leer("Ingrese año de adquisicion[1900-2019] : ", 1900, 2019));
                            
                            System.out.println("\t* Auto modificado");
                        }else{
                            System.out.println("\t* Auto no encontrado");
                        }
                    break;
                case 22:
                        Moto objM1;
                        String auxPlacaM;
                        
                        auxPlacaM = objConsola.leer("Ingrese placa a buscar : ");
                        objM1 = (Moto) ListaVehiculos.buscarMoto(auxPlacaM);;
                        
                        if(objM1 != null){
                            objM1.setPropietario(objConsola.leer("Ingrese nombre de propietario : "));
                            objM1.setCosto(objConsola.leer("Ingrese costo de la moto[1-100.000] : ", 1, 100000));
                            objM1.setPlaca(objConsola.leer("Ingrese placa : "));
                            objM1.setMarca(objConsola.leer("Ingrese marca : "));
                                System.out.println("\t[1] " + TipoModelo.URBANA.name());
                                System.out.println("\t[2] " + TipoModelo.DEPORTIVA.name());

                                int opc5 = objConsola.leer("Ingrese modelo[1-2] : ", 1, 2);
                                TipoModelo auxModelo = null;

                                switch(opc5){
                                    case 1: auxModelo = TipoModelo.URBANA;
                                        break;
                                    case 2: auxModelo = TipoModelo.DEPORTIVA;
                                        break;
                                }
                            objM1.setModelo(auxModelo);
                            objM1.setVelocidadMax(objConsola.leer("Ingrese velocidad maxima[1-400] : ", 1, 400));
                            objM1.setAño(objConsola.leer("Ingrese año de adquisicion[1900-2019] : ", 1900, 2019));
                            
                            System.out.println("\t* Moto modificada");
                        }else{
                            System.out.println("\t* Moto no encontrada");
                        }
                    break;
                    
                case 31:
                        ArrayList<Vehiculo> list;
                        Iterator<Vehiculo> it;
                        
                        String tipo;
                        String auxPersona;
                        
                        System.out.println("");
                        tipo = objConsola.leer("Auto o Moto : ");
                        auxPersona = objConsola.leer("Ingrese nombre del propietario : ");
                        list = ListaVehiculos.listaAutosMotosSegunPersona(tipo,auxPersona);
                        
                        System.out.println("\nLISTA DE MOTOS O AUTOS DE UNA DETERMINADA PERSONA");
                        
                        if(!list.isEmpty()){
                            it = list.iterator();
                            while(it.hasNext()){
                                Vehiculo v = it.next();

                                System.out.println(v.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 32:
                        int contador[] = ListaVehiculos.cantidadAutosMotor();
                        
                        System.out.println("\nCANTIDAD DE AUTOS DE ACUERDO AL TIPO DE MOTOR");
                        System.out.println("MOTOR 1.3: " + contador[0]);
                        System.out.println("MOTOR 1.6: " + contador[1]);
                        System.out.println("MOTOR 2.0: " + contador[2]);
                        System.out.println("MOTOR 3.0: " + contador[3]);
                    break;
                case 33:
                        ArrayList<Vehiculo> list1;
                        Iterator<Vehiculo> it1;
                        
                        String tipo1;
                        int año;
                        
                        System.out.println("");
                        tipo1 = objConsola.leer("Auto o Moto : ");
                        año = objConsola.leer("Ingrese año[1900-2019] : ", 1900, 2019);
                        list1 = ListaVehiculos.listaAutosMotosSegunAño(tipo1, año);
                        
                        System.out.println("\nDADO UN AÑO, MOSTRAR MOTOS O AUTOS ADQUIRIDOS ESE AÑO");
                        
                        if(!list1.isEmpty()){
                            it1 = list1.iterator();
                            while(it1.hasNext()){
                                Vehiculo v = it1.next();

                                System.out.println(v.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 34:
                        ArrayList<Moto> listMoto;
                        Iterator<Moto> it2;
                        
                        listMoto = ListaVehiculos.listaMotosUrbanas();
                        
                        System.out.println("\nLISTA MOTOS URBANA CUYO COSTO ES INFERIOR A 3500");
                        
                        if(!listMoto.isEmpty()){
                            it2 = listMoto.iterator();
                            while(it2.hasNext()){
                                Moto m = it2.next();

                                System.out.println(m.presentarLineal());
                            }
                        }else{
                            System.out.println("\t* Lista vacia");
                        }
                    break;
                case 35:
                        int cantidad[];
                        int año1;
                        int año2;
                        
                        System.out.println("");
                        año1 = objConsola.leer("Ingrese primer año[1900-2019] : ", 1900, 2019);
                        año2 = objConsola.leer("Ingrese segundo año[1900-2019] : ", 1900, 2019);
                        cantidad = ListaVehiculos.cantidadVehiculosAños(año1, año2);
                        
                        System.out.println("\nCANTIDAD DE VEHICULOS REGISTRADOS EN DOS AÑOS");
                        System.out.println(año1);
                        System.out.println("\tAutos: " + cantidad[0]);
                        System.out.println("\tMotos: " + cantidad[1]);
                        System.out.println(año2);
                        System.out.println("\tAutos: " + cantidad[2]);
                        System.out.println("\tMotos: " + cantidad[3]);
                    break;
            }
        }while(opcion != 99);
    }
    
    public static void defineMenu(Menu objMenu){
        objMenu.agregar(new Opcion(11,"Agregar Auto"));
        objMenu.agregar(new Opcion(12,"Agregar Moto"));
        
        objMenu.agregar(new Opcion(21,"Modificar Auto"));
        objMenu.agregar(new Opcion(22,"Modificar Moto"));
        
        objMenu.agregar(new Opcion(31,"Listado de autos o motos de una determinada persona"));
        objMenu.agregar(new Opcion(32,"Mostrar la cantidad de autos de acuerdo al tipo de motor"));
        objMenu.agregar(new Opcion(33,"Dado un año específico, mostrar autos o motos adquiridos ese año"));
        objMenu.agregar(new Opcion(34,"Mostrar las motos de tipo urbana cuyo costo sea inferior a los 3500 soles"));
        objMenu.agregar(new Opcion(35,"Mostrar la cantidad de vehículos registrados en dos años específicos"));
        
        objMenu.agregar(new Opcion(99,"Salir"));
    }
    
}
