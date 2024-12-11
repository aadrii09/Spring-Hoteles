package hoteles.model.Service.Implents;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hoteles.model.Entities.Cliente;
import hoteles.model.Repositories.IClienteRepository;
import hoteles.model.Service.Services.IClienteService;
@Service
public class ClienteService implements IClienteService {
    
    @Autowired
    IClienteRepository clienteRepo;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void borrarCliente(Integer id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public Cliente findById(Integer id) {
        Optional<Cliente> optional = clienteRepo.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Cliente> buscarTodos() {
        List<Cliente> listaClientes = clienteRepo.findAll();
        return listaClientes;
        
    }

    
}
