package com.siriuscom.librarygenerics;


import java.util.ArrayList;
import java.util.List;

import com.siriuscom.library.Media;

public class Library<T extends Media> {

	private List<T> medias = new ArrayList<>();
	
	public void addMedia(T media) {
		medias.add(media);
	}
	
	public List<T> getMedias() {
		return medias;
	}
}
