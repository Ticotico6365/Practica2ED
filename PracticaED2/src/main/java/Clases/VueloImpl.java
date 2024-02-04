package Clases;

import Interfaces.Fecha;
import Interfaces.Vuelo;
import Interfaces.Persona;

public class VueloImpl implements Vuelo {
    private String codigoDeVuelo;
    private String destino;
    private Double precio;
    private Integer numPlazas;
    private Integer numPasajeros;
    private Fecha fechaDeSalida;
    private Persona piloto;

    // getters-setetrs
    public String getCodigoDeVuelo() {
        return codigoDeVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getNumPlazas() {
        return numPlazas;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Fecha getFechaDeSalida() {
        return fechaDeSalida;
    }

    public Persona getPiloto() {
        return piloto;
    }

    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }

    //constructores
        //vacio
    public VueloImpl() {
    }
        //completo
    public VueloImpl(String codigoDeVuelo, String destino, Double precio, Integer numPlazas, Integer numPasajeros, Fecha fechaDeSalida, Persona piloto) {
        this.codigoDeVuelo = codigoDeVuelo;
        this.destino = destino;
        this.precio = precio;
        this.numPlazas = numPlazas;
        this.numPasajeros = numPasajeros;
        this.fechaDeSalida = fechaDeSalida;
        this.piloto = piloto;
    }

    //métodos
    public Double getRecaudacion() {
        return getPrecio()*getNumPasajeros();
    }

    //toString
    public String toString() {
        return getCodigoDeVuelo() + " (" + getDestino() + ") -" + getPiloto() + " -" + getFechaDeSalida();
    }

}
