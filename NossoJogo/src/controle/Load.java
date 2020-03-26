
package controle;

import modelo.dao.ClienteDAO;
import modelo.entidade.Cliente;
import modelo.util.HibernateUtil;
import org.hibernate.Criteria;

public class Load {
    public static void main(String[] args){
        HibernateUtil.getSessionFactory();
        //cliente ficticio
        Cliente cliente = new Cliente();
        cliente.setNome("Lorran");
        cliente.setTel(2143);
        //comunicação com o banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserir(cliente);
       System.out.println(clienteDAO.getListaClienteById(1).get(0).getNome());
    } 
}