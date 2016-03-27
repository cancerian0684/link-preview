package com.leocardz.link.preview.library;

import org.junit.Test;

public class TextCrawlerTest {

	@Test
	public void testGetCode() {
		String url = "http://www.bungeeamerica.com";
		SourceContent content = TextCrawler.scrape(url, TextCrawler.ALL);
		System.out.println(content.toString());
	}
}
