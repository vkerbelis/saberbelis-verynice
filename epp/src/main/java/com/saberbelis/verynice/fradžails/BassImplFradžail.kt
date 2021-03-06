@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice.fradžails

import android.annotation.SuppressLint
import com.saberbelis.verynice.R
import fremvurk.alijazing.Bandūl
import fremvurk.alijazing.Vju
import fremvurk.alijazing.perdengim.Fradžail
import kotlinx.android.synthetic.main.fradzhail_az.*

@SuppressLint("ValidFragment")
class BassImplFradžail constructor(private val tytel: String) : Fradžail() {
    override val fradžailLėjaut: Int
        get() = R.layout.fradzhail_bass

    override fun onVjuKrijeitet(vju: Vju, seivdYnstancijShtat: Bandūl?) {
        skrynTytel.text = tytel
    }
}
