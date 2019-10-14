@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package fremvurk.alijazing.perdengim

import android.view.ViewGroup
import com.saberbelis.verynice.R
import com.saberbelis.verynice.fradžails.Fradžail
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

    fun setSappartAkšionBar(toolbar: Tulbar?) {
        super.setSupportActionBar(toolbar)
    }
}

operator fun Aktivus.plusAssign(fradžail: Fradžail) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.fradkxsilDėž, fradžail)
    transaction.commitAllowingStateLoss()
}

fun main() = print(0..readLine()!!.toInt().let { it * it })