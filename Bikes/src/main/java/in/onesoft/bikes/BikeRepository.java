package in.onesoft.bikes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.PathVariable;


public interface BikeRepository  extends JpaRepository<BikeEntity, Integer> {
	
	@Query(value="select * from bike where price >=?1 and price <=?2",nativeQuery=true)
    public List<BikeEntity> getBikeByPrice (@PathVariable ("fromprice") Integer fromprice,@PathVariable ("tocc") Integer toprice);
    
}
