package com.codetory.jarcrawler;

public class JarSpec {

	private String name;
	private String canonicalName;

	public boolean hasThisName(String name) {
		return this.name.equals(name);
	}

	public boolean hasThisCanonicalName(String canonicalName) {
		return this.canonicalName.equals(canonicalName);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCanonicalName(String canonicalName) {
		this.canonicalName = canonicalName;
	}

}
