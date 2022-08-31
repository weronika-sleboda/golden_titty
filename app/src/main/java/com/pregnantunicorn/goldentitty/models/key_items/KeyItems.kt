package com.pregnantunicorn.goldentitty.models.key_items

import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory

object KeyItems {

    private const val SHAMANIC_NECKLACE = 0
    private const val CRYSTAL_OF_VISION = 1
    private const val STAFF_OF_ECLIPSE = 2
    private const val TEMPLE_KEY = 3
    private const val FIRST_FLOOR_KEY = 4
    private const val SECOND_FLOOR_KEY = 5
    private const val THIRD_FLOOR_KEY = 6
    private const val EMERALD = 7
    private const val RUBY = 8
    private const val SAPPHIRE = 9

    private var keyItems = arrayOf(

        KeyItem(
            R.drawable.shamanic_necklace64,
            "Shamanic Necklace",
            KeyItemType.SHAMANIC_NECKLACE
        ),

        KeyItem(
            R.drawable.crystal_of_vision,
            "Crystal Of Vision",
            KeyItemType.CRYSTAL_OF_VISION
        ),

        KeyItem(
            R.drawable.staff_of_eclipse,
            "Staff Of Eclipse",
            KeyItemType.STAFF_OF_ECLIPSE
        ),

        KeyItem(
            R.drawable.main_entrance_key,
            "Temple Key",
            KeyItemType.TEMPLE_KEY
        ),

        KeyItem(
            R.drawable.first_floor_key,
            "First Floor Key",
            KeyItemType.FIRST_FLOOR_KEY
        ),

        KeyItem(
            R.drawable.second_floor_key,
            "Second Floor Key",
            KeyItemType.SECOND_FLOOR_KEY
        ),

        KeyItem(
            R.drawable.third_floor_key,
            "Third Floor Key",
            KeyItemType.THIRD_FLOOR_KEY
        ),

        KeyItem(
            R.drawable.emerald64,
            "Emerald",
            KeyItemType.EMERALD
        ),

        KeyItem(
            R.drawable.ruby64,
            "Ruby",
            KeyItemType.RUBY
        ),

        KeyItem(
            R.drawable.sapphire64,
            "Sapphire",
            KeyItemType.SAPPHIRE
        ),
    )

    fun keyItems() = keyItems

    fun getKeyItem(keyItemType: KeyItemType): KeyItem {

        return when(keyItemType) {

            KeyItemType.SHAMANIC_NECKLACE -> keyItems[SHAMANIC_NECKLACE]
            KeyItemType.CRYSTAL_OF_VISION -> keyItems[CRYSTAL_OF_VISION]
            KeyItemType.TEMPLE_KEY -> keyItems[TEMPLE_KEY]
            KeyItemType.EMERALD -> keyItems[EMERALD]
            KeyItemType.SAPPHIRE -> keyItems[SAPPHIRE]
            KeyItemType.RUBY-> keyItems[RUBY]
            KeyItemType.FIRST_FLOOR_KEY -> keyItems[FIRST_FLOOR_KEY]
            KeyItemType.SECOND_FLOOR_KEY -> keyItems[SECOND_FLOOR_KEY]
            KeyItemType.THIRD_FLOOR_KEY -> keyItems[THIRD_FLOOR_KEY]
            KeyItemType.STAFF_OF_ECLIPSE -> keyItems[STAFF_OF_ECLIPSE]
        }
    }

    fun keyItemsOwns(): BooleanArray {

        val keyItemsOwns = BooleanArray(keyItems.size)

        for(index in keyItems.indices) {

            keyItemsOwns[index] = keyItems[index].owns()
        }

        return  keyItemsOwns
    }

    fun load(keyItemsOwns: BooleanArray) {

        for(index in keyItems.indices) {

            keyItems[index].load(keyItemsOwns[index])
        }
    }

    fun reset() {

        for(keyItem in keyItems) {

            keyItem.reset()
        }
    }
}