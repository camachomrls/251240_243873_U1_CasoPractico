public class Producto {
    private String nombre;
    private int stock;
    private double precioCompra;
    private Proveedor proveedor; // Relación con la clase Proveedor

    public Producto(String nombre, int stock, double precioCompra, Proveedor proveedor) {
        this.nombre = nombre;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor; // Se usa para cambiar el proveedor
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Stock: " + stock + " | Precio de compra: $" + precioCompra +
                "\n   -> Datos Proveedor: [" + proveedor.toString() + "]";
    }
}