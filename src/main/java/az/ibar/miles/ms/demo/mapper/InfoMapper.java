package az.ibar.miles.ms.demo.mapper;


import az.ibar.miles.ms.demo.dto.ContactInfoDTO;
import az.ibar.miles.ms.demo.dto.DeliveryInfoDTO;
import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.dto.PersonalInfoDTO;
import az.ibar.miles.ms.demo.entity.Info;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface InfoMapper {
    Info dtoToInfo(InfoDTO dto);

    InfoDTO infoToDto(Info info);

    void updateInfoFromPersonalInfoDTO(PersonalInfoDTO dto, @MappingTarget Info info);

    void updateInfoFromContactInfoDTO(ContactInfoDTO dto, @MappingTarget Info info);

    void updateInfoFromDeliveryInfoDTO(DeliveryInfoDTO dto, @MappingTarget Info info);
}
