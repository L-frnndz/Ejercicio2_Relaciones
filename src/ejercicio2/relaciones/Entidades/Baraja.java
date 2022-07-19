package ejercicio2.relaciones.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private final ArrayList<Carta> cartasDisponibles;
    private final ArrayList<Carta> cartasUsadas;
    private Carta cartaActual;

    public Baraja(ArrayList<Carta> cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
        this.cartasUsadas = new ArrayList();
    }

    public List<Carta> getCartasDisponibles() {
        return cartasDisponibles;
    }

    public List<Carta> getCartasUsadas() {
        return cartasUsadas;
    }

    public Carta getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(Carta cartaActual) {
        this.cartaActual = cartaActual;
    }
    
    
}
