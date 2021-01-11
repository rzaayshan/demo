package az.ibar.miles.ms.demo.entity;


import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import lombok.Data;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
public class Info {
    @Id
    private String id;

    @NotNull
    @Size(min = 2, max=50)
    @Pattern(regexp="^[A-Za-z]*$")
    private String name;

    @NotNull
    @Size(min = 2, max=50)
    @Pattern(regexp="^[A-Za-z]*$")
    private String surname;

    @NotNull
    @Size(min = 2, max=50)
    @Pattern(regexp="^[A-Za-z]*$")
    private String patronymic;
    private Date birth_date;
    private Gender gender;
    private Citizen citizen;
    private String id_no;
    private String photo_front;
    private String photo_back;
    private String code;
    private String phone;
    private String email;
    private String city;
    private String address;
    private String del_city;
    private String del_address;
    private String del_branch;

}
