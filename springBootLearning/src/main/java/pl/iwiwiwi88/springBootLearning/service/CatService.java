package pl.iwiwiwi88.springBootLearning.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.iwiwiwi88.springBootLearning.dao.CatDao;
import pl.iwiwiwi88.springBootLearning.model.Cat;

@Service
public class CatService {

	private final CatDao catDao;

	@Autowired
	public CatService(@Qualifier("dummyCatDao") CatDao catDao) {
		this.catDao = catDao;
	}

	public int persistNewCat(UUID catId, Cat cat) {
		UUID catUid = catId == null ? UUID.randomUUID() : catId;
		cat.setId(catUid);
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
