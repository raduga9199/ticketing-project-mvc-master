package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    public DataGenerator(RoleService roleService,UserService userService) {
        this.roleService = roleService;
        this.userService = userService;

    }

    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "john@cydeo.com","abc1","7459684532",true,managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Mike", "Smith",
                "mike@cydeo.com","abc2","7459684532",true,adminRole, Gender.MALE);
        UserDTO user3 = new UserDTO("Delisa", "Norre",
                "delisa@cydeo.com","123","3459684532",true,managerRole, Gender.FEMALE);
        UserDTO user4 = new UserDTO("Craig", "Jark",
                "craig@cydeo.com","abc4","7459684532",true,employeeRole, Gender.MALE);
        UserDTO user5 = new UserDTO("Shaun", "Hayns",
                "shaun@cydeo.com","abc5","7645684532",true,managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("Elizabeth", "Loren",
                "elizabeth@cydeo.com","abc6","7463684532",true,employeeRole, Gender.FEMALE);
        UserDTO user7 = new UserDTO("Maria", "Ada",
                "maria@cydeo.com","abc7","7459699932",true,employeeRole, Gender.FEMALE);
        UserDTO user8 = new UserDTO("Bill", "Matt",
                "bill@cydeo.com","abc8","7455554532",true,employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);
    }


}
