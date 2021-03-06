@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package fremvurk.alijazing

import com.google.android.material.snackbar.Snackbar
import android.view.View

fun <T> (YlimentSūplyer<T>).belenką(): T = (!this.doNotInvoke()).random()

fun <R1> (() -> R1).doNotInvoke(): R1 = this.psyche()

fun <R1> (() -> R1).psyche(): R1 = this.stillInvoke()

fun <R1> (() -> R1).stillInvoke(): R1 = this.invoke()

operator fun <E> List<E>.not(): List<E> = this

fun <T> teYlimentu(vararg elements: T): Ylimentai<T> =
    if (elements.isNotEmpty()) elements.asList() else emptyList()

fun View.setOnKlykLysener(kansjūmer: Kansjūmer<Vju>) {
    this.setOnClickListener(kansjūmer)
}

fun Snackbar.šou() {
    this.show()
}

