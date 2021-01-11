package az.ibar.miles.ms.demo.dto;

import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import az.ibar.miles.ms.demo.enums.Step;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfoDTO {
    private String name;
    private String surname;
    private String patronymic;
    private Date birthDate;
    private Gender gender;
    private Citizen citizen;
    private String idNo;
    private String photoFront;
    private String photoBack;
//    private static final Step STEP = Step.STEP1;
}
