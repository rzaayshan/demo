package az.ibar.miles.ms.demo.service.impl;

import az.ibar.miles.ms.demo.dto.ContactInfoDTO;
import az.ibar.miles.ms.demo.dto.DeliveryInfoDTO;
import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.dto.PersonalInfoDTO;
import az.ibar.miles.ms.demo.entity.Info;
import az.ibar.miles.ms.demo.mapper.InfoMapper;
import az.ibar.miles.ms.demo.repository.InfoRepo;
import az.ibar.miles.ms.demo.service.InfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InfoServiceImpl implements InfoService {
    private final InfoRepo repo;
    private final InfoMapper mapper;

    @Override
    public InfoDTO savePersInfo(PersonalInfoDTO personalInfoDTO) {
        Info info = new Info();
        mapper.updateInfoFromPersonalInfoDTO(personalInfoDTO, info);
        Info saved = repo.save(info);
        return mapper.infoToDto(saved);
    }

    @Override
    public InfoDTO updateContactInfo(Long id, ContactInfoDTO contactInfoDTO) {
        Info info = repo.findById(id).orElseThrow(RuntimeException::new);
        mapper.updateInfoFromContactInfoDTO(contactInfoDTO, info);
        Info saved = repo.save(info);
        return mapper.infoToDto(saved);
    }

    @Override
    public InfoDTO updateDeliveryInfo(Long id, DeliveryInfoDTO deliveryInfoDTO) {
        Info info = repo.findById(id).orElseThrow(RuntimeException::new);
        mapper.updateInfoFromDeliveryInfoDTO(deliveryInfoDTO, info);
        Info saved = repo.save(info);
        return mapper.infoToDto(saved);
    }


}
