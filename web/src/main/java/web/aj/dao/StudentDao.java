package web.aj.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import web.aj.entity.Student;
import web.aj.util.HibernateUtil;




public class StudentDao {
	public void saveUser(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
