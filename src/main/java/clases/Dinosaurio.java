/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Rafa
 */
public class Dinosaurio{
    public String _id;
    public String nombre;
    public String altura;
    public String ataque;

    public Dinosaurio(String id, String nombre, String altura, String ataque) {
        this._id = id;
        this.nombre = nombre;
        this.altura = altura;
        this.ataque = ataque;
    }
    
    public Dinosaurio(){
        
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getAltura() {
        return altura;
    }

    public String getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return getNombre();
    }

}

