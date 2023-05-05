/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialp2jagv;

/**
 *
 * @author LabSispc15
 */
public class Secretario extends Empleado{
    
    private String offiece;
    private String faxNumber;

    public Secretario(String offiece, String faxNumber, String name, String lastname, String dni, String adress, String phone, double salary, int antiquity) {
        super(name, lastname, dni, adress, phone, salary, antiquity, 0.05);
        this.offiece = offiece;
        this.faxNumber = faxNumber;
    }

    public Secretario() {
    }
    
    @Override
    public String toString() {
        return super.toString() + " Secretario";
    }
}
