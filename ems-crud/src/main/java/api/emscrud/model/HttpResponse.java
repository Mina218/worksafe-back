package api.emscrud.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;
import lombok.Data;

import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@JsonInclude(NON_DEFAULT)
    public class HttpResponse {
        protected String timeStamp;
        protected int statusCode;
        protected HttpStatus status;
        protected String message;
        protected Map<?, ?> data;
    }

