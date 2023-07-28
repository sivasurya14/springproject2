package in.onesoft.bikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeDao {

	@Autowired
	BikeRepository bikerepo;

	public BikeEntity update(int id, BikeEntity b) {

		BikeEntity value = bikerepo.findById(id).get();
		value.setColour(b.getColour());
		value.setModel(b.getModel());
		value.setModelno(b.getModelno());

		return bikerepo.save(value);
	}

}
