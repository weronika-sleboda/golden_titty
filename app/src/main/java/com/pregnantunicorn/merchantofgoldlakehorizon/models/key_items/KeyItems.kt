package com.pregnantunicorn.merchantofgoldlakehorizon.models.key_items

import com.pregnantunicorn.merchantofgoldlakehorizon.R

object KeyItems {

    private const val REVIVAL_STONE = 0
    private const val YARN_BALL = 1
    private const val SAINT_FLUFFY_RELIC = 2
    private const val STAFF_OF_CATFIGHT = 3
    private const val HOLY_TOILET_SCROLL = 4
    private const val SINNER_STONING_STONE = 5
    private const val ENGAGEMENT_RINGS = 6

    private var keyItems = arrayOf(

        KeyItem(
            "Revival Stone",
            R.drawable.revival_stone64,
            KeyItemType.REVIVAL_STONE
        ),

        KeyItem(
            "Yarn Ball",
            R.drawable.yarn_ball64,
            KeyItemType.YARN_BALL
        ),

        KeyItem(
            "Saint Fluffy Relic",
            R.drawable.saint_fluffy_relic64,
            KeyItemType.SAINT_FLUFFY_RELIC
        ),

        KeyItem(
            "Staff Of Catfight",
            R.drawable.fake_titty_damnation_staff64,
            KeyItemType.STAFF_OF_CATFIGHT
        ),

        KeyItem(
            "Holy Toilet Scroll",
            R.drawable.holy_toilet_paper_scroll64,
            KeyItemType.HOLY_TOILET_SCROLL
        ),

        KeyItem(
            "Inquisitor Stone",
            R.drawable.sinner_stoning_stone64,
            KeyItemType.INQUISITOR_STONE
        ),

        KeyItem(
            "Engagement Rings",
            R.drawable.engagement_rings64,
            KeyItemType.ENGAGEMENT_RINGS
        ),
    )

    fun keyItems() = keyItems

    fun getKeyItem(keyItemType: KeyItemType): KeyItem {

        return when(keyItemType) {

            KeyItemType.REVIVAL_STONE -> keyItems[REVIVAL_STONE]
            KeyItemType.YARN_BALL -> keyItems[YARN_BALL]
            KeyItemType.ENGAGEMENT_RINGS -> keyItems[ENGAGEMENT_RINGS]
            KeyItemType.STAFF_OF_CATFIGHT-> keyItems[STAFF_OF_CATFIGHT]
            KeyItemType.HOLY_TOILET_SCROLL -> keyItems[HOLY_TOILET_SCROLL]
            KeyItemType.SAINT_FLUFFY_RELIC -> keyItems[SAINT_FLUFFY_RELIC]
            KeyItemType.INQUISITOR_STONE -> keyItems[SINNER_STONING_STONE]
        }
    }
}