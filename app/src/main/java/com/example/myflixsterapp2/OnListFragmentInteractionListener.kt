package com.example.myflixsterapp2

/**
 * This interface is used by the [PersonRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [PersonFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: Person)
}
