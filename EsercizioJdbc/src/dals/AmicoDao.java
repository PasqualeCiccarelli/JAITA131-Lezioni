package dals;

import java.util.List;

import models.entity.AmicoEntity;

public interface AmicoDao {
	
	List<AmicoEntity> getAllAmici();
	AmicoEntity getAmicoById(int id);
	int addAmico(AmicoEntity amico);
	int updateAmico(AmicoEntity amico);
	int delateAmico(int id);
	
	

}
