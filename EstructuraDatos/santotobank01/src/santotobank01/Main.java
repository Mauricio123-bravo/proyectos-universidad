/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santotobank01;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main{
    
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        

        
        System.out.println("║  ¿Cuantos clientes hay en fila:?  ║");
       
        int num;
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║   Bienvenido al cajero santoto    ║");
            System.out.println("╚═══════════════════════════════════╝");
            m.agregar_cola();
        }

        for (Cliente cliente : m.clientesCola) {
            int Choose;
            Cliente cliente1 = new Cliente();
            cliente1 = m.clientesCola.poll();
            System.out.println("Escoja la cuenta: ");
            int i = 0;
            int clave;
            for (Cuenta cuentas : cliente1.getCuentas()) {
                System.out.println(i + " = " + cuentas.toString());
                i++;
            }
            Choose = scanner.nextInt();
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║       Ingrese su contarseña       ║");
            System.out.println("╚═══════════════════════════════════╝");
            clave = scanner.nextInt();
            if (clave == cliente1.getCuentas().get(Choose).getClave()) ;
            int option = 1;
            int nClave;
            double retirar;
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║    Escoja la opcion que desee     ║");
            System.out.println("╚═══════════════════════════════════╝");
            while (option != 0) {
                System.out.println("╔═══════════════════════════════════╗");
                System.out.println("║       1. Ver saldo                ║");
                System.out.println("║       2. Cambiar contraseña       ║");
                System.out.println("║       3. Retirar dinero           ║");
                System.out.println("╚═══════════════════════════════════╝");

                option = scanner.nextInt();
                cliente1.getFilaCliente().add(option);
                if (option == 1) {
                    System.out.println(cliente1.getCuentas().get(Choose).getSaldo());
                } else if (option == 2) {
                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║    Ingrese la nurva contraseña    ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    nClave = scanner.nextInt();
                    cliente1.getCuentas().get(Choose).setClave(nClave);
                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║ Su nueva clave a sido establecida ║");
                    System.out.println("╚═══════════════════════════════════╝");
                } else if (option == 3) {
                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║        Cantidad a retirar:        ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    retirar = scanner.nextDouble();
                    if (retirar <= cliente1.getCuentas().get(Choose).getSaldo()) {
                        cliente1.getCuentas().get(Choose).setSaldo(cliente1.getCuentas().get(Choose).getSaldo() - retirar);
                        System.out.println("Su saldo queda en: " + cliente1.getCuentas().get(Choose).getSaldo());
                    }
                }
            }
        }
    }


    public void crear_clientes() {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║          Clientes a crear:        ║");
        System.out.println("╚═══════════════════════════════════╝");
        int tamaño = scanner.nextInt();
        for (int i = 0; i < tamaño; i++) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║   Ingrese el nombre del cliente:  ║");
            System.out.println("╚═══════════════════════════════════╝");
            nombre = scanner1.nextLine();
            Cliente cliente = new Cliente(nombre);
            cliente.crearCuenta();
            clientes.add(cliente);
        }

    }

    public void agregar_cola() {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║             Clientes:             ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.println("Clientes:  ");
        for (Cliente cliente : clientes) {
            System.out.println(i + " = " + cliente.toString());
            i++;
            Hashtable.put(1, cliente);
        }
        int opt = keyboard.nextInt();
        clientesCola.add(clientes.get(opt));
    }
}
    

