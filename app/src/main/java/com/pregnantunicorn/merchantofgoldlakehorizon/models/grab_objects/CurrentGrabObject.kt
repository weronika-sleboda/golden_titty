package com.pregnantunicorn.merchantofgoldlakehorizon.models.grab_objects

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItemType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items.KeyItems

object CurrentGrabObject {

    private const val FIRST_FLOOR = 0
    private const val SECOND_FLOOR = 1
    private const val THIRD_FLOOR = 2
    private const val FOURTH_FLOOR = 3
    private const val FIFTH_FLOOR = 4
    private const val SIXTH_FLOOR = 5
    private const val SEVENTH_FLOOR = 6

    private val grabObjects = arrayOf(

        GrabObject(
            "T.O.L.D.V.R key (First Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the first floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.FIRST_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Second Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the second floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.SECOND_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Third Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the third floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.THIRD_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Fourth Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the fourth floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.FOURTH_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Fifth Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the fifth floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.FIFTH_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Sixth Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the sixth floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.SIXTH_FLOOR).add()
        },

        GrabObject(
            "T.O.L.D.V.R key (Seventh Floor)",
            R.drawable.key128,
            "This is the key that opens the door to the seventh floor of the Temple of the Latter Day Vagina Rapture."
        )
        {
            KeyItems.getKeyItem(KeyItemType.SEVENTH_FLOOR).add()
        }
    )

    private var grabObjectType = GrabObjectType.FIRST_FLOOR

    fun grabObjectType() = grabObjectType

    fun grabObject(): GrabObject {

        return when(grabObjectType) {

            GrabObjectType.FIRST_FLOOR -> grabObjects[FIRST_FLOOR]
            GrabObjectType.SECOND_FLOOR -> grabObjects[SECOND_FLOOR]
            GrabObjectType.THIRD_FLOOR -> grabObjects[THIRD_FLOOR]
            GrabObjectType.FOURTH_FLOOR -> grabObjects[FOURTH_FLOOR]
            GrabObjectType.FIFTH_FLOOR -> grabObjects[FIFTH_FLOOR]
            GrabObjectType.SIXTH_FLOOR -> grabObjects[SIXTH_FLOOR]
            GrabObjectType.SEVENTH_FLOOR -> grabObjects[SEVENTH_FLOOR]
        }
    }

    fun changeGrabObject(grabObjectType: GrabObjectType) {

        this.grabObjectType = grabObjectType
    }
}