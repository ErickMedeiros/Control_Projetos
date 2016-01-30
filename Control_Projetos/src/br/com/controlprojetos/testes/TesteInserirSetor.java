package br.com.controlprojetos.testes;

import javax.persistence.EntityManager;

import br.com.controlprojetos.beans.Setor;
import br.com.controlprojetos.jpa.EntityManagerUtil;

public class TesteInserirSetor {

	public static void main(String[] args) {
	
		EntityManager em = EntityManagerUtil.getEntityManager();
		Setor s = new Setor();
		s.setNome("Desenvolvimento");
		Setor s2 = new Setor();
		s2.setNome("Banco de Dados");
		em.getTransaction().begin();
		em.persist(s);
		em.persist(s2);
		em.getTransaction().commit();
		System.out.println("Inclusão ocorreu com sucesso");
		
	}

}
