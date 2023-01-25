package web.aj.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import web.aj.entity.Student;
import web.aj.util.HibernateUtil;




public class StudentDao {
	public void saveUser(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
