public class Almacen {
    private Producto[] inventario;
    private int totalProductos;

    public Almacen(int capacidadMaxima) {
        inventario = new Producto[capacidadMaxima];
        totalProductos = 0;
    }

    public boolean registrarProducto(Producto nuevoProducto) {
        if (totalProductos < inventario.length) {
            inventario[totalProductos] = nuevoProducto;
            totalProductos++;
            return true;
        } else {
            System.out.println("Error: El almacén está lleno. No se pueden registrar más productos.");
            return false;
        }
    }

    public void generarReporte() {
        System.out.println("\n==================================================");
        System.out.println("          REPORTE: ENTRADA DE PRODUCTOS           ");
        System.out.println("==================================================");

        if (totalProductos == 0) {
            System.out.println("No hay productos registrados en el almacén.");
        } else {
            for (int i = 0; i < totalProductos; i++) {
                System.out.println((i + 1) + ". " + inventario[i].toString());
                System.out.println("--------------------------------------------------");
            }
        }
    }

    public boolean cambiarProveedor(String nombreProductoBuscado, Proveedor nuevoProveedor) {
        for (int i = 0; i < totalProductos; i++) {
            if (inventario[i].getNombre().equalsIgnoreCase(nombreProductoBuscado)) {
                inventario[i].setProveedor(nuevoProveedor);
                return true;
            }
        }
        return false;
    }
}