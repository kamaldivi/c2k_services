package org.gokulbhajan.c2k.model.projections;

import org.gokulbhajan.c2k.model.Media;
import org.gokulbhajan.c2k.model.MediaCategory;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "simpleMedia", types = { Media.class }) 
interface SimpleMedia {
	int getMediaId();
	String getTitle();
	String getType();
	String getPlayUrl();
	MediaCategory getMediaCategory();
}