package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import model.Cat;

public class DummyCatDaoImpl implements CatDao {

	private final Map<UUID, Cat> dummyDatabase;

	public DummyCatDaoImpl() {
		dummyDatabase = new HashMap<UUID, Cat>();
	}

	@Override
	public int insertNewCat(UUID catId, Cat cat) {
		int sizeBeforeAdding = dummyDatabase.size();
		dummyDatabase.put(catId, cat);
		return dummyDatabase.size() - sizeBeforeAdding;
	}

	@Override
	public Cat selectCatById(UUID catId) {
		return dummyDatabase.get(catId);
	}

	@Override
	public List<Cat> selectAllCats() {
		return new ArrayList<>(dummyDatabase.values());
	}

	@Override
	public int updateCatById(UUID catId, Cat newCat) {
		int catExists = dummyDatabase.containsKey(catId) ? 1 : 0;
		dummyDatabase.put(catId, newCat);
		return catExists;
	}

	@Override
	public int deleteCatById(UUID catId) {
		int sizeBeforeAdding = dummyDatabase.size();
		dummyDatabase.remove(catId);
		return sizeBeforeAdding - dummyDatabase.size();
	}

}
