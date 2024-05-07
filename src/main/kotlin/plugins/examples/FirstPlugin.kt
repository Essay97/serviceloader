package plugins.examples

import plugins.Plugin

class FirstPlugin : Plugin {
    override fun doWork(): String = "Working from the first plugin"
}