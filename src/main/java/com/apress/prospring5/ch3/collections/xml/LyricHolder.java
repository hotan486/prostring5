package com.apress.prospring5.ch3.collections.xml;

import com.apress.prospring5.ch3.collections.ContentHolder;

/**
 * Created by iuliana.cosmina on 2/19/17.
 */
public class LyricHolder implements ContentHolder{
	private String value = "'You be the DJ, I'll be the driver'";


	@Override public String toString() {
		return "LyricHolder: { " + value + "}";
	}
}

