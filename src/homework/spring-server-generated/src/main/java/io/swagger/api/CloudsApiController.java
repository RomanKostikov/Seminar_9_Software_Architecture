package io.swagger.api;

import io.swagger.model.Clouds;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-22T11:09:25.560420041Z[GMT]")
@RestController
public class CloudsApiController implements CloudsApi {

    private static final Logger log = LoggerFactory.getLogger(CloudsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CloudsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> cancelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Clouds> createCloud(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Error body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Clouds>(objectMapper.readValue("[ {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n}, {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n} ]", Clouds.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Clouds>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Clouds>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Clouds> getAllClouds() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Clouds>(objectMapper.readValue("[ {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n}, {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n} ]", Clouds.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Clouds>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Clouds>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Clouds> getCloud(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") String cloudId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Clouds>(objectMapper.readValue("[ {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n}, {\n  \"OS\" : \"Windows\",\n  \"id_client\" : \"f102b615\",\n  \"CPU\" : \"8\",\n  \"cloud_id\" : \"f102b615\",\n  \"RAM\" : \"128\"\n} ]", Clouds.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Clouds>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Clouds>(HttpStatus.NOT_IMPLEMENTED);
    }

}
