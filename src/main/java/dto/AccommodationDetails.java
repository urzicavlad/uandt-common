package dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class AccommodationDetails {

    public List<String> facilities;
    public String city;
    public String venueType;
    public String zone;
    public String name;
    public String valuePrice;

}
