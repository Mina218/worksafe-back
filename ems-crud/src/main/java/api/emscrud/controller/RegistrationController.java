package api.emscrud.controller;

import api.emscrud.Request.RegistrationRequest;
import api.emscrud.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="api/v1/registration")
@RestController
@Component
public class RegistrationController {
private final RegistrationService registrationService;

    public RegistrationController(@Autowired RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public String register(@RequestBody RegistrationRequest request){

        return registrationService.register(request);
    }

}
