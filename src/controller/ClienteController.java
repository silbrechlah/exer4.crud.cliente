package controller;

import java.util.ArrayList;
import model.bean.Cliente;
import model.dao.ClienteDAO;

public class ClienteController {

    public void create(String nome, String email, String cpf, String telefone, String dataAniversario) {
        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setDataAniversario(dataAniversario);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(cliente);
    }

    public ArrayList<Cliente> read() {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.read();
    }

    public void update(int idcliente, String nome, String email, String cpf, String telefone, String dataAniversario) {
        Cliente cliente = new Cliente();

        cliente.setIdcliente(idcliente);
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setDataAniversario(dataAniversario);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(cliente);
    }

    public void delete(int idcliente) {
        Cliente cliente = new Cliente();
        ClienteDAO clienteDAO = new ClienteDAO();

        cliente.setIdcliente(idcliente);

        clienteDAO.delete(cliente);
    }

}
