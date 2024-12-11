package hoteles.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hoteles.model.Entities.Reserva;

public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

}
