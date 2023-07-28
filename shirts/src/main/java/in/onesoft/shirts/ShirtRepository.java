package in.onesoft.shirts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShirtRepository extends JpaRepository<ShirtsEntity, Integer> {

}
