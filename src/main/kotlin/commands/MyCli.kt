package commands

import com.github.ajalt.clikt.core.CliktCommand

class MyCli : CliktCommand() {
    override fun run() {
        // this will be executed whenever a command has been called via the CLI
        // e.g. ./mycli say-hello
        println("Welcome to kotlin-cli-example")
    }
}
