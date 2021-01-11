package az.ibar.miles.ms.demo.mapper;

import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.model.PersonalInfoReq;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface ReqMapper {
    InfoDTO reqToDto(PersonalInfoReq req);
}
