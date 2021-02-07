package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

}
