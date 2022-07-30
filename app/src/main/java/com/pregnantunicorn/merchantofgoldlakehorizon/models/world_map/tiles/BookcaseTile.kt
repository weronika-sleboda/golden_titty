package com.pregnantunicorn.merchantofgoldlakehorizon.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.merchantofgoldlakehorizon.R
import com.pregnantunicorn.merchantofgoldlakehorizon.models.books.BookcaseType
import com.pregnantunicorn.merchantofgoldlakehorizon.models.books.CurrentBookcase
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.BackgroundFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.graphics.IconFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.views.fragments.BookcaseFragment

class BookcaseTile(
    private val bookcaseType: BookcaseType
) : Tile(true)
{
    override fun icon(): Int {

        return IconFactory().bookcase64()
    }

    override fun background() = BackgroundFactory().volcano()

    override fun onClick(activity: FragmentActivity) {

        CurrentBookcase.changeBookCase(bookcaseType)

        activity.supportFragmentManager.commit {

            replace<BookcaseFragment>(R.id.world_container)
        }
    }
}