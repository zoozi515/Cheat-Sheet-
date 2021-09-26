fun main() {
    //#1. Snackbar
    /*var my_layout = findViewById<ConstraintLayout>(R.id.clMain)
        Snackbar.make(my_layout,"Hello there :)",Snackbar.LENGTH_LONG).show()*/


    //#2. Recycler View
    /*Inside Main Class
    * val my_rv = findViewById<RecyclerView>(R.id.rvMain)
        my_rv.adapter = RecyclerViewAdapter(colors)
        my_rv.layoutManager = LinearLayoutManager(this)*/

    /*Inside Recycler View Adapter
    * extends RecyclerView adapter and holder
    * then, implements all three methods which are,
    * onCreateViewHolder, onBindViewHolder, and getItemCount*/


    //#3. Alert Dialogs
    /*var messages = arrayListOf<String>()
    *     alertButton.setOnClickListener {
	Log.d("MAIN", messages.toString())
	customAlert()
    }
    *     private fun customAlert(){
        // first we create a variable to hold an AlertDialog builder
        val dialogBuilder = AlertDialog.Builder(this)
        // then we set up the input
        val input = EditText(this)
        // here we set the message of our alert dialog
        dialogBuilder.setMessage("Enter your message:")
            // positive button text and action
            .setPositiveButton("Submit", DialogInterface.OnClickListener {
                    dialog, id -> messages.add(input.text.toString())
            })
            // negative button text and action
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("New Message")
        // add the Edit Text
        alert.setView(input)
        // show alert dialog
        alert.show()
    }    */


    //#4. Basic Control Flow (Recreate Activity)
    /* this.recreate()*/


    //#5. Instance States
    /* Saving state
    *     override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("myNumber", someNumber)
        outState.putStringArrayList("myMessage", myMessage)
    }        */
    /* Saving state
    *     override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        someNumber= savedInstanceState.getInt("myNumber", 0)
        myMessage = savedInstanceState.getString("myMessage", "No Message")
    }        */

    //#6. Shared Preferences
    /* private lateinit var sharedPreferences: SharedPreferences
    * <string name="preference_file_key">com.example.helloworld.PREFERENCE_FILE_KEY</string>
    * sharedPreferences = this.getSharedPreferences(
	getString(R.string.preference_file_key), Context.MODE_PRIVATE)
    myMessage = sharedPreferences.getString("myMessage", "").toString()  // --> retrieves data from Shared Preferences
    // We can save data with the following code
    with(sharedPreferences.edit()) {
        putString("myMessage", myMessage)
    apply()
}
*/
}