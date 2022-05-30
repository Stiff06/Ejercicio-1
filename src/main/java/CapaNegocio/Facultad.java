/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Facultad {
    
    public ArrayList<Escuela> incluye = new ArrayList();
    public Facultad (){incluye = new ArrayList();}
    


    private String nombre;    
    private String decano;
    private String ubicacion;
    private String convenio;

    public ArrayList<Escuela> getIncluye() {
        return incluye;
    }

    public void setIncluye(ArrayList<Escuela> incluye) {
        this.incluye = incluye;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }


}
