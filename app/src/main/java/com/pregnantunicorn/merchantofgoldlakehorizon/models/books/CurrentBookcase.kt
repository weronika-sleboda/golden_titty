package com.pregnantunicorn.merchantofgoldlakehorizon.models.books

object CurrentBookcase {

    private var books = BookcaseType.METEOR

    fun books(): Array<Book> {

        return when(books) {

            BookcaseType.METEOR -> MeteorsBooks.books
            BookcaseType.HISTORY -> HistoryBooks.books
            BookcaseType.FOREIGN -> ForeignBooks.books
            BookcaseType.RELIGION -> ReligionBooks.books
            BookcaseType.TECHNOLOGY -> TechnologyBooks.books
        }
    }

    fun bookName(): String {

        return when(books) {

            BookcaseType.METEOR -> MeteorsBooks.name
            BookcaseType.HISTORY -> HistoryBooks.name
            BookcaseType.FOREIGN -> ForeignBooks.name
            BookcaseType.RELIGION -> ReligionBooks.name
            BookcaseType.TECHNOLOGY -> TechnologyBooks.name
        }
    }

    fun changeBookCase(bookcaseType: BookcaseType) {

        books = bookcaseType
    }
}