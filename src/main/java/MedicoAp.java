/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allan
 */
public class MedicoAp extends Persona{
    private String EspecialidadAP;
    private int ExperienciaAP;

    public MedicoAp(String EspecialidadAP, int ExperienciaAP, String NombreAP, int EdadAP, String DireccionAP) {
        super(NombreAP, EdadAP, DireccionAP);
        this.EspecialidadAP = EspecialidadAP;
        this.ExperienciaAP = ExperienciaAP;
    }

    public String getEspecialidadAP() {
        return EspecialidadAP;
    }

    public void setEspecialidadAP(String EspecialidadAP) {
        this.EspecialidadAP = EspecialidadAP;
    }

    public int getExperienciaAP() {
        return ExperienciaAP;
    }

    public void setExperienciaAP(int ExperienciaAP) {
        this.ExperienciaAP = ExperienciaAP;
    }

    
    
}

  