package hibernate.example.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.example.models.Corredor;
import hibernate.example.utils.HibernateConfig;

public class CorredorDao {
	public void createCorredor(Corredor Corredor) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			transaction = session.beginTransaction();  
			session.save(Corredor);  
			transaction.commit();
		} catch (Exception e) {  
			if (transaction != null) {  
				transaction.rollback();  
			}  
			e.printStackTrace();  
		}  
	}  
  
	public List <Corredor> getCorredores() {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Corredor", Corredor.class).list();  
		}  
	}
	
	public Corredor getCorredorById(Long id) {
			try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
				return session.get(Corredor.class, id);
			}
	}
	
	public void updateCorredor(Corredor corredor) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.update(corredor);  
		transaction.commit();
		} catch (Exception e) {  
		if (transaction != null)  
			transaction.rollback();  
			e.printStackTrace();  
		}  
	}
	
	  
	public void removeCorredor(Corredor corredor) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.delete(corredor);  
		transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null)  
			transaction.rollback();   
			e.printStackTrace();    
		}  
	}
}
