package in.onesoft.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CarController {
	@Autowired
	CarRepository carRepo;

	

	// static Logger log = Logger.getLogger(CarController.class);
	@GetMapping("/get")
	public String showMEssage() {
		// PropertyConfigurator.configure("log4j.properties");
		// log.info("printing...");
		// log.debug(carRepo.sho);

		return "Welcome to Rest Api";
	}

	@GetMapping("/cars/")
	public List<CarEntity> allCar() {
		List<CarEntity> li = carRepo.findAll();
		// log.info(li);
		return li;
	}

	@PostMapping("/save/")
	public String saveData(@RequestBody CarEntity car) {
		carRepo.save(car);
		// log.info(car);
		return "saved data ";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		carRepo.deleteById(id);
		// log.info("Car id "+id +" is deleted sucessfully ");
		return "delete Data Successfully";
	}

	@GetMapping("/getbyyear/{fromyear}/{toyear}")
	public List<CarEntity> findByDate(@PathVariable Integer fromyear, @PathVariable Integer toyear) {
		if (fromyear < 1999) {
			System.out.println("year cannot be lesserr than 1999 ");
		} else {
			return carRepo.findByYear(fromyear, toyear);
		}
		return null;
	}

	@PutMapping("/update/{id}")
	public String updateById(@RequestBody CarEntity ce, @PathVariable int id) {
		carRepo.save(ce);
		// log.info("Car id "+ce.getId()+" is updated successfully ");
		return "updated ";
	}

	@GetMapping("/findbyid/{id}")
	public Optional<CarEntity> findbyId(@PathVariable int id) {
		return carRepo.findById(id);
	}

}
