public class Proveedor {
    private String nombreRepartidor;
    private String telefono;
    private String nombreEmpresa;

    public Proveedor(String nombreRepartidor, String telefono, String nombreEmpresa) {
        this.nombreRepartidor = nombreRepartidor;
        this.telefono = telefono;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombreEmpresa + " | Repartidor: " + nombreRepartidor + " | Tel: " + telefono;
    }
}