/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allan
 */
public class PacienteAP extends Persona {
    private int HistorialAp;
    private String EnfermedadAp;

    public PacienteAP(int HistorialAp, String EnfermedadAp, String Nombre, int Edad, String Direccion) {
        super(Nombre, Edad, Direccion);
        this.HistorialAp = HistorialAp;
        this.EnfermedadAp = EnfermedadAp;
    }

    public int getHistorialAp() {
        return HistorialAp;
    }

    public void setHistorialAp(int HistorialAp) {
        this.HistorialAp = HistorialAp;
    }

    public String getEnfermedadAp() {
        return EnfermedadAp;
    }

    public void setEnfermedadAp(String EnfermedadAp) {
        this.EnfermedadAp = EnfermedadAp;
    }
    
    
    
}
