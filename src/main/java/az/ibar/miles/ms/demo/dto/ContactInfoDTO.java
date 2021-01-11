package az.ibar.miles.ms.demo.dto;

import az.ibar.miles.ms.demo.enums.Step;
import lombok.Data;

@Data
public class ContactInfoDTO {
    private String code;
    private String phone;
    private String email;
    private String city;
    private String address;
    private Step step;
    private static final Step STEP = Step.STEP2;
}
