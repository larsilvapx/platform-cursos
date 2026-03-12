package org.example;

import org.example.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============ CRIAÇÃO DE CONTEÚDOS ==============

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java");
        cursoJava.setDescricao("Curso de Java POO");
        cursoJava.setCargaHoraria(12);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Python");
        cursoPython.setDescricao("Curso de python");
        cursoPython.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria Java");
        mentoriaJava.setDescricao("Tira dúvidas sobre a linguagem Java");
        mentoriaJava.setData(LocalDate.of(2026,04,10));

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java");
        bootCamp.setDescricao("Aprenda boas praticas em java");

        bootCamp.getConteudos().add(cursoJava);
        bootCamp.getConteudos().add(cursoPython);
        bootCamp.getConteudos().add(mentoriaJava);

        // =======CRIANDO DEV =========

        Dev dev = new Dev();

        int opcao = -1;

        while (opcao != 0){

            System.out.println("===== MENU BOOTCAMP ======");
            System.out.println("1 - Criar Dev");
            System.out.println("2 - Inscrever Dev no bootcamp");
            System.out.println("3 - Progredir no curso");
            System.out.println("4 - Ver conteúdos inscritos");
            System.out.println("5 - Ver conteúdos concluídos");
            System.out.println("6 - Ver XP total");
            System.out.println("7 - Ver Devs inscritos no Bootcamp");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do Dev: ");
                    dev.setNome(sc.nextLine());

                    System.out.println("Dev Criado com sucesso!");
                    break;

                case 2:
                    dev.inscreverBootCamp(bootCamp);
                    System.out.println("Dev inscrito no Bootcamp!");
                    break;

                case 3:
                    dev.progredir();
                    System.out.println("Progresso realizado!");
                    break;

                case 4:
                    System.out.println("\nConteúdos inscritoss");
                    dev.getConteudosInscritos().forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("\nConteúdos concluídos");
                    dev.getConteudosConcluidos().forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Pontuação do Dev");
                    System.out.println("\nXP Total: " + dev.calcularTotalXp());
                    break;

                case 7:
                    System.out.println("Número de Devs inscritos: ");
                    bootCamp.getDevInscrito().forEach(d -> System.out.println(d.getNome()));
                    break;

                case 0:
                    System.out.println("Platform sendo encerrado...");

                default:
                    System.out.println("Opção inválida");

            }

        }
        sc.close();

        }
    }
