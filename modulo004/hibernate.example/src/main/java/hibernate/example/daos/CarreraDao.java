package hibernate.example.daos;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.example.models.Carrera;
import hibernate.example.utils.HibernateConfig;

public class CarreraDao {

	public void createCarrera(Carrera Carrera) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			transaction = session.beginTransaction();  
			session.save(Carrera);  
			transaction.commit();
		} catch (Exception e) {  
			if (transaction != null) {  
				transaction.rollback();  
			}  
			e.printStackTrace();  
		}  
	}  
  
	public List <Carrera> getCarreras() {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Carrera", Carrera.class).list();  
		}  
	}
	
	public Carrera getCarreraById(Long id) {
			try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
				return session.get(Carrera.class, id);
			}
	}
	
	public void updateCarrera(Carrera carrera) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.update(carrera);  
		transaction.commit();  
		} catch (Exception e) {  
		if (transaction != null)  
			transaction.rollback();  
			e.printStackTrace();  
		}  
	}
	
	  
	public void removeCarrera(Carrera carrera) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.delete(carrera);  
		transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null)  
			transaction.rollback();   
			e.printStackTrace();    
		}  
	}
	
}
