package az.ibar.miles.ms.demo.entity;


import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import az.ibar.miles.ms.demo.enums.Step;
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
    private Date birthDate;
    private Gender gender;
    private Citizen citizen;
    private String idNo;
    private String photoFront;
    private String photoBack;
    private String code;
    private String phone;
    private String email;
    private String city;
    private String address;
    private String delCity;
    private String delAddress;
    private String delBranch;
    private Step step;

}
