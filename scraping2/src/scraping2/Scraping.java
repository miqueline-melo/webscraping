package scraping2;

import org.jsoup.nodes.Document;

import java.io.IOException;

import org.jsoup.Jsoup;


public class Scraping {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.gov.br/ans/pt-br/assuntos/consumidor/o-que-o-seu-plano-de-saude-deve-cobrir-1/o-que-e-o-rol-de-procedimentos-e-evento-em-saude").get();
		
		System.out.println(doc.getElementsByClass("callout"));

	}

}
