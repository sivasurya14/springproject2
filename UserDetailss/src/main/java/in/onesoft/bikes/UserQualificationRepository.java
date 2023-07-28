package in.onesoft.bikes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserQualificationRepository  extends JpaRepository<UserQualificationEntity, Integer>{
	
	@Query(value="select useraddress.street ,useraddress.city from useraddress,userexperience where useraddress.userid=userexperience.userid",nativeQuery = true)
	 public List<UseraddressEntity>getvalueByName();
	
	@Query(value="select * from userqualification where totalmarks >?1 and totalmarks<?2 ",nativeQuery = true)
	 public List<UserQualificationEntity> getMarks (@PathVariable ("frommark") Integer frommark,@PathVariable ("tomark") Integer tomark);
	
	
	
	
}
