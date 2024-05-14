package lorenzo.automoviles.logica;

import java.util.List;
import lorenzo.automoviles.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    

    public void agregarAutomovil(String marca, String modelo, String color, String motor, String patente, int cantPuerta) {
        
        Automovil auto = new Automovil();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuerta(cantPuerta);
        
        controlPersis.agregarAutomovil(auto);}

    public List<Automovil> traerAuros() {
        return controlPersis.TraerAutos();
    
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
        
    }

    public void modificarAuto(Automovil auto, String marca, String modelo, String color, String motor, String patente, int cantPuerta) {
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuerta(cantPuerta);
        
        controlPersis.modificarAuto(auto);
    }
    
    
}
