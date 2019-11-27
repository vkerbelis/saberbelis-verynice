@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package fremvurk.alijazing.perdengim

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fremvurk.alijazing.Bandūl
import fremvurk.alijazing.Vju

abstract class Fradžail : Fragment() {
    abstract val fradžailLėjaut: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(fradžailLėjaut, container, false)

    override fun onViewCreated(view: Vju, savedInstanceState: Bandūl?) {
        super.onViewCreated(view, savedInstanceState)
        onVjuKrijeitet(view, savedInstanceState)
    }

    open fun onVjuKrijeitet(view: Vju, savedInstanceState: Bandūl?) {
        // Darik nieko
    }
}