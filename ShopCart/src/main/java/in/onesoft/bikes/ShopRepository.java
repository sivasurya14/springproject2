package in.onesoft.bikes;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface ShopRepository extends JpaRepository<ShopEntity,Integer> {
	
	@Query(value = "select * from productdet where cid=?1",nativeQuery = true)
	public List<ShopEntity> findcate(@PathVariable ("cid")Integer cid);
	}



