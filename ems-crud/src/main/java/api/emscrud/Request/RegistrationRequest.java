package api.emscrud.Request;

public class RegistrationRequest {
    private final String name ;
    private final String username ;
    private final String email ;
    private final String password ;


    public RegistrationRequest(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }


}
