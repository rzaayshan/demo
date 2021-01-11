package az.ibar.miles.ms.demo.model;

import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfoReq {
    private String name;
    private String surname;
    private String patronymic;
    private Date birthDate;
    private Gender gender;
    private Citizen citizen;
    private String idNo;
    private String photoFront;
    private String photoBack;
}
