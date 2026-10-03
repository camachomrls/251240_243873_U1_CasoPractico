import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Almacen miAlmacen = new Almacen(100);

        int opcion;

        System.out.println(" Gestion de Almacen");

        do {
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Registrar mercancía (Producto y Proveedor)");
            System.out.println("2. Generar reporte 'ENTRADA DE PRODUCTOS'");
            System.out.println("3. Cambiar el proveedor de un producto existente");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("\n DATOS DEL PRODUCTO");
                    System.out.print("Nombre del producto: ");
                    String nombreProd = entrada.nextLine();

                    System.out.print("Cantidad en stock entrante: ");
                    int stock = entrada.nextInt();

                    System.out.print("Precio de compra acordado: ");
                    double precio = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("\n DATOS DEL PROVEEDOR");
                    System.out.print("Nombre de la empresa proveedora: ");
                    String empresa = entrada.nextLine();

                    System.out.print("Nombre del repartidor: ");
                    String repartidor = entrada.nextLine();

                    System.out.print("Teléfono de contacto: ");
                    String telefono = entrada.nextLine();

                    Proveedor prov = new Proveedor(repartidor, telefono, empresa);
                    Producto prod = new Producto(nombreProd, stock, precio, prov);

                    if(miAlmacen.registrarProducto(prod)) {
                        System.out.println("\n[!] Producto registrado con éxito en el sistema.");
                    }
                    break;
                }
                case 2: {
                    miAlmacen.generarReporte();
                    break;
                }
                case 3: {
                    System.out.print("\nIntroduce el nombre exacto del producto a modificar: ");
                    String buscarProd = entrada.nextLine();

                    System.out.println("\n DATOS DEL NUEVO PROVEEDOR");
                    System.out.print("Nombre de la nueva empresa: ");
                    String nEmpresa = entrada.nextLine();

                    System.out.print("Nombre del nuevo repartidor: ");
                    String nRepartidor = entrada.nextLine();

                    System.out.print("Nuevo teléfono de contacto: ");
                    String nTelefono = entrada.nextLine();

                    Proveedor nuevoProv = new Proveedor(nRepartidor, nTelefono, nEmpresa);

                    if (miAlmacen.cambiarProveedor(buscarProd, nuevoProv)) {
                        System.out.println("\n[!] El proveedor fue actualizado correctamente.");
                    } else {
                        System.out.println("\n[X] No se encontró ningún producto con el nombre '" + buscarProd + "'.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                }
            }
        } while (opcion != 4);

        entrada.close();
    }
}