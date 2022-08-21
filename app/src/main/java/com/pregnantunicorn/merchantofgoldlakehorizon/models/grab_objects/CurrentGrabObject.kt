package com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItemType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItems
import com.pregnantunicorn.merchantofgoldlakehorizon.models.player.Player

object CurrentGrabObject {

    private const val CAVE1 = 0

    private val grabObjects = arrayOf(

        GrabObject(
            "First Floor Key",
            R.drawable.mei64,
            "This is the key that opens the door to the first floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.FIRST_FLOOR).add()
        },

     )

    private var grabObjectType = GrabObjectType.FIRST_FLOOR

    fun grabObjectType() = grabObjectType

    fun grabObject(): GrabObject {

        return grabObjects[CAVE1]
    }

    fun changeGrabObject(grabObjectType: GrabObjectType) {

        this.grabObjectType = grabObjectType
    }
}