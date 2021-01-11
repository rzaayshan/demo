package az.ibar.miles.ms.demo.service.impl;

import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.entity.Info;
import az.ibar.miles.ms.demo.mapper.InfoMapper;
import az.ibar.miles.ms.demo.model.ContactInfoReq;
import az.ibar.miles.ms.demo.model.DeliveryInfoReq;
import az.ibar.miles.ms.demo.repository.InfoRepo;
import az.ibar.miles.ms.demo.service.InfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class InfoServiceImpl implements InfoService {
    private final InfoRepo repo;
    private final InfoMapper mapper;

    @Override
    public InfoDTO savePersInfo(InfoDTO dto) {
        Info info = mapper.dtoToInfo(dto);
        Info saved = repo.save(info);
        return mapper.infoToDto(saved);
    }

    @Override
    public InfoDTO updateContactInfo(Long id, ContactInfoReq infoDetails) {
        Optional<Info> info = repo.findById(id);
        info.ifPresent(i->{
            i.setCode(infoDetails.getCode());
            i.setPhone(infoDetails.getPhone());
            i.setEmail(infoDetails.getEmail());
            i.setCity(infoDetails.getCity());
            i.setAddress(infoDetails.getAddress());
        });
        Info saved = repo.save(info.orElseThrow(RuntimeException::new));
        return mapper.infoToDto(saved);
    }

    @Override
    public InfoDTO updateDeliveryInfo(Long id, DeliveryInfoReq infoDetails) {
        Optional<Info> info = repo.findById(id);
        info.ifPresent(i->{
            i.setDel_city(infoDetails.getDel_city());
            i.setDel_address(infoDetails.getDel_address());
            i.setDel_branch(infoDetails.getDel_branch());
        });
        Info saved = repo.save(info.orElseThrow(RuntimeException::new));
        return mapper.infoToDto(saved);
    }


}
