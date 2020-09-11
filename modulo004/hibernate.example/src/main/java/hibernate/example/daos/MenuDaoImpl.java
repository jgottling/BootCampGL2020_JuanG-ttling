package hibernate.example.daos;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.example.models.Menu;
import hibernate.example.utils.HibernateConfig;

public class MenuDaoImpl {

	public void createMenu(Menu menu) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			transaction = session.beginTransaction();  
			session.save(menu);  
			transaction.commit();
		} catch (Exception e) {  
			if (transaction != null) {  
				transaction.rollback();  
			}  
			e.printStackTrace();  
		}  
	}  
  
	public List <Menu> getMenus() {  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
			return session.createQuery("from Menu", Menu.class).list();  
		}  
	}
	
	public Menu getMenuById(Long id) {
			try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
				return session.get(Menu.class, id);
			}
	}
	
	public void updateMenu(Menu menu) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.update(menu);  
		transaction.commit();  
		} catch (Exception e) {  
		if (transaction != null)  
			transaction.rollback();  
			e.printStackTrace();  
		}  
	}
	
	  
	public void removeMenu(Menu menu) {  
		Transaction transaction = null;  
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {  
		transaction = session.beginTransaction();  
		session.delete(menu);  
		transaction.commit();  
		} catch (Exception e) {  
			if (transaction != null)  
			transaction.rollback();   
			e.printStackTrace();    
		}  
	}
}
