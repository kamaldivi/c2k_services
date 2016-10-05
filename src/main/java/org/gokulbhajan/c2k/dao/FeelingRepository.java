package org.gokulbhajan.c2k.dao;

import org.gokulbhajan.c2k.model.Feeling;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "feeling", path = "feeling")
public interface FeelingRepository extends PagingAndSortingRepository<Feeling, Integer> {

}
