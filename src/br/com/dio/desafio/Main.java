package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("JS");
		curso2.setDescricao("curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
		devLucas.progredir();
		devLucas.progredir();
		System.out.println("");
		System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devLucas.getConteudosConcluidos());
		System.out.println("XP: " + devLucas.calcularTotalXp());
		
		System.out.println("");
		
		Dev devMaria = new Dev();
		devMaria.inscreverBootcamp(bootcamp);
		devMaria.setNome("Maria");
		System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("");
		System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
		System.out.println("Conteúdos concluídos: " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());
		
	}

}
