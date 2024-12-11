package hoteles.model.Entities;

import java.util.List;

import org.hibernate.annotations.Collate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hoteles.model.Entities.ENUMS.Estrella;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 55, nullable = false)
    private String nombre;
    @Column(length = 55, nullable = false)
    private String ubicacion;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM( 'UNO', 'DOS', 'TRES', 'CUATRO', 'CINCO')")
    private Estrella estrellas;

    @JsonIgnoreProperties("hotel_id")

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reserva> listaReservas;

    public Hotel() {
    }

    public Hotel(String nombre, String ubicacion, Estrella estrellas, List<Reserva> listaReservas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas;
        this.listaReservas = listaReservas;
    }

    public Hotel(String nombre, String ubicacion, Estrella estrellas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas;
    }

    public Hotel(Integer id, String nombre, String ubicacion, Estrella estrellas, List<Reserva> listaReservas) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.estrellas = estrellas;
        this.listaReservas = listaReservas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Estrella getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Estrella estrellas) {
        this.estrellas = estrellas;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }


    
}
