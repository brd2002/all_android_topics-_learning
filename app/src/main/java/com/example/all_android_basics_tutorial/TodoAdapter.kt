package com.example.all_android_basics_tutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    var  todos : List<Todo>
):RecyclerView.Adapter<TodoAdapter.TodoViewHolder> ()
{
    inner  class  TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo , parent , false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
            val TitleOfText = findViewById<TextView>(R.id.tvTitle)
            TitleOfText.text = todos[position].title
            val checkBoxFind = findViewById<CheckBox>(R.id.cvDone)
            checkBoxFind.isChecked= todos[position].isCheck
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}