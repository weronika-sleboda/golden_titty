package com.pregnantunicorn.merchantofgoldlakehorizon.models.books

object CurrentBookcase {

    private var books = BookcaseType.METEOR

    fun books(): Array<Book> {

        return when(books) {

            BookcaseType.METEOR -> MeteorsBooks.books
        }
    }

    fun bookName(): String {

        return when(books) {

            BookcaseType.METEOR -> MeteorsBooks.name
        }
    }

    fun changeBookCase(bookcaseType: BookcaseType) {

        books = bookcaseType
    }
}