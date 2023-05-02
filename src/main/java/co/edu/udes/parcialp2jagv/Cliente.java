/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialp2jagv;

/**
 *
 * @author LabSispc15
 */
public class Cliente {
    private String name;
    private String lastname;
    private String dni;
    private String adress;

    public Cliente(String name, String lastname, String dni, String adress) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name=" + name + ", lastname=" + lastname + ", dni=" + dni + ", adress=" + adress + '}';
    }
    
    
}
