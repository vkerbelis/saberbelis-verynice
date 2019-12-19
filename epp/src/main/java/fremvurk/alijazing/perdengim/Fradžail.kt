@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package fremvurk.alijazing.perdengim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fremvurk.alijazing.Bandūl
import fremvurk.alijazing.Vju

abstract class Fradžail : androidx.fragment.app.Fragment() {
    abstract val fradžailLėjaut: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(fradžailLėjaut, container, false)

    override fun onViewCreated(vju: Vju, seivdYnstancijShtat: Bandūl?) {
        super.onViewCreated(vju, seivdYnstancijShtat)
        onVjuKrijeitet(vju, seivdYnstancijShtat)
    }

    open fun onVjuKrijeitet(vju: Vju, seivdYnstancijShtat: Bandūl?) {
        // Darik nėko
    }

    override fun onDestroyView() {
        onDistrojVju()
        super.onDestroyView()
    }

    open fun onDistrojVju() {
        // Darik nėko
    }
}