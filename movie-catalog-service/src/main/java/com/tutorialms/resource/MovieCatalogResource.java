package com.tutorialms.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialms.model.CatelogItem;

@RestController
@RequestMapping("/catelog")
public class MovieCatalogResource {

	@RequestMapping(value = "/catelog/{userId}" )
	public List<CatelogItem> getCatalog(@PathVariable("userId") String userId){
		
		return Collections.singletonList(
				new CatelogItem("Spiderman-far-from-home", "Marvel-films", 7));
	}

}
