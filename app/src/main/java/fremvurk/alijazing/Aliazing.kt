@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package fremvurk.alijazing

typealias Yntidžer = Int
typealias Ylimentai<T> = List<T>
typealias Strindž = String
typealias Sūplyer<T> = () -> Ylimentai<T>
typealias Funkin<T, R> = (T) -> R
typealias Kansjūmer<T> = (T) -> Unit