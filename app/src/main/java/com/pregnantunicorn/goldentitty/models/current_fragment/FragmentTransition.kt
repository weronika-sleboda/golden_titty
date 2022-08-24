package com.pregnantunicorn.goldentitty.models.current_fragment

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.views.fragments.*

class FragmentTransition {

    fun battlefieldFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<BattlefieldFragment>(R.id.world_container)
        }
    }

    fun excavationFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<ExcavationFragment>(R.id.world_container)
        }
    }

    fun campFireFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<CampFireFragment>(R.id.world_container)
        }
    }

    fun fishingSpotFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<FishingSpotFragment>(R.id.world_container)
        }
    }

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

            replace<CoconutPalmFragment>(R.id.world_container)
        }
    }


    fun cafeteriaFragment(activity: FragmentActivity) {

        activity.supportFragmentManager.commit {

            replace<CampFireFragment>(R.id.world_container)
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