package hibernate.example.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.example.models.Alumno;
import hibernate.example.utils.HibernateConfig;

public class AlumnoDaoImpl {

	public void createAlumno(Alumno alumno) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			transaction = session.beginTransaction();  
			session.save(alumno);  
			transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null) {  
				transaction.rollback();  
			}  
			e.printStackTrace();  
		}  
	}  
  
	public List <Alumno> getAlumnos() {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Alumno", Alumno.class).list();  
		}  
	}  
  
	public List<Alumno> getAlumnos(String nombre, String apellido) {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Alumno s where s.nombre=:nombre and s.apellido=:apellido"  
		, Alumno.class).setParameter("nombre", nombre).setParameter("apellido", apellido).list();  
		}  
	}  
	
	public void updateAlumno(Alumno alumno) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.update(alumno);  
		transaction.commit();  
		} catch (Exception e) {  
		if (transaction != null)  
			transaction.rollback();  
			e.printStackTrace();  
		}  
	}  
  
	public void removeAlumno(Alumno alumno) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.delete(alumno);  
		transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null)  
			transaction.rollback();   
			e.printStackTrace();    
		}  
	}
	
}
