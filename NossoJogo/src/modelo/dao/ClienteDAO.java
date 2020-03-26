
package modelo.dao;

import java.util.List;
import modelo.entidade.Cliente;
import modelo.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ClienteDAO extends HibernateUtil{
    private Session session = getSession();
    private Transaction transaction;
    
    public void inserir(Cliente cliente){
        try{
            transaction = session.beginTransaction();
            session.save(cliente);
            session.flush();//o flush garante a entrega
            transaction.commit();
            session.close();
        }catch (HibernateException ex){
            transaction.rollback();
            session.close();
            ex.printStackTrace();       
        }
    }

      public List<Cliente> getListaClienteById(int id) {
        List<Cliente> toReturnListaCliente;
        Session session = getSession();
        Criteria criteria = session.createCriteria(Cliente.class);//ATÉ AQUI EU FIZ 50% DO TRABALHO MAS ESQUECI O MÉTODO public _|_
        criteria.add(Restrictions.eq("id",id));	
        toReturnListaCliente = criteria.list();
        return toReturnListaCliente;
    }

      
}