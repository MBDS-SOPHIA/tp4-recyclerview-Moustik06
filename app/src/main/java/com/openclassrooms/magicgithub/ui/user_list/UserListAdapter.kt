package com.openclassrooms.magicgithub.ui.user_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User
import com.openclassrooms.magicgithub.utils.ItemTouchHelperAdapter
import com.openclassrooms.magicgithub.utils.UserDiffCallback
import java.util.Collections

class UserListAdapter(  // FOR CALLBACK ---
    private val callback: Listener
) : RecyclerView.Adapter<ListUserViewHolder>(),ItemTouchHelperAdapter {
    // FOR DATA ---
    private var users: List<User> = ArrayList()

    interface Listener {
        fun onClickDelete(user: User)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListUserViewHolder {
        val binding = ItemListUserBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ListUserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListUserViewHolder, position: Int) {
        holder.bind(users[position], callback)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    // PUBLIC API ---
    fun updateList(newList: List<User>) {
        val diffResult = DiffUtil.calculateDiff(UserDiffCallback(newList, users))
        users = newList
        diffResult.dispatchUpdatesTo(this)
    }
    override fun onItemMove(fromPosition: Int, toPosition: Int): Boolean {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(users, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(users, i, i - 1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
        return true
    }

    override fun onItemSwiped(position: Int) {
        users[position].isActive = !users[position].isActive
        notifyItemChanged(position)
    }

}