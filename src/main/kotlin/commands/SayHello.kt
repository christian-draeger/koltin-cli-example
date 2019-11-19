package commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.UsageError
import com.github.ajalt.clikt.output.TermUi

class SayHello : CliktCommand(name = "say-hello") {

    override fun run() {
        println("Hi, how are you? I'm not sure if we have met already.")

        val username =  TermUi.prompt("What's your name?")
        val age = TermUi.prompt("How old are you") {
            it.toIntOrNull() ?: throw UsageError("$it is not a valid age")
        }
        TermUi.echo("Nice to meet you $username. What a time to be alive at age $age \uD83C\uDF89.")
    }
}
