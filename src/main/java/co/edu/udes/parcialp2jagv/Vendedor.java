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
public class Vendedor extends Empleado{
    
    private CocheEmpresa car;
    private String cellphone;
    private String areaVenta;
    private double porcentajeComisiones;
    private ArrayList clientes;
    

    public Vendedor(CocheEmpresa car, String cellphone, String areaVenta, double porcentajeComisiones, String name, String lastname, String dni, String adress, String phone, double salary, int antiquity, Empleado employ) {
        super(name, lastname, dni, adress, phone, salary, antiquity, employ, 0.1);
        this.car = car;
        this.cellphone = cellphone;
        this.areaVenta = areaVenta;
        this.porcentajeComisiones = porcentajeComisiones;
    }

    public Vendedor() {
    }
    
    public void addClient(Cliente client){
        clientes.add(client);
    }
    
    public void removeClient(int index){
        clientes.remove(index);
    }
    
    public void changeCar(CocheEmpresa car){
        this.car = car;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Vendedor";
    }

    public ArrayList getClientes() {
        return clientes;
    }
    
    
}
