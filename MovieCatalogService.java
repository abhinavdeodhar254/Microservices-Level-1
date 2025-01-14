package com.javabrains.movie_catalog_service.recourses;

import com.javabrains.movie_catalog_service.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers","test",4)
        );
    }
}
