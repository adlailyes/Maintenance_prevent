package maintenancecoder.maintenance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/actions_de_maintenance")
public class action_maintenanceController {

    private MaintenanceRepository maintenanceRepository;

    @Autowired
    public action_maintenanceController(MaintenanceRepository maintenanceRepository){
        this.maintenanceRepository=maintenanceRepository;
    }

    @RequestMapping(value = "/All", method = RequestMethod.GET)
    public List<Action_Maintenance> getAll(){
        return maintenanceRepository.findAll();
    }

    @RequestMapping(value = "/niveauCritique/{niv}", method = RequestMethod.GET)
    public List<Action_Maintenance> getActionsCritiques(@PathVariable int niv){
        return maintenanceRepository.findByNiveauLessThan(niv);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Action_Maintenance> create(@RequestBody Action_Maintenance action_maintenance){

        maintenanceRepository.save(action_maintenance);
        return maintenanceRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Action_Maintenance> remove (@PathVariable long id){
        maintenanceRepository.deleteById(id);
        return maintenanceRepository.findAll();
    }
}
