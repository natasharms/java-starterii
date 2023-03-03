package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // Criando os dados no banco
        /*Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();*/

        // Busca no banco de dados
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        // Remover um dado: tem que estar monitorado, ou seja, tem que fazer um find primeiro e incluir uma transação
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();


        System.out.println("Pronto!");
        em.close();
        emf.close();

    }

}
