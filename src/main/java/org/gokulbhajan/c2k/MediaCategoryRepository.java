package org.gokulbhajan.c2k;

import org.gokulbhajan.c2k.model.MediaCategory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface MediaCategoryRepository extends PagingAndSortingRepository<MediaCategory, Integer> {

}
