package pl.sda.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRepository {

    private String name;
    @JsonProperty("full_name") private String fullName;
    private String description;
    private String language;
    private Integer size;
    @JsonProperty("updated_at") private LocalDateTime updateTime;
}
