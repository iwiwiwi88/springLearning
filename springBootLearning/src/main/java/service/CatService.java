package service;

import java.util.List;
import java.util.UUID;

import dao.CatDao;
import model.Cat;

public class CatService {

	private final CatDao catDao;

	public CatService(CatDao catDao) {
		this.catDao = catDao;
	}

	public int persistNewCat(UUID catId, Cat cat) {
		UUID catUid = catId == null ? UUID.randomUUID() : catId;
		return catDao.insertNewCat(catUid, cat);
	}

	public Cat getCatById(UUID catId) {
		return catDao.selectCatById(catId);
	}

	public List<Cat> getAllCats() {
		return catDao.selectAllCats();
	}

	public int updateCatById(UUID catId, Cat newCat) {
		return catDao.updateCatById(catId, newCat);
	}

	public int deleteCatById(UUID catId) {
		return catDao.deleteCatById(catId);
	}
}
