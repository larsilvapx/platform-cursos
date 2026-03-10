package org.example;

import org.example.dominio.Conteudo;
import org.example.dominio.Curso;
import org.example.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("logica");
        curso1.setTitulo("logica");
        curso1.setCargaHoraria(2);


        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria java");
        mentoria1.setTitulo("java");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        conteudo.setDescricao("curso de python");
        conteudo.setTitulo("Python");

        System.out.println(conteudo);

        System.out.println(mentoria1);

        }
    }
