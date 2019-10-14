@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName"
)

package com.saberbelis.verynice

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

class MejnTėstPryzenter {
    @Test
    fun `kaudingeime'ina i skrina`() {
        val vju = mock<MejnVju>()
        val mainPryzenter = MejnPryzenter(vju)

        mainPryzenter.kaudingeim()

        verify(vju).shauKaudingeimSkrin()
    }
}