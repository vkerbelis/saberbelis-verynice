@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.skrynstruktur

import android.annotation.SuppressLint
import com.saberbelis.verynice.fradžails.AzTanksFradžail
import fremvurk.alijazing.Strindž
import fremvurk.alijazing.perdengim.Aktivus
import fremvurk.alijazing.perdengim.plusAssign
import java.util.*

@SuppressLint("DefaultLocale")
interface Skryn {
    val tytel: Strindž
        get() = this::class.java.simpleName
            .replace("(.)(\\p{Lu})".toRegex(), "$1 $2")
            .toLowerCase(Locale.ROOT)
            .capitalize()

    fun ateč(aktivus: Aktivus)

    object Impl {
        class AzTanks : Skryn {
            override val tytel: Strindž
                get() = super.tytel + "! Sorry, this is sacred - no screwing around here"

            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class KaušinGeim : Skryn {
            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class TaipReiser : Skryn {
            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class VerkOnRandoumaizerProžekt : Skryn {
            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class GoHaumJurDrunk : Skryn {
            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class Djoom : Skryn {
            override val tytel: Strindž
                get() = super.tytel.toUpperCase()

            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class Le0rnNewKonsept : Skryn {
            override val tytel: Strindž
                get() = "Le0rn new konspet"

            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class YouTubeTMnChill : Skryn {
            override val tytel: Strindž
                get() = "YouTube n' Chill"

            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }

        class RollAgain : Skryn {
            override fun ateč(aktivus: Aktivus) {
                aktivus += AzTanksFradžail()
            }
        }
    }
}