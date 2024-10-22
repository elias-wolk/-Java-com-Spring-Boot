public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return cargaHoraria * 10.0;
    }

    @Override
    public String toString() {
        return "Curso{" +
               "titulo='" + titulo + '\'' +
               ", descricao='" + descricao + '\'' +
               ", cargaHoraria=" + cargaHoraria +
               '}';
    }
}
