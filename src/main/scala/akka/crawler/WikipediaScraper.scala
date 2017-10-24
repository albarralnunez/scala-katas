package akka.crawler

import org.htmlcleaner.{HtmlCleaner, TagNode}


class WikipediaScraper() {

  private val REGEX_WIKI_LINK: String = "/wiki/.+?"

  def _retrieveHrefFromTagNode(node: TagNode): String =
    node.getAttributeByName("href")

  def _retrieveLinks(elements: List[TagNode]): List[String] =
    elements map _retrieveHrefFromTagNode

  def _filterWikiLinks(elements: List[String]): List[String] =
    elements filter ( _.matches(REGEX_WIKI_LINK ))

  def getWikipediaHref(html: String): List[TagNode] = {
    val cleaner: HtmlCleaner = new HtmlCleaner()
    val rootNode: TagNode = cleaner.clean(html)
    val element: TagNode = rootNode.findElementByAttValue("id", "content", true, false)
    val links: List[TagNode] = element.getElementsHavingAttribute("href", true).toList
    links
  }

  def AllWikiLinks(wikiPage: WikiPage): List[String] = {
    val allPageLinks: List[TagNode] = getWikipediaHref(wikiPage.page)
    _filterWikiLinks(_retrieveLinks(allPageLinks))
  }

}
