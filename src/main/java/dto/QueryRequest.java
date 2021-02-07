package dto;

import lombok.Data;

import java.util.List;

@Data
public class QueryRequest {

    public List<String> facilities;
    public String city;
    public String venueType;
    public String startDate;
    public String endDate;

}
