/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class Agranda extends DecoradorPlato{

    private Plato plato;
    
    public Agranda(Plato plato){
        this.plato=plato;
    }
    
    @Override
    public String getDetallePlato() {
        return this.plato.getDetallePlato()+"\nAgranda tu combo";
    }
    
}
