package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@Entity
public class Reservation {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String startDate;
    private String endDate;
    @ManyToOne
    private Accommodation accommodation;
    private Status status;
    @OneToOne
    private Payment payment;
    @ManyToOne
    private User user;
    @CreationTimestamp
    private LocalDateTime createDateTime;
    @UpdateTimestamp
    private LocalDateTime updateDateTime;
    private String flow;

    public enum Status {
        PENDING_PAYMENT,
        EXPIRED,
        PAID,
    }
}
