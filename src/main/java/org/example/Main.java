package org.example;

import clases.Biblioteca;
import clases.Empleado;
import clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado= new Empleado();

        empleado.setSalario(3500000);
        empleado.setValorComision(1500000);
        empleado.setDeducciones(0.05);

        System.out.println("PUNTO 1: ");

        Scanner entradaPorTeclado= new Scanner(System.in);

        System.out.println("Digite su identificacion: ");
        String identi=entradaPorTeclado.nextLine();
        empleado.setIdentificacion(identi);

        System.out.println("Digite su nombre: ");
        String nombre=entradaPorTeclado.nextLine();
        empleado.setNombre(nombre);

        int salario=empleado.getSalario();
        System.out.println("Salario mensual: " + salario);

        int valorComision= empleado.getValorComision();
        System.out.println("Valor de comision mensual: " + valorComision);

        double deducciones= empleado.getDeducciones();
        System.out.println("Valor deduccion: " + deducciones);

        System.out.println("Digite su Numero de ventas mensuales: ");
        int ventasMensuales=entradaPorTeclado.nextInt();
        empleado.setNumeroVentasMensuales(ventasMensuales);

        double totalSalario= empleado.calcularSalario();
        System.out.println("El salario mensual de " + nombre + " es " + String.format("%.2f",totalSalario));



        System.out.println("PUNTO 2: ");

        Tienda carrefour= new Tienda();

        double total=carrefour.calcularProducto();
        System.out.println("El costo total de la compra del producto es: " +total);


        System.out.println("PUNTO 3: ");

        Biblioteca alejandria=new Biblioteca();
        Scanner lea=new Scanner(System.in);

        int observador=100;

        System.out.println("*****MENU****");
        System.out.println("1. ingresar libro");
        System.out.println("2. consultar libro");
        System.out.println("3. modificar libro");
        System.out.println("4. salir");


        while(observador!=4){

            System.out.println("digite una opcion: ");
            observador=lea.nextInt();


            if(observador==1){

                System.out.println("Ingrese nombre del libro: ");
            String nomb=lea.next();
            alejandria.setNombreLibro(nomb);

            System.out.println("Ingrese el codigo del libro: ");
            String codigo=lea.next();
            alejandria.setCodigo(codigo);

            System.out.println("Ingrese numero de paginas: ");
            int paginas=lea.nextInt();
            alejandria.setNumeroDePaginas(paginas);

            System.out.println("Ingrese numero de ejemplares: ");
            int ejemplares= lea.nextInt();
            alejandria.setNumeroDeEjemplares(ejemplares);

            System.out.println("Ingrese nombre del autor: ");
            String autor=lea.next();
            alejandria.setAutor(autor);





            } else if (observador==2) {

            } else if (observador==3) {

            } else if (observador==4) {
                System.out.println("salir");
                break;
            }else{
                System.out.println("opcion invalida");
            }

        }

    }
}