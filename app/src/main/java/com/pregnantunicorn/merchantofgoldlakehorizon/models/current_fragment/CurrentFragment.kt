package com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

object CurrentFragment {

    private var fragment = FragmentType.LOCATION_FRAGMENT

    fun changeFragment(fragmentType: FragmentType) {

        fragment = fragmentType
    }

    fun executeFragment(activity: FragmentActivity) {

        when(fragment) {

            FragmentType.CARRIAGE_FRAGMENT -> FragmentTransition().carriageFragment(activity)
            FragmentType.ACTION_FRAGMENT -> FragmentTransition().actionFragment(activity)
            FragmentType.LOCATION_FRAGMENT -> FragmentTransition().locationFragment(activity)
            FragmentType.BOOMERANG_SHOP_FRAGMENT -> FragmentTransition().boomerangShopFragment(activity)
            FragmentType.CAFETERIA_FRAGMENT -> FragmentTransition().cafeteriaFragment(activity)
            FragmentType.ENTRANCE_FRAGMENT -> FragmentTransition().entranceFragment(activity)
            FragmentType.PALM_FRAGMENT -> FragmentTransition().palmFragment(activity)
            FragmentType.PEARL_TITTY_FRAGMENT -> FragmentTransition().pearlTittyFragment(activity)
            FragmentType.SLEEPING_BAG_FRAGMENT -> FragmentTransition().sleepingBagFragment(activity)
            FragmentType.SNEAK_FRAGMENT -> FragmentTransition().sneakFragment(activity)
            FragmentType.UNIVERSITY_FRAGMENT -> FragmentTransition().universityFragment(activity)
            FragmentType.TEMPLE_FRAGMENT -> FragmentTransition().templeFragment(activity)
        }
    }
}