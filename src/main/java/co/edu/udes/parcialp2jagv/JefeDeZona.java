/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialp2jagv;

import java.util.ArrayList;

/**
 *
 * @author LabSispc15
 */
public class JefeDeZona extends Empleado {
    
    private Secretario secretary;
    private CocheEmpresa car;
    private String offiece;
    private ArrayList vendedores = new ArrayList();

    public JefeDeZona(Secretario secretary, CocheEmpresa car, String offiece, String name, String lastname, String dni, String adress, String phone, double salary, int antiquity, Empleado employ) {
        super(name, lastname, dni, adress, phone, salary, antiquity, employ, 0.2);
        this.secretary = secretary;
        this.car = car;
        this.offiece = offiece;
    }

    public JefeDeZona() {
    }
    
    public void changeSecretary(Secretario secretary){
        this.secretary = secretary;
    }
    
    public void changeCar(CocheEmpresa car){
        this.car = car;
    }
    
    public void addVendedor(Vendedor seller){
        vendedores.add(seller);
    }
    
    public void removeVendedor(int index){
        vendedores.remove(index);
    }

    public ArrayList getVendedores() {
        return vendedores;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Jefe de zona";
    }
}
