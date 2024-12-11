package hoteles.model.Entities;

import java.time.LocalDate;
import java.util.Enumeration;
import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.cglib.core.Local;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hoteles.model.Entities.ENUMS.Estado;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonIgnoreProperties("listaReservas")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Cliente.class)
    @JoinColumn(nullable = false, name = "cliente_id")
    private Cliente cliente;
    @JsonIgnoreProperties("listaReservas")
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Hotel.class)
    @JoinColumn(nullable = false, name = "hotel_id")
    private Hotel hotel;
    @Column(length = 55)
    private LocalDate fechaReserva;
    @Column(length = 55, nullable = false)
    private Integer duracionDias;
    @Enumerated(EnumType.STRING)
    @Column(nullable= false, columnDefinition = "ENUM('PENDIENTE', 'CONFIRMADA', 'CANCELADA', 'COMPLETADA')")
    private Estado estado;
    public Reserva() {
    }
    public Reserva(Cliente cliente, Hotel hotel, LocalDate fechaReserva, Integer duracionDias, Estado estado) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.fechaReserva = fechaReserva;
        this.duracionDias = duracionDias;
        this.estado = estado;
    }
    public Reserva(Integer id, Cliente cliente, Hotel hotel, LocalDate fechaReserva, Integer duracionDias,
            Estado estado) {
        this.id = id;
        this.cliente = cliente;
        this.hotel = hotel;
        this.fechaReserva = fechaReserva;
        this.duracionDias = duracionDias;
        this.estado = estado;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public Integer getDuracionDias() {
        return duracionDias;
    }
    public void setDuracionDias(Integer duracionDias) {
        this.duracionDias = duracionDias;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    
}

