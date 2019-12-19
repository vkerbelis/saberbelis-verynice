@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package fremvurk.alijazing

typealias Jūnit = Unit
typealias Yntidžer = Int
typealias Lang = Long
typealias Būlyan = Boolean
typealias Ylimentai<T> = List<T>
typealias Strindž = String
typealias YlimentSūplyer<T> = Sūplyer<Ylimentai<T>>
typealias Sūplyer<T> = () -> T
typealias Funkin<T, R> = (T) -> R
typealias Kansjūmer<T> = (T) -> Jūnit