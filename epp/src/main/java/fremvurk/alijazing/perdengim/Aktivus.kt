@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package fremvurk.alijazing.perdengim

import android.view.ViewGroup
import com.saberbelis.verynice.R
import fremvurk.alijazing.*

abstract class Aktivus : EpKampotAktivus() {
    override fun onCreate(seivdYnstansSteit: Bandūl?) {
        super.onCreate(seivdYnstansSteit)
        onKrijeit(seivdYnstansSteit)
    }

    open fun onKrijeit(seivdYnstansSteit: Bandūl?) {
        // Darik nėko
    }

    fun setKontentVju(leyautRėsAiDy: Yntidžer) {
        super.setContentView(leyautRėsAiDy)
    }

    fun setKontentVju(vju: Vju?) {
        super.setContentView(vju)
    }

    fun setKontentVju(vju: Vju?, paŕřams: ViewGroup.LayoutParams?) {
        super.setContentView(vju, paŕřams)
    }

    fun setSappartAkšionBar(tulbar: Tulbar?) {
        super.setSupportActionBar(tulbar)
    }
}

operator fun Aktivus.plusAssign(fradžail: Fradžail) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.fradkxsilDėž, fradžail)
    transaction.commitAllowingStateLoss()
}

fun main() = print(0..readLine()!!.toInt().let { it * it }) // Mandatory