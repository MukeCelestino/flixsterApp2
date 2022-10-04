package com.example.myflixsterapp2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myflixsterapp2.R.id
import androidx.recyclerview.widget.RecyclerView.ViewHolder

const val PERSON_EXTRA = "PERSON_EXTRA"
private const val TAG = "PersonRecyclerViewAdapter"

class PersonRecyclerViewAdapter(
    private val context: List<Person>,
    private val people: PersonFragment,
    private val mListener: OnListFragmentInteractionListener?
)
    : RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_person, parent, false)
        return PersonViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = people[position]

        holder.mItem = person
        holder.personName.text = person.name

        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500" + person.profilePath)
            .centerInside()
            .into(holder.personImage)




        holder.mView.setOnClickListener {
            holder.mItem?.let { person ->
                mListener?.onItemClick(Person())
            }
        }
        override fun onClick(v: View?) {
            // TODO: Get selected person
            // Get selected article
            val person = people[position]

            // TODO: Navigate to Details screen and pass selected article
            //  Navigate to Details screen and pass selected article
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(PERSON_EXTRA, person)
            context.startActivity(intent)
        }
    }

    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return people.size
    }
    inner class PersonViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: Person? = null

        val personImage: ImageView = mView.findViewById<View>(id.person_image) as ImageView
        val personName: TextView = mView.findViewById<View>(id.person_name) as TextView

        override fun toString(): String {
            return personName.toString()
        }
        // TODO: Write a helper method to help set up the onBindViewHolder method
        fun bind(person: Person) {
            personName.text = person.name

            Glide.with(context)
                .load(person.profilePath)
                .into(personImage)
        }
    }


    }

}