package org.gokulbhajan.c2k;

import org.gokulbhajan.c2k.model.Habit;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "habit", path = "habit")
public interface HabitRepository extends PagingAndSortingRepository<Habit, Integer> {

}
