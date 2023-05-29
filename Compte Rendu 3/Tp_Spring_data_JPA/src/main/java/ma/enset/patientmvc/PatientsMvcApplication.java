package ma.enset.patientmvc;


import ma.enset.patientmvc.entities.Groupe;
import ma.enset.patientmvc.entities.UserServiceImpl;
import ma.enset.patientmvc.entities.Utilisateur;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(PatientsMvcApplication.class,args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("ma.enset.patientmvc.test");
//        context.refresh();
//
//       // MathService ms = context.getBean(MathService.class);
//        MathService ms = (MathService) context.getBean("ms");
//        int add = ms.Add(3,5);
//        System.out.println(add); //8

    }

    @Bean
    CommandLineRunner commandLineRunner(
    UserServiceImpl userService
    ) {
        //   return args -> {
//          patientRepository.save(new Patient(null,"Hassan",new Date(),false,12));
//          patientRepository.save(new Patient(null,"Mohammed",new Date(),true,321));
//          patientRepository.save(new Patient(null,"Yassmine",new Date(),true,65));
//          patientRepository.save(new Patient(null,"Hanae",new Date(),false,32));
//
//
//          patientRepository.findAll().forEach(p->{
//              System.out.println(p.getNom());
//          });
//
//          Patient patient =  patientRepository.findById(1);

        return args -> {
//            studentService.AddNewStudent(new Student(null, "hinane", "aymane"));
//            studentService.AddNewStudent(new Student(null, "yohane", "aymane"));
//
//            Student student = studentService.FindStudentByName("yohane");
//
//            System.out.println(student);

            userService.saveUser(new Utilisateur(null,"aymane",null));
            userService.saveUser(new Utilisateur(null,"yohane",null));

//            Utilisateur user = userService.findUtilisateurByName("aymane");
//            System.out.println(user.getUserName());

            userService.saveGroup(new Groupe(null,"casa",null));

//            Groupe groupe = userService.findGroupByName("casa");
//            System.out.println(groupe.getGroupName());

            userService.AddUserToGroup("aymane","casa");


            Utilisateur user = userService.findUtilisateurByName("aymane");
//            System.out.println(user.getUserName());
            user.getGroupes().forEach(x->{
                System.out.println(x.getGroupName());
            });


//
//            List<Utilisateur> utilisateurList = userService.GetAllUser("casa");
//
//
//
//            for (var item:utilisateurList) {
//                System.out.println(item.getUserName());
//            }

        };




    }
}


