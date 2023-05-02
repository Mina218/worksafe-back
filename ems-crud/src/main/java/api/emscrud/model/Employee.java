package api.emscrud.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Entity
@Table(name = "tbl_employees")
@JsonInclude(NON_DEFAULT)

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "address")
    private String address;
    @Column(name="departement")
    private String departement;

    public  Employee(){

    }

    public  Employee(String name,String username,String email ,int age , String address, String Departement){
    super();
        this.name =name;
    this.username=username;
    this.email=email;
    this.age=age;
    this.address=address;
    this.departement=Departement;


    }
    public String getDepartement()
    {
        return departement;
    }
  public void setDepartement(String Departement ){
        this.departement=Departement;
  }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String lastName) {
        this.username = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
