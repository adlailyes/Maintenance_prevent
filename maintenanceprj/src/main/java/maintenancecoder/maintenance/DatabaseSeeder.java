package maintenancecoder.maintenance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private MaintenanceRepository maintenanceRepository;
    @Autowired
    public DatabaseSeeder(MaintenanceRepository maintenanceRepository){
        this.maintenanceRepository=maintenanceRepository;
    }
    @Override
    public void run(String... rgs) throws Exception {
        List<Action_Maintenancea> listeActions=new ArrayList<>();
        listeActions.add(new Action_Maintenance( 2, 5));
        listeActions.add(new Action_Maintenance(4,2));
        listeActions.add(new Action_Maintenance(3,3));
        maintenanceRepository.saveAll(listeActions);

    }
}
.ArrayList;
import java.util.List;
