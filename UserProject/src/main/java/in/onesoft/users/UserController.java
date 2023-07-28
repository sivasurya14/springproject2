package in.onesoft.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@Autowired
	UserRepository userRepo;

	@GetMapping("/")
	public String showMessage() {
		String msg = "Hello Every One ";
		return msg;
	}

	@GetMapping("/mockusers/")
	public List<String> mockUsers() {
		List<String> names = new ArrayList<>();

		names.add("siva");
		names.add("ezhil");
		names.add("dhinesh");
		names.add("davitha");
		names.add("guru");

		return names;

	}

	@GetMapping("/findall/")
	public List<UserEntity> getAllUsers() {
		List<UserEntity> allusers = userRepo.findAll();
		return allusers;

	}

	@GetMapping("/usersdet/{id}")
	public UserEntity userById(@PathVariable("id") Integer uid) {
		UserEntity usr = userRepo.findById(uid).get();
		return usr;
	}
}

