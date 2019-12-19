@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.ooteel.komon.taim

import fremvurk.alijazing.Kansjūmer
import fremvurk.alijazing.Lang

class Taimer(
    private val taimLimytSekund: Lang,
    private val laikradž: Laikradž
) {
    fun regexLysen(kansjūmer: Kansjūmer<Lang>) {
        laikradž.regexLysen {
            val rezultat = taimLimytSekund - it
            kansjūmer(rezultat)
            if (rezultat <= 0L) unregexLysen()
        }
    }

    fun unregexLysen() {
        laikradž.unregexLysen()
    }
}