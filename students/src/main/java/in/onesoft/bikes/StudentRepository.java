   package in.onesoft.bikes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface StudentRepository  extends JpaRepository<StudentEntity, Integer>{
	@Query(value= "select * from studentdet where grade >=?1 and grade <=?2",nativeQuery=true)
public List<StudentEntity> getdetByGrade (@PathVariable("fromgrade") Integer fromgrade,@PathVariable ("tograde") Integer tograde);	
	
	
	@Query(value= "select * from studentdet where school=?",nativeQuery=true)
public List<StudentEntity> getdetSchool (@PathVariable("getschool")  String getschool);

	@Query(value= "select id,name from studentdet where school=?",nativeQuery=true)
	public List<StudentEntity> getdetName (@PathVariable("getName")  String getName);
}

	




 