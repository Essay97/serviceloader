import plugins.Plugin
import java.util.ServiceLoader

fun main() {
    val plugin = ServiceLoader.load(Plugin::class.java)
        .onEach { println(it) }
        .also { println(it.count()) }
        .find { it::class.simpleName == "FirstPlugin" }

    val work = plugin?.doWork() ?: "No plugin found"

    println(work)
}