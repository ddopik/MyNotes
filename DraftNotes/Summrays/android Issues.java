
Needs Answer??????
==================
Needs Answer??????
=================
Needs Answer??????
===================


---does changing method return type againest polymerphism->overloading --->true

---setListAdapter(adapter); does it called once and "View getView"--->base_adapter class>>>>>called every scrool

---when i useing GetActivity() in fragment i can accesse elements in the main_activity that should br wrong???

---Review inner class

---What meant by curor;

---{
	those error  when try to get view in MainActivity.java from main_activity.xml
     but works fine in child fragments.
	TextView tt=(TextView) context.findViewById(R.id.print);   /////error
	TextView tt=(TextView) getBaseContext().findViewById(R.id.print);   /////error
	TextView tt=(TextView) getActivity().findViewById(R.id.print);   /////error
	TextView tt=(TextView) getBaseActivity().findViewById(R.id.print);   /////error	

	thats what is works
	TextView tt=(TextView) ('blank' or this.)findViewById(R.id.print);   /////true 

	and why it works in ---> Toast.makeText('''''getBaseContext()''''',"fragment Refreasshed", Toast.LENGTH_LONG).show();
	                    --->note also works with this
	}

--- why i can not call any Class varaible inside onActivityCreated(); of fragment class. 

---.size() vs .length() --->some times .length()  not works ___Why?????

---yourActivity.this vs class.Class Vs getActivity()   Vs  getBaseActivity() Vs context

---Understand those parameter--->Public View getView(int position, View convertView, ViewGroup parent)


---Intent myIntent = new Intent(Fragment_main.this.getActivity(),SingleMoview.class);

--Fragment_main.this.getActivity()--->why Fragment_main must be prefix why not just (This) work

{
--SingleMoview.class---->what this conncept calls
for your code in MainActivity, MainActivity.this will return an Activity object for the instance of MainActivity you are in. 
Activity extends Context so this is often used to obtain or pass around a Context –
}

---SharedPreferences sharedPrefs = context.getSharedPreferences("setting",context.MODE_PRIVATE);
-->i want parameter setting  work i have set it as sharedpreferance file 

2--> I want to update my activity when SharedPreferences updateds
{


				Fragment frg = null;
				frg = getFragmentManager().findFragmentById(R.id.fragment1);
				final FragmentTransaction ft = getFragmentManager().beginTransaction();
				ft.detach(frg);
				ft.attach(frg);
				ft.commit(); ///wht this not  ///--->check your frg it is probably Null
				////@------2
				Fragment_main fg=new Fragment_main();
				FragmentTransaction tr = getFragmentManager().beginTransaction();
				tr.replace(R.id.fragment1, fg);
				tr.commit();
				Toast.makeText(getBaseContext(),"Data updated", Toast.LENGTH_LONG).show();  //why this work  

}


---why we needs onstart when she wanted to restart fragment in tutorials

 Singleton--->
 Singleton instance --->
 Singleton class--->

--->What is content_resolver  is that away to query data from database using URL --->(http://stackoverflow.com/questions/11131058/how-to-properly-insert-values-into-the-sqlite-database-using-contentproviders-i).

 ---->getSupportFragmentManager() vs getFragmentManager() ??????	

Under Stand ViewHolderPattern
 --->A ViewHolder object stores each of the component views inside the tag field of the Layout,
      so you can immediately access them without the need to look them up repeatedly.
     First, you need to create a Class to hold your exact set of views. For example:



----->retuen context.getString(R.string,format,"100");
     ///Return a localized formatted string from the application's package's default string table, substituting the format arguments as defined in Formatter and format(String, Object...).


--->when my App first launch i call :

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            Fragment_main fg = getFrgInstance();
            ft.replace(R.id.ContainerActivityID,fg,"fragment_activity");
            ft.commit();  --->this code in onCreate of MainActivity


            now when i press Refreash button :

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment_main fg = getFrgInstance(); ///return my fragment
                ft.replace(R.id.ContainerActivityID, fg);
                ft.commit();
            how android found the Replaced Layout that has been Rpleaced when application first Launched ???????


--->Lesson of Fragment with ui

---> i  have also to implement an Listner Interface between my fragment and Volly_class
     is that Normal or because i am adding  fragment Dynamicly 

--->My list adapter have 20 item 
1--->cycle _1(convertView==nul)   checked  1#
    else                          checked  5#

2--->cycle_2     else             checked  6#
3--->cycle _3(convertView==nul)   checked  6#
2--->cycle_4     else             checked 11#


--->why Interface is the the best common bridge between obj why they  can do that
thins of the interface as Avariable 
so if we want to pass A method Body to Specific class how can we achive that ???
basic Steps is to intialize avariable then your class call it later

but what varible can hold diffrent methods body ?????

yes the interface is that type if variables 





--------------------------------
public List makeJsonObjectReviewRequest(String reviewUrl) {
        
       List<Map<String, String>> listRevData = new ArrayList<Map<String, String>>(); ??? shy should i declared this value as Aclass Variable


------------------------

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.new_one.HelperClasses.SerializeObject;
import com.example.new_one.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;
---------------
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.example.new_one.Controller_interfacer.SingleMoviewFragmentListner;
import com.example.new_one.HelperClasses.AndroidDatabaseManager;
import com.example.new_one.HelperClasses.SerializeObject;
import com.example.new_one.R;
import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import java.util.List;
import java.util.Map;

import io.realm.Realm;
import io.realm.RealmConfiguration;
-----------------------------


    <ImageView
        android:id="@+id/imageView1"
        android:layout_width="match_parent"
        android:layout_height="300dp"
       />
    

    --------->when i increase the wodth over 300dp the Gap betweeb coulmns are get biger no the Image


     android:numColumns="2"
        android:gravity="center"
        android:columnWidth="200dp"
        android:stretchMode="columnWidth"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"