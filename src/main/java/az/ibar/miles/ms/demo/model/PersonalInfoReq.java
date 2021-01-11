package az.ibar.miles.ms.demo.model;

import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class PersonalInfoReq {
    private String name;
    private String surname;
    private String patronymic;
    private Date birth_date;
    private Gender gender;
    private Citizen citizen;
    private String id_no;
    private String photo_front;
    private String photo_back;
}
