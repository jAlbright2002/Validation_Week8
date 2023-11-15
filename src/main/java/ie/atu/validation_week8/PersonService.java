package ie.atu.validation_week8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    public void savePerson(Person person) {
        System.out.println("Person saved : " + person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        return new Person();
    }

}
