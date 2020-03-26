package controle;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;
import modelo.dao.ClienteDAO;
import modelo.entidade.Cliente;
import visao.Cadastro;
public class ClienteRN {
    public void Cadastro(String nome, String cfp, int endereco, int tel, int email, int senha){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cfp);
        cliente.setEndereco(endereco);
        cliente.setTel(tel);
        cliente.setSenha(senha);
        cliente.setEmail(email);
        
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.setConnection(Factory.getConnection());
        clienteDao.inserir(cliente);
    }
}
