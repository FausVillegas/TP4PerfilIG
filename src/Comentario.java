public class Comentario {
    private String Usuario;
    private String Comentario;
    private String Fecha;

    public Comentario(String usuario, String comentario, String fecha) {
        Usuario = usuario;
        Comentario = comentario;
        Fecha = fecha;
    }

    @Override
    public String toString() {
        return Fecha + " " + Usuario + " comentó: " + Comentario;
    }
}
