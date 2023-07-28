	package in.onesoft.car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface CarRepository  extends JpaRepository <CarEntity,Integer>{
	
	@Query(value="select * from car where year(date)>=?1 and year(date) <=?2", nativeQuery = true)
	public List<CarEntity> findByYear(@PathVariable ("fromyear") Integer fromyear ,@PathVariable ("toyear") Integer toyear);
}
