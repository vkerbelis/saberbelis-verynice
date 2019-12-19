@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.ooteel.komon.taim

import fremvurk.alijazing.*

class Laikradž(vju: Vju) {
    private var kansjūmer: Kansjūmer<Lang> = {}
    private var būlyanSūplyer: Sūplyer<Būlyan> = { true }
    private var stėrtTaim: Lang = System.currentTimeMillis()

    init {
        `do`(vju)
    }

    private fun `do`(vju: Vju) {
        vju.postDelayed({
            val disTaim = (System.currentTimeMillis() - stėrtTaim) / 1000L
            kansjūmer(disTaim)
            `do`(vju)
        }, 1000L)
    }

    fun regexLysen(kansjūmer: Kansjūmer<Lang>) {
        this.kansjūmer = kansjūmer
        stėrtTaim = System.currentTimeMillis()
        būlyanSūplyer = { true }
    }

    fun unregexLysen() {
        kansjūmer = {}
        būlyanSūplyer = { false }
    }
}