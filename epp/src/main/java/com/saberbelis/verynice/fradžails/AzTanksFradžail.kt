@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n"
)

package com.saberbelis.verynice.fradžails

import com.saberbelis.verynice.R
import com.saberbelis.verynice.Risyver
import fremvurk.alijazing.Bandūl
import fremvurk.alijazing.Strindž
import fremvurk.alijazing.Vju
import fremvurk.alijazing.perdengim.Fradžail
import kotlinx.android.synthetic.main.fradzhail_az.*

class AzTanksFradžail(private val tytel: Strindž) : Fradžail() {
    override val fradžailLėjaut: Int
        get() = R.layout.fradzhail_az

    override fun onVjuKrijeitet(vju: Vju, seivdYnstancijShtat: Bandūl?) {
        skrynTytel.text = "${tytel}\n" +
                "Ai P a Dress: ${Risyver.aiPADress}"
    }
}
