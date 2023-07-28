package in.onesoft.mobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
@Autowired
MobileRepository mobileRepo;       
	
	@GetMapping("/")
	public String showMsg() {
	     return "welcome to Mobile shop";
   }
	@GetMapping("/mobiles/")
	public List<MobileEntity> findMobile(){
		List<MobileEntity> li =mobileRepo.findAll();
		return li;
	}	
}
