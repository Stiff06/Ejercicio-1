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
public class Asignatura {
    public ArrayList<Horario> corresponde = new ArrayList();    
    public CatalogoAsign integra;  

    private String nombre;
    private String codigo;
    private String preRequisito;
    private String cantidadHoras;
    private String docente;
    private String cantidadCred;
    private String NumeroCiclo;

    public ArrayList<Horario> getCorresponde() {
        return corresponde;
    }

    public void setCorresponde(ArrayList<Horario> corresponde) {
        this.corresponde = corresponde;
    }

    public CatalogoAsign getIntegra() {
        return integra;
    }

    public void setIntegra(CatalogoAsign integra) {
        this.integra = integra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(String cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getCantidadCred() {
        return cantidadCred;
    }

    public void setCantidadCred(String cantidadCred) {
        this.cantidadCred = cantidadCred;
    }

    public String getNumeroCiclo() {
        return NumeroCiclo;
    }

    public void setNumeroCiclo(String NumeroCiclo) {
        this.NumeroCiclo = NumeroCiclo;
    }
}
