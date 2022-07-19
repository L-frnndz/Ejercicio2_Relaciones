package ejercicio2.relaciones.Servicios;

import ejercicio2.relaciones.Entidades.Baraja;

public class Juego {
    
    public void menu (){
        
        ServicioBaraja servBaraja = new ServicioBaraja();
        Baraja barajaActual = servBaraja.crearBaraja();
    }
}
