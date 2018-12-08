package br.unitins.unimetria.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFactory {
	
	//garante que a classe nao pode ser instanciada
	private JPAFactory() {}
	
	private static EntityManagerFactory emf = 
		Persistence.createEntityManagerFactory("unimetria");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
