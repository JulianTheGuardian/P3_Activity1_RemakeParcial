/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialp2jagv;

/**
 *
 * @author LabSispc15
 */
public class CocheEmpresa {
    
    private String matricula;
    private String modelo;
    private String marca;

    public CocheEmpresa() {
    }

    public CocheEmpresa(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "CocheEmpresa{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
    
}
