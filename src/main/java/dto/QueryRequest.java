package dto;

import lombok.Data;

import java.util.List;

@Data
public class Query {

    public List<String> facilities;
    public String city;
    public String venueType;

}
