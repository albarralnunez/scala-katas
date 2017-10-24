package akka.crawler


class WikipediaCrawler(start: String, end: String) {

  private val _start: WikiPage = new WikiPage(start)
  private val _end: WikiPage = new WikiPage(end)
  private val wikipediaScraper: WikipediaScraper = new WikipediaScraper()

  def run() = {
    val links: List[String] = wikipediaScraper.AllWikiLinks(_start)

  }

}
