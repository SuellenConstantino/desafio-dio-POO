import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição curso java");
        mentoria.setData(LocalDate.now());



       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSu = new Dev();
        devSu.setNome("Su");
        devSu.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Su" + devSu.getConteudoInscritos());
        devSu.progredir();
        devSu.progredir();
        System.out.println("Conteudos Inscritos Su" + devSu.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Su" + devSu.getConteudoConcluidos());
        System.out.println("XP: " +devSu.calcularXp());


        Dev devMa = new Dev();
        devMa.setNome("Ma");
        devMa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ma" + devMa.getConteudoConcluidos());
        devMa.progredir();
        devMa.progredir();
        devMa.progredir();
        System.out.println("Conteudos Concluidos Ma" + devMa.getConteudoConcluidos());
        System.out.println("Conteudos Inscritos Ma" + devMa.getConteudoConcluidos());
        System.out.println("XP : "  + devMa.calcularXp());

    }
}
