package api.emscrud.service;


import api.emscrud.Request.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "works" ;
    }
}
