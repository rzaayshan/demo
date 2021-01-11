package az.ibar.miles.ms.demo.mapper;

import az.ibar.miles.ms.demo.dto.ContactInfoDTO;
import az.ibar.miles.ms.demo.dto.DeliveryInfoDTO;
import az.ibar.miles.ms.demo.dto.PersonalInfoDTO;
import az.ibar.miles.ms.demo.model.ContactInfoReq;
import az.ibar.miles.ms.demo.model.DeliveryInfoReq;
import az.ibar.miles.ms.demo.model.PersonalInfoReq;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface ReqMapper {
    PersonalInfoDTO personalInfoReqToDTO(PersonalInfoReq req);
    ContactInfoDTO contactInfoReqToDTO(ContactInfoReq req);
    DeliveryInfoDTO deliveryInfoReqToDTO(DeliveryInfoReq req);
}
