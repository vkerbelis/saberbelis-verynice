@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.fradžails

import com.saberbelis.verynice.R
import fremvurk.alijazing.Bandūl
import fremvurk.alijazing.Vju
import fremvurk.alijazing.perdengim.Fradžail
import kotlinx.android.synthetic.main.fradzhail_az.*

class AzTanksFradžail : Fradžail() {
    override val fradžailLėjaut: Int
        get() = R.layout.fradzhail_az

    override fun onVjuKrijeitet(view: Vju, savedInstanceState: Bandūl?) {
        skrynTytel.text = this::class.java.simpleName
    }
}
