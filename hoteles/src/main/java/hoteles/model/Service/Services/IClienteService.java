package hoteles.model.Service.Services;

import java.util.List;

import hoteles.model.Entities.Cliente;

public interface IClienteService {

    public Cliente crearCliente(Cliente cliente);

    public Cliente actualizarCliente(Cliente cliente);

    public void borrarCliente(Integer id);

    public Cliente findById(Integer id);

    public List<Cliente> buscarTodos();
}
