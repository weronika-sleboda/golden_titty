package com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class FragmentTransition {

    fun templeFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<TempleFragment>(R.id.world_container)
        }
    }


    fun locationFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    fun sneakFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<SneakFragment>(R.id.world_container)
        }
    }

    fun actionFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<ActionFragment>(R.id.world_container)
        }
    }

    fun pearlTittyFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<MonkFragment>(R.id.world_container)
        }
    }

    fun palmFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<PalmFragment>(R.id.world_container)
        }
    }

    fun carriageFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<CarriageFragment>(R.id.world_container)
        }
    }

    fun boomerangShopFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<BoomerangShopFragment>(R.id.world_container)
        }
    }

    fun cafeteriaFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<CafeteriaFragment>(R.id.world_container)
        }
    }

    fun universityFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<UniversityFragment>(R.id.world_container)
        }
    }

    fun sleepingBagFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<SleepingBagFragment>(R.id.world_container)
        }
    }

    fun entranceFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<EntranceFragment>(R.id.world_container)
        }
    }
}