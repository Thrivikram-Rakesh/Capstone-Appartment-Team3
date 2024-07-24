package com.wipro.facility.module;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// import lombok.ToString;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @ToString
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    private Date bookingDate;
    private Integer facilityId;
    private Integer residentId;
    private Date eventDate;
    private String status;
    @Override
    public String toString() {
        return "Booking [id=" + id + ", bookingDate=" + bookingDate + ", facilityId=" + facilityId + ", residentId="
                + residentId + ", eventDate=" + eventDate + ", status=" + status + "]";
    }
}

