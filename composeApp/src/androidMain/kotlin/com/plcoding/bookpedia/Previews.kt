package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.books
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    BookSearchBar(
        searchQuery = "Shit",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        onAction = {},
        state = BookListState(
            searchResults = books
        )
    )
}