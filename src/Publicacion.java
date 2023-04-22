import java.util.ArrayList;

public class Publicacion {
    private class structComentario{
        String Usuario;
        String Comentario;
        String Fecha;
    }
    private String Nombre;
    private String FechaSubida;
    private int CantidadMG;
    private ArrayList<structComentario> Comentarios = new ArrayList<structComentario>();
    public Publicacion(String name,String fs,int cmg){
        Nombre = name;
        FechaSubida = fs;
        CantidadMG = cmg;
        for (structComentario structComentario : Comentarios = NULL) {}
    }
}
