package in.onesoft.shirts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tshirt")
public class ShirtController {
	@Autowired
	ShirtRepository shirtRepo;

	@GetMapping("/")
	public String showMsg() {
		return "welcome to shop.....  ";
	}
	@GetMapping("/all/")
	public List<ShirtsEntity> findall() {
		List<ShirtsEntity> li = new ArrayList<ShirtsEntity>();
		ShirtsEntity d = new ShirtsEntity(101, "yellow", 'M');
		ShirtsEntity d1 = new ShirtsEntity(102, "blue", 'L');
		ShirtsEntity d2 = new ShirtsEntity(103, "white", 'S');
		ShirtsEntity d3 = new ShirtsEntity(104, "blue", 'L');
		ShirtsEntity d4 = new ShirtsEntity(105, "red", 'L');
		li.add(d);
		li.add(d1);
		li.add(d2);
		li.add(d3);
		li.add(d4);
		List<ShirtsEntity> list = li.stream().filter(x -> x.getColour().equalsIgnoreCase("yellow"))
				.collect(Collectors.toList());
		return list;
	}
	@GetMapping("/shirts/")
	public List<ShirtsEntity> findAll() {
		List<ShirtsEntity> sd = shirtRepo.findAll();
		return sd;
	}
	@DeleteMapping("/delete/{modelid}")
	public String deleteData(@PathVariable int modelid) {
		shirtRepo.deleteById(modelid);
		return "delete data succesfully";
	}
}