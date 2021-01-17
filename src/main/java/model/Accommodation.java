package model;

import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

@Data
public class Accommodation {

    private String id;
    private String name;
    private String zone;
    private String city;
    private List<Facility> facilities = Collections.emptyList();
    private VenueType venueType;
    private String imageUrl;
    private String directLink;
    private String latLong;
    private String rating;
    private String reviewCount;
    private Price price;

    public Struct proto() {
        return Struct.newBuilder()
                .putFields("id", Value.newBuilder().setStringValue(requireNonNull(id)).build())
                .putFields("name", Value.newBuilder().setStringValue(requireNonNull(name)).build())
                .putFields("zone", Value.newBuilder().setStringValue(requireNonNull(zone)).build())
                .putFields("city", Value.newBuilder().setStringValue(requireNonNull(city)).build())
                .putFields("facilities", Value.newBuilder().setListValue(ListValue.newBuilder().addAllValues(
                        facilities.stream().map(facility -> Value.newBuilder().setStringValue(requireNonNull(facility).name()).build())
                                .collect(Collectors.toList())))
                        .build())
                .putFields("venueType", Value.newBuilder().setStringValue(requireNonNull(venueType).name()).build())
                .putFields("imageUrl", Value.newBuilder().setStringValue(requireNonNull(imageUrl)).build())
                .putFields("directLink", Value.newBuilder().setStringValue(requireNonNull(directLink)).build())
                .putFields("latLong", Value.newBuilder().setStringValue(requireNonNull(latLong)).build())
                .putFields("rating", Value.newBuilder().setStringValue(requireNonNull(rating)).build())
                .putFields("reviewCount", Value.newBuilder().setStringValue(requireNonNull(reviewCount)).build())
                .putFields("price", Value.newBuilder().setStructValue(requireNonNull(requireNonNull(price)).proto()).build())
                .build();
    }

}
