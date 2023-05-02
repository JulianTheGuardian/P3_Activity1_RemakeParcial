/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udes.parcialp2jagv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LabSispc15
 */
public class ParcialP2JAGV {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<CocheEmpresa> carList = new ArrayList();
        ArrayList<Secretario> secretaryList = new ArrayList();
        ArrayList<Vendedor> sellerList = new ArrayList();
        ArrayList<JefeDeZona> bossesList = new ArrayList();
        ArrayList<Empleado> employList = new ArrayList();

        int menu, submenu;
        
        CocheEmpresa auto = new CocheEmpresa();
        
        while(true){
            
            System.out.println("\nBienvenido, ¿Con que desea trabajar hoy en la empresa?");
            System.out.println("1. Secretario");
            System.out.println("2. Vendedor");
            System.out.println("3. Jefe de zona"); 
            System.out.println("4. Agregar coche de empresa");
            System.out.println("5. Salir");           
            menu = scan.nextInt();
            scan.nextLine();
            
            switch(menu){
                
                case 1 -> {
                    System.out.println("\nBienvenido, ¿Que desea hacer con el secretario.?");
                    System.out.println("1. Agregar nuevo secretario");
                    System.out.println("2. Ver informacion de los secreatarios");
                    System.out.println("3. Cambiar supervisor");
                    System.out.println("4. Salir");
                    submenu = scan.nextInt();
                    scan.nextLine();
                    
                    subMenu(menu, submenu, scan, auto, secretaryList, sellerList, bossesList, carList, employList);
                }
                    
                case 2 -> {
                    System.out.println("\nBienvenido, ¿Que desea hacer con el vendedor.?");
                    System.out.println("1. Agregar nuevo vendedor");
                    System.out.println("2. Ver informacion de los vendedores");
                    System.out.println("3. Agregar un nuevo cliente a un vendedor");
                    System.out.println("4. Eliminar cliente de un vendedor");
                    System.out.println("5. Cambiar el coche de un vendedor");
                    System.out.println("6. Cambiar supervisor");
                    System.out.println("7. Salir");
                    submenu = scan.nextInt();
                    scan.nextLine();
                    
                    subMenu(menu, submenu, scan, auto, secretaryList, sellerList, bossesList, carList, employList);

                }
                
                case 3 -> {
                    System.out.println("\nBienvenido, ¿Que desea hacer con el Jefe de zona.?");
                    System.out.println("1. Agregar nuevo Jefe de zona");
                    System.out.println("2. Ver informacion de los Jefes de zona");
                    System.out.println("3. Asignar un nuevo vendedor a un Jefe de zona");
                    System.out.println("4. Eliminar un vendedor de un Jefe de zona");
                    System.out.println("5. Cambar el coche de un Jefe de zona");
                    System.out.println("6. Cambiar supervisor");
                    System.out.println("7. Salir");
                    submenu = scan.nextInt();
                    scan.nextLine();
                    
                    subMenu(menu, submenu, scan, auto, secretaryList, sellerList, bossesList, carList, employList);

                }
                    
                case 4 -> {
                    System.out.println("Ingrese la matricula del nuevo coche de la empresa.");
                    String matricula = scan.nextLine();
                    
                    System.out.println("Ingrese el modelo del nuevo coche de la empresa.");
                    String modelo = scan.nextLine();
                    
                    System.out.println("Ingrese la marca del nuevo coche de la empresa.");
                    String marca = scan.nextLine();
                    
                    auto = new CocheEmpresa(matricula, modelo, marca);
                    
                    carList.add(auto);
                }
                    
                case 5 -> {
                    System.out.println("Muchas gracias por usar este servicio");
                    System.exit(0);
                }
            }
        } 
    }
    
    public static void subMenu(int menu, int submenu, Scanner scan, CocheEmpresa auto, ArrayList<Secretario> secretaryList, ArrayList<Vendedor> sellerList, ArrayList<JefeDeZona> bossesList, ArrayList<CocheEmpresa> carList, ArrayList<Empleado> employList){
        
        String name;
        String lastname;
        String dni;
        String adress;
        String phone;
        double salary;
        int antiquity;
        Empleado employ = new Empleado();
        
        String offiece;
        String faxNumber;
        Secretario secretary;
        
        String cellphone;
        String areaVenta;
        double porcentajeComisiones;
        Vendedor seller;
         
        JefeDeZona boss;
        
        
        switch(menu){
                
                case 1 -> {
                    
                    switch(submenu){
                
                        case 1 -> {
                            System.out.println("Ingrese el nombre del nuevo secretario de la empresa.");
                            name = scan.nextLine();

                            System.out.println("Ingrese el apellido del nuevo secretario de la empresa.");
                            lastname = scan.nextLine();

                            System.out.println("Ingrese el DNi del nuevo secretario de la empresa.");
                            dni = scan.nextLine();
                            
                            System.out.println("Ingrese la direccion del nuevo secretario de la empresa.");
                            adress = scan.nextLine();

                            System.out.println("Ingrese el numero de telefono del nuevo secretario de la empresa.");
                            phone = scan.nextLine();

                            System.out.println("Ingrese el salario del nuevo secretario de la empresa.");
                            salary = scan.nextDouble();
                            scan.nextLine();
                            
                            System.out.println("Ingrese la antiguedad del nuevo secretario de la empresa.");
                            antiquity = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingrese el numero de fax del nuevo secretario de la empresa.");
                            faxNumber = scan.nextLine();
                            
                            System.out.println("Ingrese donde queda la oficina del nuevo secretario de la empresa.");
                            offiece = scan.nextLine();
                            
                            secretary = new Secretario(offiece, faxNumber, name, lastname, dni, adress, phone, salary, antiquity, employ);
                            secretaryList.add(secretary);
                        }

                        case 2 -> {
                            for(Secretario secretario: secretaryList){
                                System.out.println(secretario.toString());
                                System.out.println("-----------");
                            }
                        }
                        
                        case 3 -> {
                            
                            for(Secretario secretario: secretaryList){
                                System.out.println(secretario.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del secretario al que desea cambiarle el supervisor.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(Empleado empleado: employList){
                                
                                if(empleado instanceof Secretario) {
                                    Secretario secret = (Secretario) empleado;
                                    System.out.println(secret.toString());
                                }
                                else if(empleado instanceof Vendedor){
                                    Vendedor vend = (Vendedor) empleado;
                                    System.out.println(vend.toString());
                                }
                                else{
                                    JefeDeZona jefe = (JefeDeZona) empleado;
                                    System.out.println(jefe.toString());
                                }
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del empleado que sera el nuevo supervisor.");
                            int indexSup = scan.nextInt();
                            scan.nextLine();
                            
                            secretaryList.get(index).changeSupervisor(employList.get(indexSup));
                        }
                    }
                }
                    
                case 2 -> {
                    switch(submenu){
                
                        case 1 -> {
                            System.out.println("Ingrese el nombre del nuevo vendedor de la empresa.");
                            name = scan.nextLine();

                            System.out.println("Ingrese el apellido del nuevo vendedor de la empresa.");
                            lastname = scan.nextLine();

                            System.out.println("Ingrese el DNI del nuevo vendedor de la empresa.");
                            dni = scan.nextLine();
                            
                            System.out.println("Ingrese la direccion del nuevo vendedor de la empresa.");
                            adress = scan.nextLine();

                            System.out.println("Ingrese el numero de telefono del nuevo vendedor de la empresa.");
                            phone = scan.nextLine();

                            System.out.println("Ingrese el salario del nuevo vendedor de la empresa.");
                            salary = scan.nextDouble();
                            scan.nextLine();
                            
                            System.out.println("Ingrese la antiguedad del nuevo vendedor de la empresa.");
                            antiquity = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingrese el numero de telefono movil del nuevo vendedor de la empresa.");
                            cellphone = scan.nextLine();
                            
                            System.out.println("Ingrese donde queda el area de venta del nuevo vendedor de la empresa.");
                            areaVenta = scan.nextLine();
                            
                            System.out.println("Ingrese el porcentaje de comisiones del nuevo vendedor de la empresa (en decimal).");
                            porcentajeComisiones = scan.nextDouble();
                            scan.nextLine();
                            
                            auto = carList.get(sellerList.size()+bossesList.size());
                            
                            seller = new Vendedor(auto, cellphone, areaVenta, porcentajeComisiones, name, lastname, dni, adress, phone, salary, antiquity, employ);
                            sellerList.add(seller);
                        }

                        case 2 -> {
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                            }
                        }
                        
                        case 3 -> {
                            
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor al que desea agregarle el cliente.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            sellerList.get(index).addClient(otroCliente(scan));
                        }
                        
                        case 4 -> {
                            
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor al que desea quitarle el cliente.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            ArrayList<Cliente> listaClientesVendedor = sellerList.get(index).getClientes();
                            
                            for(Cliente client: listaClientesVendedor){
                                System.out.println(client.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del cliente que le desea quitar al vendedor.");
                            int indexClient = scan.nextInt();
                            scan.nextLine();
                            sellerList.get(index).removeClient(indexClient);
                        }
                        
                        case 5 -> {
                            
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor al que desea cambiarle el coche.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(CocheEmpresa cars: carList){
                                System.out.println(cars.toString());
                                System.out.println("-----------");

                            }
                            
                            System.out.println("Ingrese el index del coche que desea asignarle al vendedor.");
                            int indexCar = scan.nextInt();
                            scan.nextLine();
                            
                            CocheEmpresa car = carList.get(indexCar);
                            
                            sellerList.get(index).changeCar(car);
                        }
                        
                        case 6 ->{
                            
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor al que desea cambiarle el supervisor.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(Empleado empleado: employList){
                                
                                if(empleado instanceof Secretario) {
                                    Secretario secret = (Secretario) empleado;
                                    System.out.println(secret.toString());
                                }
                                else if(empleado instanceof Vendedor){
                                    Vendedor vend = (Vendedor) empleado;
                                    System.out.println(vend.toString());
                                }
                                else{
                                    JefeDeZona jefe = (JefeDeZona) empleado;
                                    System.out.println(jefe.toString());
                                }
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del empleado que sera el nuevo supervisor.");
                            int indexSup = scan.nextInt();
                            scan.nextLine();
                            
                            sellerList.get(index).changeSupervisor(employList.get(indexSup));
                        }
                    }                 
                }
                
                case 3 -> {
                    switch(submenu){
                
                        case 1 -> {
                            System.out.println("Ingrese el nombre del nuevo jefe de zona de la empresa.");
                            name = scan.nextLine();

                            System.out.println("Ingrese el apellido del nuevo jefe de zona de la empresa.");
                            lastname = scan.nextLine();

                            System.out.println("Ingrese el DNI del nuevo jefe de zona de la empresa.");
                            dni = scan.nextLine();
                            
                            System.out.println("Ingrese la direccion del nuevo jefe de zona de la empresa.");
                            adress = scan.nextLine();

                            System.out.println("Ingrese el numero de telefono del nuevo jefe de zona de la empresa.");
                            phone = scan.nextLine();

                            System.out.println("Ingrese el salario del nuevo jefe de zona de la empresa.");
                            salary = scan.nextDouble();
                            scan.nextLine();
                            
                            System.out.println("Ingrese la antiguedad del nuevo jefe de zona de la empresa.");
                            antiquity = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingrese donde queda la oficina del nuevo jefe de zona de la empresa.");
                            offiece = scan.nextLine();
                            
                            secretary = secretaryList.get(bossesList.size());
                            auto = carList.get(sellerList.size()+bossesList.size());
                            
                            boss = new JefeDeZona(secretary, auto, offiece, name, lastname, dni, adress, phone, salary, antiquity, employ);
                            bossesList.add(boss);
                        }

                        case 2 -> {
                            for(JefeDeZona jefe: bossesList){
                                System.out.println(jefe.toString());
                            }
                        }    
                            
                        case 3 -> {
                            
                            for(JefeDeZona jefe: bossesList){
                                System.out.println(jefe.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del jefe de zona al que desea agregarle el vendedor.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(Vendedor vendedor: sellerList){
                                System.out.println(vendedor.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor que sera agregado al jefe de zona.");
                            int indexSeller = scan.nextInt();
                            scan.nextLine();
                            
                            Vendedor vendedorAsignado = sellerList.get(indexSeller);
                            
                            bossesList.get(index).addVendedor(vendedorAsignado);
                        }
                        
                        case 4 -> {
                            
                            for(JefeDeZona jefe: bossesList){
                                System.out.println(jefe.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del jefe de zona al que desea quitarle el vendedor.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            ArrayList<Vendedor> vendedoresJefe = bossesList.get(index).getVendedores();
                            
                            for(Vendedor sellers: vendedoresJefe){
                                System.out.println(sellers.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del vendedor que desea quitar al jefe de zona.");
                            int indexSell = scan.nextInt();
                            scan.nextLine();
                            
                            bossesList.get(index).removeVendedor(indexSell);
                        }
                        
                        case 5 -> {
                            
                            for(JefeDeZona jefes: bossesList){
                                System.out.println(jefes.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del jefe de zona al que desea cambiarle el coche.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(CocheEmpresa cars: carList){
                                System.out.println(cars.toString());
                                System.out.println("-----------");

                            }
                            
                            System.out.println("Ingrese el index del coche que desea asignarle al jefe de zona.");
                            int indexCar = scan.nextInt();
                            scan.nextLine();
                            
                            CocheEmpresa car = carList.get(indexCar);
                            
                            bossesList.get(index).changeCar(car);
                        }
                        
                        case 6 ->{
                            
                            for(JefeDeZona jefe: bossesList){
                                System.out.println(jefe.toString());
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del jefe de zona al que desea cambiarle el supervisor.");
                            int index = scan.nextInt();
                            scan.nextLine();
                            
                            for(Empleado empleado: employList){
                                
                                if(empleado instanceof Secretario) {
                                    Secretario secret = (Secretario) empleado;
                                    System.out.println(secret.toString());
                                }
                                else if(empleado instanceof Vendedor){
                                    Vendedor vend = (Vendedor) empleado;
                                    System.out.println(vend.toString());
                                }
                                else{
                                    JefeDeZona jefe = (JefeDeZona) empleado;
                                    System.out.println(jefe.toString());
                                }
                                System.out.println("-----------");
                            }
                            
                            System.out.println("Ingrese el indice del empleado que sera el nuevo supervisor.");
                            int indexSup = scan.nextInt();
                            scan.nextLine();
                            
                            bossesList.get(index).changeSupervisor(employList.get(indexSup));
                        }
                    }
                }
        }
    }
    
    public static Cliente otroCliente(Scanner scan){
        System.out.println("Ingrese el nombre del cliente.");
        String name = scan.nextLine();
        
        System.out.println("Ingrese el apellido del cliente.");
        String lastName = scan.nextLine();
        
        System.out.println("Ingrese el dni del cliente.");
        String dni = scan.nextLine();
        
        System.out.println("Ingrese la direccion del cliente.");
        String adress = scan.nextLine();
        
        Cliente client = new Cliente(name, lastName, dni, adress);
        
        return client;
    }
}
