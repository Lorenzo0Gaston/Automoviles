package lorenzo.automoviles.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String marca;
    private String modelo;
    private String color;
    private String motor;
    private String patente;
    private int cantPuerta;

    public Automovil() {
    }

    public Automovil(int id, String marca, String modelo, String color, String motor, String patente, int cantPuerta) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.patente = patente;
        this.cantPuerta = cantPuerta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantPuerta() {
        return cantPuerta;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCantPuerta(int cantPuerta) {
        this.cantPuerta = cantPuerta;
    }
    
    
    
}
