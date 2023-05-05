/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcialp2jagv;

/**
 *
 * @author LabSispc15
 */
public class Empleado {
    
    private String name;
    private String lastname;
    private String dni;
    private String adress;
    private String phone;
    private double salary;
    private double porcentaje;
    private int antiquity;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String name, String lastname, String dni, String adress, String phone, double salary, int antiquity, double percentage) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.adress = adress;
        this.phone = phone;
        this.salary = salary;
        this.porcentaje = percentage;
        this.antiquity = antiquity;
        this.supervisor = null;
        
        for (int i = 0; i < this.antiquity; i++) {
            increaseSalary();
        }
    }

    @Override
    public String toString() {
        
        String retorno;
        if (supervisor != null) {
            retorno = " Nombre = " + name + "\n Apellido = " + lastname + "\n DNI = " + dni + "\n Direccion = " + adress + "\n Numero de telefono = " + phone + "\n Salario = " + salary + "\n Antiguedad = " + antiquity + "\n Supervisor = " + supervisor.getName() + " " + supervisor.getLastname() +"\n Puesto en la empresa = ";
        }
        else{
            retorno = " Nombre = " + name + "\n Apellido = " + lastname + "\n DNI = " + dni + "\n Direccion = " + adress + "\n Numero de telefono = " + phone + "\n Salario = " + salary + "\n Antiguedad = " + antiquity + "\n Supervisor = Pendiente de asignar" + "\n Puesto en la empresa = ";
        }
        return retorno;
    }
    
    public void changeSupervisor(Empleado supervisor){
        this.supervisor = supervisor;
    }
    
    public void increaseSalary(){
        this.salary = this.salary + this.salary*this.porcentaje;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    
    
}
