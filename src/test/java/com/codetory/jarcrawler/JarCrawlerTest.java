package com.codetory.jarcrawler;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class JarCrawlerTest {

	@Test
	public void should_FindClasses_When_NameFilterIsProvided() {
		JarCrawler crawler = new JarCrawler();
		crawler.crawl((jar) -> jar.hasThisName("Class1"));
		List<String> result = crawler.getResults();

		assertThat(result,
				contains("com.package1.Class1", "com.package3.Class1"));
	}

	@Test
	public void should_FindClasses_When_CanonicalNameFilterIsProvided() {
		JarCrawler crawler = new JarCrawler();
		crawler.crawl((jar) -> jar.hasThisCanonicalName("com.package1.Class1"));
		List<String> result = crawler.getResults();

		assertThat(result, contains("com.package1.Class1"));
	}
}
