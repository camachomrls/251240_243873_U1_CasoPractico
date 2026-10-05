public class Producto {
    private String nombre;
    private int stock;
    private double precioCompra;
    private Proveedor proveedor; // Relación con la clase Proveedor

    public Producto(String nombre, int stock, double precioCompra, Proveedor proveedor) {
        this.nombre = nombre;
        setStock(stock);
        setPrecioCompra(precioCompra);
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
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("[Advertencia] El stock no puede ser negativo. Se registrará en 0.");
            this.stock = 0;
        }
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        if (precioCompra >= 0) {
            this.precioCompra = precioCompra;
        } else {
            System.out.println("[Advertencia] El precio de compra no puede ser negativo. Se registrará en 0.0.");
            this.precioCompra = 0.0;
        }
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