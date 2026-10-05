public class Proveedor {
    private String nombreRepartidor;
    private String telefono;
    private String nombreEmpresa;

    public Proveedor(String nombreRepartidor, String telefono, String nombreEmpresa) {
        this.nombreRepartidor = nombreRepartidor;
        setTelefono(telefono); // Valida el teléfono al asignarlo
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
        // Valida 10 dígitos numéricos
        if (telefono != null && telefono.matches("\\d{10}")) {
            this.telefono = telefono;
        } else {
            System.out.println("[Advertencia] El teléfono debe contener exactamente 10 dígitos numéricos.");
            this.telefono = "0000000000";
        }
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