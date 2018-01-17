package com.imwot.esearch.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class IndexList implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<MIndex> posIist;
	
	public IndexList(){
		posIist=new ArrayList<MIndex>();
	}

	public List<MIndex> getPosIist() {
		return posIist;
	}
	
	public void addPosIist(MIndex mIndex) {
		this.posIist.add(mIndex);
	}

	public void setPosIist(List<MIndex> posIist) {
		this.posIist = posIist;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
