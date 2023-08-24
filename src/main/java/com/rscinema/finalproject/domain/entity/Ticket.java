package com.rscinema.finalproject.domain.entity;

import com.rscinema.finalproject.domain.entity.order.Order;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "row_num")
    private Integer rowNumber;

    @Column(name = "seat_num")
    private Integer seatNumber;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "showtime_id", referencedColumnName = "id")
    private ShowTime showTime;

    @Column(name = "reserved")
    private boolean reserved;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

}
