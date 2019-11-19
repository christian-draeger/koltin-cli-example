package commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import it.skrape.extract
import it.skrape.selects.html5.a
import it.skrape.skrape

class LinkCrawler : CliktCommand(
    name = "link-crawler",
    help = """
        The link-crawler command will extract and  print all links of a given website.
        For instance you could try to grab all links from 'https://kotlinlang.org/docs/reference/
    """.trimIndent(),
    printHelpOnEmptyArgs = true
) {

    val url by argument()

    override fun run() {
        echo("Starting to crawl $url for available links")

        crawlLinks(url).forEach { echo(it) }
    }

    private fun crawlLinks(targetUrl: String) =
        skrape {
            url = targetUrl
            extract {
                htmlDocument {
                    a {
                        findAll {
                            eachHrefAsAbsoluteLink
                        }
                    }
                }
            }
        }
}
