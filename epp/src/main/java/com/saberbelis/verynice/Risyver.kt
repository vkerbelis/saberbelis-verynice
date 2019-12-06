@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice

import fremvurk.alijazing.BrodKestRisyver
import fremvurk.alijazing.Kantėxt
import fremvurk.alijazing.Yntėnt

class Risyver : BrodKestRisyver() {
    override fun onReceive(kantėxt: Kantėxt, yntėnt: Yntėnt) {
        aiPADress = yntėnt.getStringExtra("com.saberbelis.verynice.AI_P_A_DRESS")
    }

    companion object {
        var aiPADress: String? = ""
    }
}