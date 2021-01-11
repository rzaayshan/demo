package az.ibar.miles.ms.demo.dto;

import az.ibar.miles.ms.demo.enums.Citizen;
import az.ibar.miles.ms.demo.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class InfoDTO {
    private String id;
    private String name;
    private String surname;
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
}
