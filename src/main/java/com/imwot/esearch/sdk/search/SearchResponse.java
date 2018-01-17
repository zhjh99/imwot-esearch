package com.imwot.esearch.sdk.search;

import java.util.List;

public class SearchResponse {

	private List<SearchHit> searchHits;

	public List<SearchHit> getSearchHits() {
		return searchHits;
	}

	public void setSearchHits(List<SearchHit> searchHits) {
		this.searchHits = searchHits;
	}
}
