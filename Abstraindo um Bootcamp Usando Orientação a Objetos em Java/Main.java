import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "Aprenda os fundamentos de Java", 8);
        Curso curso2 = new Curso("Curso de Spring Boot", "Aprenda Spring Boot para web", 6);
        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria1);

        Dev devElias = new Dev("Elias Wolk");
        devElias.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devElias);

        devElias.progredir();
        devElias.progredir();
        System.out.println("Conteúdos após progresso: " + devElias);
        System.out.println("XP total: " + devElias.calcularTotalXp());
    }
}
