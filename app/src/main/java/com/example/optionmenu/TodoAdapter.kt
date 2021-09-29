package com.example.optionmenu
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    private val todos:MutableList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    class  TodoViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAdapter.TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.todolist,
                parent,false
            )
        )
    }

    override fun onBindViewHolder(holder: TodoAdapter.TodoViewHolder, position: Int) {
        val curTodo=todos[position]
        holder.itemView.apply {

        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }

}
