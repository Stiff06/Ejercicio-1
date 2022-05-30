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

public class Alumno {
    public ArrayList<Matricula> pertenece = new ArrayList();    

    private String codigo;
    private String apellidos;
    private String nombres;
    private String condicionEco;
    private String correo;

    public ArrayList<Matricula> getPertenece() {
        return pertenece;
    }

    public void setPertenece(ArrayList<Matricula> pertenece) {
        this.pertenece = pertenece;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCondicionEco() {
        return condicionEco;
    }

    public void setCondicionEco(String condicionEco) {
        this.condicionEco = condicionEco;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
