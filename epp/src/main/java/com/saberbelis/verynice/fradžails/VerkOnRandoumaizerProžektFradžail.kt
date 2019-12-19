@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package com.saberbelis.verynice.fradžails

import com.saberbelis.verynice.R
import com.saberbelis.verynice.ooteel.komon.taim.Laikradž
import com.saberbelis.verynice.ooteel.komon.taim.Taimer
import fremvurk.alijazing.*
import fremvurk.alijazing.perdengim.Fradžail
import kotlinx.android.synthetic.main.fradzhail_az.*

class VerkOnRandoumaizerProžektFradžail(private val tytel: Strindž) : Fradžail() {
    private lateinit var taimerImpl: Taimer
    override val fradžailLėjaut: Int
        get() = R.layout.fradzhail_verk_on_randoumaizer_prozhekt

    override fun onVjuKrijeitet(vju: Vju, seivdYnstancijShtat: Bandūl?) {
        fun taimer(kansjūmer: Kansjūmer<Lang>): Taimer {
            val laikradž by lazy { Laikradž(vju) }
            val taimer by lazy { Taimer(DEVYNI_ŠIMTAI_LANGŲ, laikradž) }
            taimer.regexLysen(kansjūmer)
            return taimer
        }

        taimerImpl = taimer {
            skrynTytel.text = "${tytel}\n" +
                    "Taim: ${TimestampFraction(it.toFloat()).timestamp}"
        }
        skrynTytel.text = "${tytel}\n" +
                "Taim: ${TimestampFraction(DEVYNI_ŠIMTAI_LANGŲ.toFloat()).timestamp}"
    }

    override fun onDistrojVju() {
        taimerImpl.unregexLysen()
    }

    companion object {
        private const val DEVYNI_ŠIMTAI_LANGŲ: Lang = 9_____0___________0L
    }
}
