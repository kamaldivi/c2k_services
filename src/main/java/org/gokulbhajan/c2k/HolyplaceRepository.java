package org.gokulbhajan.c2k;

import org.gokulbhajan.c2k.model.HolyPlace;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "holyplace", path = "holyplace")
public interface HolyplaceRepository extends PagingAndSortingRepository<HolyPlace, Integer> {

}
