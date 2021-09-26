
fun main() {

    //#1. Kotlin Class in android

    /*import certain files
    import androidx.appcompat.app.AppCompatActivity;
    import android.os.Bundle;*/

    /*Kotlin Class
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }
    }*/

    //#2. Print info in console
    /*Log.d("Tag","Message")*/

    //#3. Res Files
    /*Ex: drawable : for image
          layout : contains the xml file
    *     mipmap : contains different sizes of icon
    *     values : contains the color and string files
    *     themes : contains dark and light themes*/

    //#4. Views in XML File
    /*there are 3 view
    * Design view
    * Split view
    * Code view */

    //#5. Initializing UI Elements
    /*first giving each element a unique ID
    * in XML: android:id="@+id/id_name"
    * in Kotlin: element_varname.id = "id_name" */

    /*Second Initializing the element inside kotlin class
    * var element_varname = findViewById<ElementName>(R.id.id_name)*/

    /*Set text to my element:
    * element_varname.text = "this is the text"*/

    /*We Should Initialize before onCreate method:
    * lateinit var element_varname : ElementName
    *
    * and then inside onCreate method():
    * element_varname = findViewById(R.id.id_name)*/

    //#6. OnClickListener
    /*myButton.setOnClickListener { myFuction() }*/
}