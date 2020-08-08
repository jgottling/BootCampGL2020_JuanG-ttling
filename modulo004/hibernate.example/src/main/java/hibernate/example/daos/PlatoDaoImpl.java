package hibernate.example.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.example.models.Plato;
import hibernate.example.utils.HibernateConfig;

public class PlatoDaoImpl {

	public void createPlato(Plato plato) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			transaction = session.beginTransaction();  
			session.save(plato);  
			transaction.commit();
		} catch (Exception e) {  
			if (transaction != null) {  
				transaction.rollback();  
			}  
			e.printStackTrace();  
		}
		
	}  
  
	public List <Plato> getPlatos() {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Plato", Plato.class).list();  
		}  
	}
	
	public Plato getPlatoById(Long id) {
			try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
				return (Plato) session.createQuery("from Plato p where p.plato_id=:id", Plato.class).setParameter("id", id);  
			}
	}

	
	public void updatePlato(Plato plato) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.update(plato);  
		transaction.commit();  
		} catch (Exception e) {  
		if (transaction != null)  
			transaction.rollback();  
			e.printStackTrace();  
		}  
	}
	
	  
	public void removePlato(Plato plato) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.delete(plato);  
		transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null)  
			transaction.rollback();   
			e.printStackTrace();    
		}  
	}
}
