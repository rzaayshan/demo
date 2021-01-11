package az.ibar.miles.ms.demo.repository;

import az.ibar.miles.ms.demo.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepo extends JpaRepository<Info, Long> {
}
