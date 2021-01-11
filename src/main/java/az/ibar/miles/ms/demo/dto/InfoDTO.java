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
