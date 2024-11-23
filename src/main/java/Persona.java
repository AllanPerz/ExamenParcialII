/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allan
 */
public class Persona {
    private String NombreAP;
    private int EdadAP;
    private String DireccionAP;

    public Persona(String NombreAP, int EdadAP, String DireccionAP) {
        this.NombreAP = NombreAP;
        this.EdadAP = EdadAP;
        this.DireccionAP = DireccionAP;
    }

    public String getNombreAP() {
        return NombreAP;
    }

    public void setNombreAP(String NombreAP) {
        this.NombreAP = NombreAP;
    }

    public int getEdadAP() {
        return EdadAP;
    }

    public void setEdadAP(int EdadAP) {
        this.EdadAP = EdadAP;
    }

    public String getDireccionAP() {
        return DireccionAP;
    }

    public void setDireccionAP(String DireccionAP) {
        this.DireccionAP = DireccionAP;
    }

    
}

    