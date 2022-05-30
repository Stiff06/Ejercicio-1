/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;


import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Semestre {
    
    public ArrayList<Matricula> existe = new ArrayList();    

    private Date fechaInicio;
    private Date fechaFin;
    private String mensualidad;

    public ArrayList<Matricula> getExiste() {
        return existe;
    }

    public void setExiste(ArrayList<Matricula> existe) {
        this.existe = existe;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }
}
