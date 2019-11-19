@file:JvmName("Main")

package cli

import com.github.ajalt.clikt.core.subcommands
import commands.MyCli
import commands.SayHello

fun main(args: Array<String>) {
    MyCli().subcommands(
        SayHello()
    ).main(args)
}
