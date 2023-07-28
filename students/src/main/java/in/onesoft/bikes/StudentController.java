package in.onesoft.bikes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepo;
	
	@GetMapping("/")
     public String showMsg() {
	 return "welcome to jpa repository .. thank you..";
  }
    @PostMapping("/save")
    public String saveDet(@RequestBody StudentEntity ss) {
    	studentRepo.save(ss);
    	return "saved data succesffuly";
    }
    @GetMapping("/get/")
    public List<StudentEntity> getDetails(){
    	return studentRepo.findAll();
    	
    }
	@DeleteMapping("/delete/{id}")
	public String deletdetails(@PathVariable Integer id) {
		studentRepo.deleteById(id);
		return "delete data successfully";
	}
	@GetMapping("/filter/{fromgrade}/{tograde}")
	public List <StudentEntity> getGrade(@PathVariable Integer fromgrade, @PathVariable Integer tograde){
		 return studentRepo.getdetByGrade(fromgrade, tograde);	
	}
	@GetMapping("/filtschool/{getschool}")
	public List <StudentEntity> getSchool(@PathVariable String getschool){
		 return studentRepo.getdetSchool(getschool);	
}
	@GetMapping("/filtname/{getName}")
	public List <StudentEntity> getName(@PathVariable String getName){
		 return studentRepo.getdetName(getName);	
}
}