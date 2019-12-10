package visoranimales2;

public class Animal {
    private String nombre;
    private String miniatura;
    private String imagen;
    
    public Animal(String nombre, String miniatura, String imagen){
        this.nombre = nombre;
        this.miniatura = miniatura;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public String getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
