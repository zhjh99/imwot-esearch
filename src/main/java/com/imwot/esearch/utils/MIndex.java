package com.imwot.esearch.utils;

import java.io.Serializable;

public class MIndex implements Serializable{

	private static final long serialVersionUID = 1L;
	private long docId;
	private int tf;
	private String pos;

	public long getDocId() {
		return docId;
	}

	public void setDocId(long docId) {
		this.docId = docId;
	}

	public int getTf() {
		return tf;
	}

	public void setTf(int tf) {
		this.tf = tf;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
}
