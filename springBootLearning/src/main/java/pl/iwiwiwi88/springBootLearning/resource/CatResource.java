package pl.iwiwiwi88.springBootLearning.resource;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.iwiwiwi88.springBootLearning.model.Cat;
import pl.iwiwiwi88.springBootLearning.service.CatService;

@RestController
@RequestMapping("/api/v1/cats")
public class CatResource {
	private final CatService catService;

	@Autowired
	public CatResource(CatService catService) {
		this.catService = catService;
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cat> getAllCats() {
		return catService.getAllCats();
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = { "catId" })
	public Cat getCatById(@PathVariable("catId") UUID catId) {
		return catService.getCatById(catId);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertNewStudent(@RequestBody Cat cat) {
		catService.persistNewCat(UUID.randomUUID(), cat);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, path = { "catId" })
	public void updateCatById(@PathVariable("catId") UUID catId, @RequestBody Cat newCat) {
		catService.updateCatById(catId, newCat);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = { "catId" })
	public void deleteCatById(@PathVariable("catId") UUID catId) {
		catService.deleteCatById(catId);
	}
}
