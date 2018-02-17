package pl.iwiwiwi88.springBootLearning.dao;

import java.util.List;
import java.util.UUID;

import pl.iwiwiwi88.springBootLearning.model.Cat;

public interface CatDao {

	int insertNewCat(UUID catId, Cat cat);

	Cat selectCatById(UUID catId);

	List<Cat> selectAllCats();

	int updateCatById(UUID catId, Cat newCat);

	int deleteCatById(UUID catId);

}
