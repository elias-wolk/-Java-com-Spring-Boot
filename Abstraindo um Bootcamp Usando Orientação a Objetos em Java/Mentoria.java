import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXP() {
        return 20.0;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
               "titulo='" + titulo + '\'' +
               ", descricao='" + descricao + '\'' +
               ", data=" + data +
               '}';
    }
}
