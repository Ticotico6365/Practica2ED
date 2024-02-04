import Clases.FechaImpl;
import Clases.PersonaImpl;
import Clases.VueloImpl;
import Interfaces.Fecha;
import Interfaces.Persona;
import Interfaces.Vuelo;

public class text {
    public static void main(String[] args) {
        Fecha fecha = new FechaImpl(12,6,2020);
        Persona piloto = new PersonaImpl("Alberto Sanabria García","7787456I",26);
        Vuelo vuelo = new VueloImpl("kljhasdfrbh5454","Albacete",50D,213,198,fecha,piloto);

        System.out.println(vuelo);
        System.out.println(vuelo.getRecaudacion());
    }
}
