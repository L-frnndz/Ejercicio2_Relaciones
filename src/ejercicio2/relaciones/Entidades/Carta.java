package ejercicio2.relaciones.Entidades;

public class Carta {
    
    private final String palo;
    private final Integer numero;

    public Carta(String palo, Integer numero) {
        this.palo = palo;
        this.numero = numero;
    }

    
    public String getPalo() {
        return palo;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero+ "de" +palo;
    }
    
    
}
