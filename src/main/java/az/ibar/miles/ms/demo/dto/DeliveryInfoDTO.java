package az.ibar.miles.ms.demo.dto;

import az.ibar.miles.ms.demo.enums.Step;
import lombok.Data;

@Data
public class DeliveryInfoDTO {
    private String delCity;
    private String delAddress;
    private String delBranch;
    private static final Step STEP = Step.STEP3;
}
