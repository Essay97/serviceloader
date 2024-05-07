package plugins.examples

import plugins.Plugin

class SecondPlugin : Plugin {
    override fun doWork(): String = "Working from the second plugin"
}