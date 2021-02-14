package model;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static java.util.Objects.requireNonNull;

@Data
@Accessors(chain = true)
@Entity
public class Price {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @OneToOne(cascade = CascadeType.MERGE)
    private Currency currency;
    private String value;

    public Struct proto() {
        return Struct.newBuilder()
                .putFields("currency", Value.newBuilder().setStringValue(requireNonNull(currency).getValue()).build())
                .putFields("value", Value.newBuilder().setStringValue(requireNonNull(value)).build())
                .build();
    }

}
