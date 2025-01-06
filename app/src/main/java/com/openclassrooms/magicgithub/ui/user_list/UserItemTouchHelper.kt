package com.openclassrooms.magicgithub.ui.user_list

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.Callback.makeMovementFlags
import androidx.recyclerview.widget.RecyclerView
import com.openclassrooms.magicgithub.utils.ItemTouchHelperAdapter

class UserItemTouchHelper(private val adapter: ItemTouchHelperAdapter) :
    ItemTouchHelper.Callback() {

    override fun getMovementFlags(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder
    ): Int {
        val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
        val swipeFlags = ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        return makeMovementFlags(dragFlags, swipeFlags)
    }

    override fun onMove(
        recyclerView: RecyclerView,
        source: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return adapter.onItemMove(
            source.adapterPosition,
            target.adapterPosition
        )
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        adapter.onItemSwiped(viewHolder.adapterPosition)
    }
}