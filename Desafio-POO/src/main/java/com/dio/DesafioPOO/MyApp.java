package com.dio.DesafioPOO;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyApp  implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java básico");
        curso1.setDescricao("Curso de Java básico para quem nunca programou!");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java intermediário");
        curso2.setDescricao("Curso de Java intermediário!");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Dominado os desafios diários");
        mentoria.setDescricao("Como resolver os desafios diários com eficiência!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp completo de Java, do básico ao avançado!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNally = new Dev();
        devNally.setNome("Nally");
        devNally.inscreverBootcamp(bootcamp);
        devNally.progredir();
        System.out.println("Conteúdos Inscritos Nally:" + devNally.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nally:" + devNally.getConteudosConcluidos());
        System.out.println("XP:" + devNally.calcularTotalXp());

    }
}
