package org.maugal.appfacturas;

import org.maugal.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Mauricio");

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();

            System.out.print("Ingrese producto n" + producto.getCodigo() + ": ");
            producto.setNombre(s.next());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
        }
        System.out.println();
        System.out.println(factura);
    }
}
