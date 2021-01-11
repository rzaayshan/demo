package az.ibar.miles.ms.demo.service;

import az.ibar.miles.ms.demo.dto.ContactInfoDTO;
import az.ibar.miles.ms.demo.dto.DeliveryInfoDTO;
import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.dto.PersonalInfoDTO;
import az.ibar.miles.ms.demo.model.ContactInfoReq;
import az.ibar.miles.ms.demo.model.DeliveryInfoReq;

public interface InfoService {
    InfoDTO savePersInfo(PersonalInfoDTO dto);
    InfoDTO updateContactInfo(Long id, ContactInfoDTO infoDetails);
    InfoDTO updateDeliveryInfo(Long id, DeliveryInfoDTO infoDetails);
}
