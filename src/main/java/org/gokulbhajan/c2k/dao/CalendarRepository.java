package org.gokulbhajan.c2k;

import org.gokulbhajan.c2k.model.Calendar;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "calendar", path = "calendar")
public interface CalendarRepository extends PagingAndSortingRepository<Calendar, Integer> {

}
