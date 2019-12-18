@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.skrynstruktur

import android.annotation.SuppressLint
import com.saberbelis.verynice.fradžails.AzTanksFradžail
import com.saberbelis.verynice.fradžails.BassImplFradžail
import fremvurk.alijazing.Strindž
import fremvurk.alijazing.perdengim.Aktivus
import fremvurk.alijazing.perdengim.plusAssign
import java.util.*

typealias Skrny = Skryn

@SuppressLint("DefaultLocale")
interface Skryn {
    val tytel: Strindž
        get() = this::class.java.simpleName
            .replace("(.)(\\p{Lu})".toRegex(), "$1 $2")
            .toLowerCase(Locale.ROOT)
            .capitalize()

    fun slapp(aktivus: Aktivus)

    object Impl {
        class AzTanks : Skryn {
            override val tytel: Strindž
                get() = super.tytel + "! Sorry, this is sacred - no screwing around here"

            override fun slapp(aktivus: Aktivus) {
                aktivus += AzTanksFradžail(tytel)
            }
        }

        class KaušinGeim : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class TaipReiser : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class VerkOnRandoumaizerProžekt : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class GoHaumJurDrunk : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class Djoom : Skryn {
            override val tytel: Strindž
                get() = super.tytel.toUpperCase()

            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class Le0rnNewKonsept : Skryn {
            override val tytel: Strindž
                get() = "Le0rn new konspet"

            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class YouTubeTMnChill : Skryn {
            override val tytel: Strindž
                get() = "YouTube n' Chill"

            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class RollAgain : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class KomenskiLogo : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        class DoMicrosoftWindowsXPGame : Skryn {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail(tytel)
            }
        }

        fun BūbleTrūble(): Skryn = object : Skrny {
            override fun slapp(aktivus: Aktivus) {
                aktivus += BassImplFradžail("BūbleTrūble")
            }
        }
    }
}