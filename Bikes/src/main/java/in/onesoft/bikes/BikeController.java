package in.onesoft.bikes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	@Autowired
	BikeRepository bikeRepo;
	
	@Autowired
	BikeDao bikedao;
	@GetMapping("/")
	public String getData() {
		return "welcome to bike shop";
	}
	@PostMapping("/save/")
    public String addDetails(@RequestBody BikeEntity be) {
		bikeRepo.save(be);
		return "saved data succesffully";
	}
	@DeleteMapping("/delete/{modelno}")
	public String deleteModel(@PathVariable Integer modelno) {
		bikeRepo.deleteById(modelno);
		return "delete data succesffuly";
	}
	@GetMapping("/all/")
	public List<BikeEntity> findAll() {
		List<BikeEntity> li = bikeRepo.findAll();
	return	li.stream().filter(x->x.getPrice()>6000).collect(Collectors.toList());
	
	}
	@GetMapping("/bikefilter/{fromprice}/{toprice}")
	public List<BikeEntity> getPrice(@PathVariable Integer fromprice, @PathVariable Integer toprice) {
		return bikeRepo.getBikeByPrice(fromprice, toprice);
	}
	
	@PutMapping("/updatevalue/{id}")
	
	public BikeEntity update(@PathVariable int id , @RequestBody BikeEntity b) {
		
		return bikedao.update(id, b);
	}
	
}
