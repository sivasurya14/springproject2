package in.onesoft.bikes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface AddressRepository  extends JpaRepository <UseraddressEntity,Integer> {
	@Query(value="select ua.*,ue.companyname from useraddress ua inner join userExperience ue on ua.userid=ue.userid where ua.userid=?1",nativeQuery = true)
	List<UseraddressEntity> getDetails(int userid);	
	
	@Query(value="select  ue.username,ue.useremail,ue.userpassword , ua.state from useremail ue inner join useraddress ua on ue.userid=ua.userid where ue.userid=?1",nativeQuery = true)
	List<UseraddressEntity> getEmails(int userid);
	
}
