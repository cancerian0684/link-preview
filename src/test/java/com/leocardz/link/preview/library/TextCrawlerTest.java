package com.leocardz.link.preview.library;

import org.junit.Test;

import com.leocardz.link.preview.library.TextCrawler.GetCode;

public class TextCrawlerTest {

	@Test
	public void testGetCode() {
		String url = "http://www.google.com";
		GetCode crawler = (new TextCrawler()).new GetCode(1);
		crawler.doInBackground(url);
		System.out.println("");
	}
	
}
