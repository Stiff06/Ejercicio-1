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
public class CatalogoAsign {
    
    public ArrayList<Asignatura> integra = new ArrayList();
    public Escuela escuela;

    private String cantCred;
    private String codigo;

    public ArrayList<Asignatura> getIntegra() {
        return integra;
    }

    public void setIntegra(ArrayList<Asignatura> integra) {
        this.integra = integra;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public String getCantCred() {
        return cantCred;
    }

    public void setCantCred(String cantCred) {
        this.cantCred = cantCred;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
