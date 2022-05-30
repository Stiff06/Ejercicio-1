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
public class Escuela {

    public ArrayList<Matricula> tiene = new ArrayList();  
    public CatalogoAsign catalogoAsign;
    public Escuela(){
        catalogoAsign = new CatalogoAsign();
    }


    private String Nombre;
    private String cantidadCiclo;
    private String cantidadCredito;

    public ArrayList<Matricula> getTiene() {
        return tiene;
    }

    public void setTiene(ArrayList<Matricula> tiene) {
        this.tiene = tiene;
    }

    public CatalogoAsign getCatalogoAsign() {
        return catalogoAsign;
    }

    public void setCatalogoAsign(CatalogoAsign catalogoAsign) {
        this.catalogoAsign = catalogoAsign;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCantidadCiclo() {
        return cantidadCiclo;
    }

    public void setCantidadCiclo(String cantidadCiclo) {
        this.cantidadCiclo = cantidadCiclo;
    }

    public String getCantidadCredito() {
        return cantidadCredito;
    }

    public void setCantidadCredito(String cantidadCredito) {
        this.cantidadCredito = cantidadCredito;
    }
   
}
