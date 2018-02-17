package pl.iwiwiwi88.springBootLearning.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

}
