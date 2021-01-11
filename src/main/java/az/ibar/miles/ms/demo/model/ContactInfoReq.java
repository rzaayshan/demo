package az.ibar.miles.ms.demo.model;

import lombok.Data;

@Data
public class ContactInfoReq {
    private String code;
    private String phone;
    private String email;
    private String city;
    private String address;
}
