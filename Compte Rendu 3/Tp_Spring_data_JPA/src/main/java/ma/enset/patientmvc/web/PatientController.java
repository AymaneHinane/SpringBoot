package ma.enset.patientmvc.web;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@AllArgsConstructor
public classPatientController {

    //@Autowired
    //private PatientRepository patientRepository;

    //http://localhost:8082/index
//    @GetMapping("/index")
//    public String patient(Model model){
//        List<Patient> patients = patientRepository.findAll();
//        model.addAttribute("listPatients",patients);
//        return "patients";
//    }

}
