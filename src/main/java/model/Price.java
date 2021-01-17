package model;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import lombok.Data;

import static java.util.Objects.requireNonNull;

@Data
public class Price {

    private Currency currency;
    private String value;

    public Struct proto() {
        return Struct.newBuilder()
                .putFields("currency", Value.newBuilder().setStringValue(requireNonNull(currency).name()).build())
                .putFields("value", Value.newBuilder().setStringValue(requireNonNull(value)).build())
                .build();
    }
}
