package ejercicio2.relaciones.Servicios;

import ejercicio2.relaciones.Entidades.Baraja;
import ejercicio2.relaciones.Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServicioBaraja {

    public Baraja crearBaraja() {
        ArrayList<Carta> barajaCartas = new ArrayList();
        String[] tipos = {"ESPADA", "BASTO", "COPA", "ORO"};
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (String palos : tipos) {
            for (Integer num : numeros) {
                barajaCartas.add(new Carta(palos, num));
            }
        }
        return new Baraja(barajaCartas);
    }

    public void barajar(List<Carta> cartasDisponibles) {

        Collections.shuffle(cartasDisponibles);
    }

    public Carta siguienteCarta(Baraja barajaActual) {

        ArrayList<Carta> cartasDisponibles = (ArrayList<Carta>) barajaActual.getCartasDisponibles();
        ArrayList<Carta> cartasUsadas = (ArrayList<Carta>) barajaActual.getCartasUsadas();

        if (cartasDisponibles.isEmpty()) {
            return null;
        }

        Carta cartaActual = cartasDisponibles.get(0);

        cartasDisponibles.remove(0);

        cartasUsadas.add(cartaActual);

        return cartaActual;
    }

    public void cartaDisponible(ArrayList<Carta> cartasDisponibles) {
        System.out.println("La baraja tiene " + cartasDisponibles.size() + " cartas disponibles");
    }
}
