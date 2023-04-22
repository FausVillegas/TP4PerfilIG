import java.util.ArrayList;

public class Publicacion {

    private String nombre;
    private String fechaSubida;
    private int cantidadMG;
    private ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
    public Publicacion(String name,String fechaSubida,int cantidadMG){
        this.nombre = name;
        this.fechaSubida = fechaSubida;
        this.cantidadMG = cantidadMG;
        this.comentarios = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(String fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public int getCantidadMG() {
        return cantidadMG;
    }

    public void setCantidadMG(int cantidadMG) {
        this.cantidadMG = cantidadMG;
    }
}
