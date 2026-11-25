package demo.desk;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;
@SpringBootApplication
public class DeskApplication {
 public static void main(String[] args) { SpringApplication.run(DeskApplication.class,args); }
 @Bean CommandLineRunner seed(DeskRepository repo) {
  return args -> { if (repo.all().isEmpty()) {
  repo.insert("1", new DeskRecord.Input("Oak doors • De Brouckère", "Els Vermeulen", "Timber", "Surveyed", "Tue 08:00–10:00",LocalDate.now().plusDays(2),"Confirm dimensions and site access before reserving a collection."));
  repo.insert("2", new DeskRecord.Input("Facade bricks • Laeken", "Samira El Amrani", "Masonry", "Reserved", "Thu 13:00–15:00",LocalDate.now().plusDays(5),"Confirm dimensions and site access before reserving a collection."));
  repo.insert("3", new DeskRecord.Input("School lighting • Jette", "Pieter Jacobs", "Fixtures", "Collected", "Fri 09:00–11:00",LocalDate.now().plusDays(8),"Confirm dimensions and site access before reserving a collection."));
  repo.insert("4", new DeskRecord.Input("Pine floorboards • Ixelles", "Els Vermeulen", "Timber", "Surveyed", "Tue 08:00–10:00",LocalDate.now().plusDays(11),"Confirm dimensions and site access before reserving a collection."));
  repo.insert("5", new DeskRecord.Input("Library shelving • Forest", "Samira El Amrani", "Masonry", "Reserved", "Thu 13:00–15:00",LocalDate.now().plusDays(14),"Confirm dimensions and site access before reserving a collection."));
  repo.insert("6", new DeskRecord.Input("Courtyard pavers • Evere", "Pieter Jacobs", "Fixtures", "Collected", "Fri 09:00–11:00",LocalDate.now().plusDays(17),"Confirm dimensions and site access before reserving a collection."));
  }};
 }
}
