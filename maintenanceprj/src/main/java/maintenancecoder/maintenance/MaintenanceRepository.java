package maintenancecoder.maintenance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceRepository extends JpaRepository<Action_Maintenance,Long> {
    List<Action_Maintenance> findByNiveauLessThan (int niveau_maint);
}
