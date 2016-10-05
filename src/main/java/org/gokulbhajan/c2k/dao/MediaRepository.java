package org.gokulbhajan.c2k;

import java.util.List;

import org.gokulbhajan.c2k.model.Media;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "media", path = "media")
public interface MediaRepository extends PagingAndSortingRepository<Media, Integer> {
	List<Media> findByType(@Param("type") String name);

}
