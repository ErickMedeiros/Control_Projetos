package br.com.controlprojetos.testes;

import javax.persistence.EntityManager;

import br.com.controlprojetos.beans.Grupo;
import br.com.controlprojetos.jpa.EntityManagerUtil;

public class TesteInserirGrupo {

	public static void main(String[] args) {
		
					 
			EntityManager em = EntityManagerUtil.getEntityManager();
			Grupo g = new Grupo();
			g.setNome("Gestor");
			em.getTransaction().begin();
			em.persist(g);
			em.getTransaction().commit();
		}

	}


