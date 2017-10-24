package akka.crawler

sealed trait CrawlerMessage

case object Scrap extends CrawlerMessage

case class Work(page: WikiPage) extends CrawlerMessage

case class Result(page: WikiPage) extends CrawlerMessage



