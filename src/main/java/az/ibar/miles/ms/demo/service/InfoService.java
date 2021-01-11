package az.ibar.miles.ms.demo.service;

import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.model.ContactInfoReq;
import az.ibar.miles.ms.demo.model.DeliveryInfoReq;

public interface InfoService {
    InfoDTO savePersInfo(InfoDTO dto);
    InfoDTO updateContactInfo(Long id, ContactInfoReq infoDetails);
    InfoDTO updateDeliveryInfo(Long id, DeliveryInfoReq infoDetails);
}
