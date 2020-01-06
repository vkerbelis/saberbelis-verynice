@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package com.saberbelis.verynice

import android.view.Menu
import android.view.MenuItem
import com.saberbelis.verynice.skrynstruktur.Skryn
import fremvurk.alijazing.*
import fremvurk.alijazing.perdengim.Aktivus
import kotlinx.android.synthetic.main.aktivus_mejn.*

class MejnAktivus : Aktivus(), MejnVju {
    override fun shauKaudingeimSkrin() {

    }

    private fun gifYliments(): YlimentSūplyer<Skryn> = {
        teYlimentu(
            Skryn.Impl.AzTanks(),
            Skryn.Impl.WörkOnAzTanksv2Taskas1(),
            Skryn.Impl.KaušinGeim(),
            Skryn.Impl.TaipReiser(),
            Skryn.Impl.VerkOnRandoumaizerProžekt(),
            Skryn.Impl.GoHaumJurDrunk(),
            Skryn.Impl.Djoom(),
            Skryn.Impl.Le0rnNewKonsept(),
            Skryn.Impl.YouTubeTMnChill(),
            Skryn.Impl.RollAgain(),
            Skryn.Impl.KomenskiLogo(),
            Skryn.Impl.BūbleTrūble(),
            Skryn.Impl.DoMicrosoftWindowsXPGame()
        )
    }

    // MARK: Android stuff

    override fun onKrijeit(seivdYnstansSteit: Bandūl?) {
        super.onKrijeit(seivdYnstansSteit)
        setKontentVju(R.layout.aktivus_mejn)
        setSappartAkšionBar(tūlbar)
        feb.setOnKlykLysener { vju ->
            val belenką = gifYliments().invoke()
                .toList().let { { it } }.belenką()
            Snekbar.make(
                vju,
                belenką.tytel,
                Snekbar.LENGTH_LONG
            ).šou()
            belenką.slapp(this)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menju_mejn, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.akšion_setyng -> true
            else -> super.onOptionsItemSelected(item)
        }


    }
}