package dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class QueryRequest {

    public List<String> facilities;
    public String city;
    public String venueType;
    public String startDate;
    public String endDate;

}
