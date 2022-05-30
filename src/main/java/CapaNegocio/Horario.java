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
public class Horario {

    public ArrayList<Asignatura> corresponde = new ArrayList();

    private String turno;
    private String dias;

    public ArrayList<Asignatura> getCorresponde() {
        return corresponde;
    }

    public void setCorresponde(ArrayList<Asignatura> corresponde) {
        this.corresponde = corresponde;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
