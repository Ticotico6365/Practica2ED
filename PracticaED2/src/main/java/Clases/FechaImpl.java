package Clases;

import Interfaces.Fecha;

public class FechaImpl implements Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anyo;

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnyo() {
        return anyo;
    }

    //constructores
        //vacio
    public FechaImpl() {
    }
        //completo
    public FechaImpl(Integer dia, Integer mes, Integer anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    //toString

    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnyo();
    }
}
