package hoteles.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hoteles.model.Entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
