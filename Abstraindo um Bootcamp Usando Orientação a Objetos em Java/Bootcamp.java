import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
               "nome='" + nome + '\'' +
               ", descricao='" + descricao + '\'' +
               ", conteudos=" + conteudos +
               '}';
    }
}
