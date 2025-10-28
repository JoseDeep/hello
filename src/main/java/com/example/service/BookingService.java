package com.example.service;

import com.example.model.Booking;
import com.example.repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private final BookingRepository repo;
    public BookingService(BookingRepository repo) { this.repo = repo; }

    public Booking save(Booking b) { return repo.save(b); }
    public List<Booking> pending() { return repo.findByConfirmedFalse(); }
    public List<Booking> all() { return repo.findAll(); }
    public Optional<Booking> find(Long id) { return repo.findById(id); }
}
