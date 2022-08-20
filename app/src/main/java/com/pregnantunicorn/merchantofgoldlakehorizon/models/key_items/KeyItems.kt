package com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items

object KeyItems {

    private const val FIRST_FLOOR_KEY = 0
    private const val SECOND_FLOOR_KEY = 1
    private const val THIRD_FLOOR_KEY = 2
    private const val FOURTH_FLOOR_KEY = 3
    private const val FIFTH_FLOOR_KEY = 4
    private const val SIXTH_FLOOR_KEY = 5
    private const val FIFTH_SEVENTH_FLOOR_KEY = 6

    private var keyItems = arrayOf(

        KeyItem(
            "First Floor Key",
            KeyItemType.FIRST_FLOOR
        ),

        KeyItem(
            "Second Floor Key",
            KeyItemType.SECOND_FLOOR
        ),

        KeyItem(
            "Third Floor Key",
            KeyItemType.THIRD_FLOOR
        ),

        KeyItem(
            "Fourth Floor Key",
            KeyItemType.FOURTH_FLOOR
        ),

        KeyItem(
            "Fifth Floor Key",
            KeyItemType.FIFTH_FLOOR
        ),

        KeyItem(
            "Sixth Floor Key",
            KeyItemType.SIXTH_FLOOR
        ),

        KeyItem(
            "Seventh Floor Key",
            KeyItemType.SEVENTH_FLOOR
        ),
    )

    fun keyItems() = keyItems

    fun getKeyItem(keyItemType: KeyItemType): KeyItem {

        return when(keyItemType) {

            KeyItemType.FIRST_FLOOR -> keyItems[FIRST_FLOOR_KEY]
            KeyItemType.SECOND_FLOOR -> keyItems[SECOND_FLOOR_KEY]
            KeyItemType.THIRD_FLOOR -> keyItems[THIRD_FLOOR_KEY]
            KeyItemType.FOURTH_FLOOR -> keyItems[FOURTH_FLOOR_KEY]
            KeyItemType.FIFTH_FLOOR -> keyItems[FIFTH_FLOOR_KEY]
            KeyItemType.SIXTH_FLOOR -> keyItems[SIXTH_FLOOR_KEY]
            KeyItemType.SEVENTH_FLOOR-> keyItems[FIFTH_SEVENTH_FLOOR_KEY]
        }
    }
}