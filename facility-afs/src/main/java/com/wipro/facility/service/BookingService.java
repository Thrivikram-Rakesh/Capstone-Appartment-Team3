package com.wipro.facility.service;

import java.util.List;
import com.wipro.facility.module.Booking;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking getBookingById(Integer id);
    List<Booking> getAllBookings();
    Booking updateBooking(Integer id, Booking booking);
    void deleteBooking(Integer id);
}

