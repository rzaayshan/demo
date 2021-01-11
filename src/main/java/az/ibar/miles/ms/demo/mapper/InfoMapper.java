package az.ibar.miles.ms.demo.mapper;


import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.entity.Info;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface InfoMapper {
    Info dtoToInfo(InfoDTO dto);

    InfoDTO infoToDto(Info info);
}
