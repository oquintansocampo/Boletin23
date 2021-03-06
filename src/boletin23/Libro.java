package boletin23;

/**
 *
 * @author oquintansocampo
 */
public class Libro implements Comparable {

    private String nombre;
    private String autor;
    private float precio;
    private int unidades;

    public Libro() {
    }

    public Libro(String nombre, String autor, float precio, int unidades) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return nombre + "," + autor + "," + precio + "," + unidades;
    }

    @Override
    public int compareTo(Object t) {
        Libro l = (Libro) t;
        if (this.nombre.compareToIgnoreCase(l.nombre) == 0) {
            return 0;
        } else if (this.nombre.compareToIgnoreCase(l.nombre) > 1) {
            return 1;
        } else {
            return -1;
        }
    }

}
