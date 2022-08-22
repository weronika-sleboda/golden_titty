package com.pregnantunicorn.merchantofgoldlakehorizon.models.current_fragment

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.workshop.Workshop
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.*

class FragmentTransition {

    fun workshopFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<WorkshopFragment>(R.id.world_container)
        }
    }

    fun constructionFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<ConstructionFragment>(R.id.world_container)
        }
    }

    fun locationFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<LocationFragment>(R.id.world_container)
        }
    }

    fun sneakFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<AxeFragment>(R.id.world_container)
        }
    }

    fun actionFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<HammerFragment>(R.id.world_container)
        }
    }

    fun palmFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<PalmFragment>(R.id.world_container)
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