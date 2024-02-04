package Clases;

import Interfaces.Persona;

public class PersonaImpl implements Persona {
    private String nombreCompelto;
    private String dni;
    private Integer edad;

    public String getNombreCompelto() {
        return nombreCompelto;
    }

    public void setNombreCompelto(String nombreCompelto) {
        this.nombreCompelto = nombreCompelto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //constructores
        //vacio
    public PersonaImpl() {
    }
        //completo
    public PersonaImpl(String nombreCompelto, String dni, Integer edad) {
        this.nombreCompelto = nombreCompelto;
        this.dni = dni;
        this.edad = edad;
    }

    //toString

    public String toString() {
        return getNombreCompelto() + ", " + getDni() + ", " + getEdad() + " años";
    }
}
