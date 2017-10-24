package akka.crawler

import scalaj.http.Http

class WikiPage(url: String) {

  val page: String = load(url)

  private def load(url: String): String = Http("https://en.wikipedia.org" + url).asString.body

}
