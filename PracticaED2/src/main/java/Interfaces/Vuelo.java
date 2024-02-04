package Interfaces;

public interface Vuelo {
    String getCodigoDeVuelo();
    String getDestino();
    Double getPrecio();
    void setPrecio(Double precio);
    Integer getNumPlazas();
    Integer getNumPasajeros();
    void setNumPasajeros(Integer numPasajeros);
    Fecha getFechaDeSalida();
    Persona getPiloto();
    void setPiloto(Persona piloto);
    Double getRecaudacion();
}
