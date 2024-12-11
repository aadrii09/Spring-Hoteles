package hoteles.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hoteles.model.Entities.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

}
