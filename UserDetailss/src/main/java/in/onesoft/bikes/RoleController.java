package in.onesoft.bikes;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class RoleController {
	@Autowired
	RoleRepository roleRepo;
	@Autowired
	UserQualificationRepository qualifiRepo;
	@Autowired
	AddressRepository addresRep;	
	@GetMapping("/get")
	String getMsg() {
		return "sucess user test ";
	}
	@GetMapping("/getall/")
	List<RoleEntity> getRoles(){
		List<RoleEntity> li =roleRepo.findAll();
		return li.stream().filter(x->x.getRolename().equals("admin")).collect(Collectors.toList());
	}
	@GetMapping("/qualification/")
	List<UserQualificationEntity> getQuali(){
		List<UserQualificationEntity> list = qualifiRepo.findAll();
	return list;
	}	
	@GetMapping("/address/")
	List<UseraddressEntity> getAddres(){
		List<UseraddressEntity> list =addresRep.findAll();
		return list;
	}
	@GetMapping("/userDetails/{userid}/")
	List<UseraddressEntity> getDetails(@PathVariable int userid ){
		return addresRep.getDetails(userid);
	}
	@GetMapping("/userEmail/{userid}")
	List<UseraddressEntity> getEmails(@PathVariable int userid){
	      return addresRep.getEmails(userid);
	}
	@GetMapping("/marks/{frommark}/{tomark}/")
	List<UserQualificationEntity> getmarks(@PathVariable Integer frommark,@PathVariable Integer tomark){
	return qualifiRepo.getMarks(frommark, tomark);
	}
}