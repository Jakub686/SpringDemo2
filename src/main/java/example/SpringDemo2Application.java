package example;

import example.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringDemo2Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2Application.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L,"Mariam","maria.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY,5),21));
	}


}
