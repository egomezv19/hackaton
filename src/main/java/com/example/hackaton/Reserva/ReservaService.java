package com.example.hackaton.Reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva createReserva(Reserva reserva) {
        // Aquí podrías agregar lógica para verificar si el salón está disponible en ese horario
        return reservaRepository.save(reserva);
    }

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva updateReserva(Integer id, Reserva reservaDetails) {
        Reserva reserva = reservaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reserva not found"));
        reserva.setFecha(reservaDetails.getFecha());
        reserva.setHoraInicio(reservaDetails.getHoraInicio());
        reserva.setHoraFin(reservaDetails.getHoraFin());
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Integer id) {
        Reserva reserva = reservaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Reserva not found"));
        reservaRepository.delete(reserva);
    }

    // Otros métodos según sea necesario
}

