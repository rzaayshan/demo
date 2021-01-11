package az.ibar.miles.ms.demo.controller;


import az.ibar.miles.ms.demo.dto.InfoDTO;
import az.ibar.miles.ms.demo.mapper.InfoMapper;
import az.ibar.miles.ms.demo.mapper.ReqMapper;
import az.ibar.miles.ms.demo.model.ContactInfoReq;
import az.ibar.miles.ms.demo.model.DeliveryInfoReq;
import az.ibar.miles.ms.demo.model.PersonalInfoReq;
import az.ibar.miles.ms.demo.service.InfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class InfoController {
    private final InfoService infoService;
    private final ReqMapper mapper;

    @PostMapping("/personal-info")
    public ResponseEntity<InfoDTO> savePersInfo(@RequestBody PersonalInfoReq req){
        return ResponseEntity.status(HttpStatus.CREATED).body(infoService.savePersInfo(mapper.personalInfoReqToDTO(req)));
    }

    @PutMapping("/contact-info/{id}")
    public ResponseEntity<InfoDTO> updateContactInfo(@PathVariable Long id, @RequestBody ContactInfoReq req){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.updateContactInfo(id, mapper.contactInfoReqToDTO(req)));
    }

    @PutMapping("/delivery-info/{id}")
    public ResponseEntity<InfoDTO> updateDeliveryInfo(@PathVariable Long id, @RequestBody DeliveryInfoReq req){
        return ResponseEntity.status(HttpStatus.OK).body(infoService.updateContactInfo(id, mapper.deliveryInfoReqToDTO(req)));
    }

}
