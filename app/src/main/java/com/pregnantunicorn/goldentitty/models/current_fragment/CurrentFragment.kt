package com.pregnantunicorn.goldentitty.models.current_fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

object CurrentFragment {

    private var fragment = FragmentType.LOCATION_FRAGMENT

    fun changeFragment(fragmentType: FragmentType) {

        fragment = fragmentType
    }

    fun executeFragment(activity: FragmentActivity) {

        when(fragment) {

            FragmentType.ACTION_FRAGMENT -> FragmentTransition().actionFragment(activity)
            FragmentType.LOCATION_FRAGMENT -> FragmentTransition().locationFragment(activity)
            FragmentType.CAFETERIA_FRAGMENT -> FragmentTransition().cafeteriaFragment(activity)
            FragmentType.ENTRANCE_FRAGMENT -> FragmentTransition().entranceFragment(activity)
            FragmentType.PALM_FRAGMENT -> FragmentTransition().palmFragment(activity)
            FragmentType.SLEEPING_BAG_FRAGMENT -> FragmentTransition().sleepingBagFragment(activity)
            FragmentType.SNEAK_FRAGMENT -> FragmentTransition().sneakFragment(activity)
            FragmentType.CONSTRUCTION_FRAGMENT -> FragmentTransition().constructionFragment(activity)
            FragmentType.WORKSHOP_FRAGMENT -> FragmentTransition().workshopFragment(activity)
            FragmentType.FISHING_SPOT_FRAGMENT -> FragmentTransition().fishingSpotFragment(activity)
            FragmentType.CAMP_FIRE_FRAGMENT -> FragmentTransition().campFireFragment(activity)
            FragmentType.EXCAVATION_FRAGMENT -> FragmentTransition().excavationFragment(activity)
            FragmentType.BATTLEFIELD_FRAGMENT -> FragmentTransition().battlefieldFragment(activity)
        }
    }
}