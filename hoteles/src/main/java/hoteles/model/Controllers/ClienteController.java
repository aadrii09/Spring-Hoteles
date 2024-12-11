package hoteles.model.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hoteles.model.Entities.Cliente;
import hoteles.model.Service.Services.IClienteService;

@RestController
@RequestMapping("/clientardo")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @PostMapping(value= "/crearcliente")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }

    @PutMapping("/actualizarcliente")
    public Cliente actualizarCliente(@RequestBody Cliente cliente){
        return clienteService.actualizarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void borrarCliente(@PathVariable("id") Integer id){
                clienteService.borrarCliente(id);
    }

    @GetMapping("/{id}")
    public Cliente findByCliente(@PathVariable("id") Integer id){
        return clienteService.findById(id);
    }

    @GetMapping("/all")
    public List<Cliente> getAllCliente(){
        return clienteService.buscarTodos();
    }
    }

