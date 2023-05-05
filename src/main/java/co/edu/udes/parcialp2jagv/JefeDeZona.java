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
    private ArrayList vendedores;

    public JefeDeZona(Secretario secretary, CocheEmpresa car, String offiece, String name, String lastname, String dni, String adress, String phone, double salary, int antiquity) {
        super(name, lastname, dni, adress, phone, salary, antiquity, 0.2);
        this.secretary = secretary;
        this.car = car;
        this.offiece = offiece;
        this.vendedores = new ArrayList();
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
        
        String retorno = super.toString() + "Vendedor" + "\n Vendedores: ";;
        
        if (vendedores.isEmpty()) {
            retorno += "Aun no tiene vendedores.";
        }
        else{
            for (int i = 0; i < vendedores.size(); i++) {
                retorno += "\n \t " + vendedores.get(i).toString();
            }
        }
        return retorno;
    }
}
