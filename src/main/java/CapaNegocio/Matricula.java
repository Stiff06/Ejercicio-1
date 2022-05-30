/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author User
 */
public class Matricula {
    public Semestre existe;
    public Alumno pertenece;
    public Escuela tiene;    

    private String valor;
    private String tipo;
    private String creditos;
    private String grado;

    public Semestre getExiste() {
        return existe;
    }

    public void setExiste(Semestre existe) {
        this.existe = existe;
    }

    public Alumno getPertenece() {
        return pertenece;
    }

    public void setPertenece(Alumno pertenece) {
        this.pertenece = pertenece;
    }

    public Escuela getTiene() {
        return tiene;
    }

    public void setTiene(Escuela tiene) {
        this.tiene = tiene;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}
