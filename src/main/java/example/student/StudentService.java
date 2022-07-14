package example.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //bean
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1L,"Jakub","jakub.bchyla@gmail.com", LocalDate.of(2000, Month.JANUARY,5),21));
    }

}
