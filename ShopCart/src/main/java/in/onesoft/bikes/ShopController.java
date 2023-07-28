package in.onesoft.bikes;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ShopController {
	@Autowired
	ShopRepository shoprepo;

	@GetMapping("/map/")
	public String getMessage() {
		
		return "Welcome";
	}
	@GetMapping("/all")
	public List<ShopEntity> findALL() {
		List<ShopEntity> li = shoprepo.findAll();
		
		
	
		return li;

	}
	@PostMapping("/save")
	 public String saveDet(@RequestBody ShopEntity sh){
		  shoprepo.save(sh);
		  return "SAVED DATA SUCCESSFULLY";	
	}

	@GetMapping("/{id}")
	public Optional<ShopEntity> findOne(@PathVariable int id) {
		return shoprepo.findById(id);	
}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		shoprepo.deleteById(id);
		return "DELETE DATA SUCCESSFULLY";
	}
	@GetMapping("/cate/{cid}")
	public List<ShopEntity> findCate(@PathVariable Integer cid){
	List<ShopEntity> li=shoprepo.findcate(cid);
		return li;	
	}
	
}