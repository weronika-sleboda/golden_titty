package com.pregnantunicorn.merchantofgoldlakehorizon.models.robes

import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.merchant.Merchant

object RobeCloset {

    const val WHITE_ROBE = 0
    const val BLACK_ROBE = 1
    const val GOLDEN_ROBE = 2
    const val SILVER_ROBE = 3
    const val RED_ROBE = 4
    const val GREEN_ROBE = 5
    const val BLUE_ROBE = 6
    const val BROWN_ROBE = 7
    const val PURPLE_ROBE = 8
    const val PINK_ROBE = 9

    val robes = arrayOf(

        Robe(
            "White Robe",
            "",
            R.drawable.white_robe64,
            RobeType.WHITE,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_white_robe)
            },
            true
        ),

        Robe(
            "Black Robe",
            "",
            R.drawable.black_robe64,
            RobeType.BLACK,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_black_robe)
            },
        ),

        Robe(
            "Golden Robe",
            "",
            R.drawable.golden_robe64,
            RobeType.GOLDEN,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_golden_robe)
            },
        ),

        Robe(
            "Silver Robe",
            "",
            R.drawable.silver_robe64,
            RobeType.SILVER,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_silver_robe)
            }
        ),


        Robe(
            "Red Robe",
            "",
            R.drawable.red_robe64,
            RobeType.RED,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_red_robe)
            }
        ),

        Robe(
            "Green Robe",
            "",
            R.drawable.green_robe64,
            RobeType.GREEN,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_green_robe)
            },
        ),

        Robe(
            "Blue Robe",
            "",
            R.drawable.blue_robe64,
            RobeType.BLUE,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_blue_robe)
            },
        ),

        Robe(
            "Brown Robe",
            "",
            R.drawable.brown_robe64,
            RobeType.BROWN,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_brown_robe)
            }
        ),

        Robe(
            "Purple Robe",
            "",
            R.drawable.purple_robe64,
            RobeType.PURPLE,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_purple_robe)
            }
        ),

        Robe(
            "Pink Robe",
            "",
            R.drawable.pink_robe64,
            RobeType.PINK,
            {
                Merchant.appearance().changeAppearance(R.drawable.meteor64_pink_robe)
            }
        )

    )
}