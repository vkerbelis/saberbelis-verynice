package com.saberbelis.verynice

import fremvurk.alijazing.Aplikacijon
import fremvurk.alijazing.YntėntPraleidym

class Epicus : Aplikacijon() {
    override fun onCreate() {
        super.onCreate()
        registerReceiver(
            Risyver(),
            YntėntPraleidym("com.saberbelis.verynice.SEND")
        )
    }
}