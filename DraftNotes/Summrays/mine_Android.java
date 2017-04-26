My_android_notes
C:\Users\ddopikMain\AppData\Local\Android
C:\Users\ddopikMain\AppData\Local\Android\sdk\extras\google\usb_driver
-----------Drafts--------------------------------------------------------------------------------------
https://api.themoviedb.org/3/movie/top_rated?api_key=61b43cea1b1dc0726b2c14fcce079ffe
http://api.themoviedb.org/3/movie/157336/reviews?api_key=61b43cea1b1dc0726b2c14fcce079ffe  //single Move Rev
http://api.themoviedb.org/3/movie/157336/videos?api_key=61b43cea1b1dc0726b2c14fcce079ffe //singleMovie vedio
http://api.themoviedb.org/3/movie/157336?api_key=61b43cea1b1dc0726b2c14fcce079ffe  //single Movie Deatails

adb -d shell "run-as com.example.new_one ls /data/data/com.example.new_one/databases"

in your app/build.gradle  --->Means gradle in the main Root

searchList.get(i).getName().contains(search)
Ctrl + Alt + L ---> Format view
git add app/src/main/java/com/example/new_one/CustomViewAdapter.java
All app componanets should be loosely coupled

Interfaces are a powerful tool to use for decoupling. 
Classes can communicate through interfaces rather than other Concrete classes, 
and any Class can be on the other end of that communication simply by implementing the interface.

In object oriented design, the amount of coupling refers to how much the design of one Class depends on the design of another class.
In other words, 
how often do changes in Class A force related changes in Class B? Tight coupling means the two classes often change together, 
loose coupling means they are mostly independent. In general, loose coupling is recommended because it is easier to test and maintain

-----
Configuration change --->Normally happens when a user flips the screen, changes language settings, 
                         attaches an external monitor, etc. More on this event you can read 'http://developer.android.com/reference/android/R.attr.html#configChanges'

An Activity restart  --->happens when a user has set “Don’t keep activities” checkbox in Developer’s settings and another activity becomes topmost.                         

Process restart      --->if there is not enough memory and the application is in the background


--->When you need to add Fragments programmatically, you should add them to an existing ViewGroup.
    So I removed the Fragment from the xml and used FrameLayout component in the replace() method.
--->not a bug after all. You simply cannot replace fragments added statically in a layout file. 
    You can only replace those you have added programmatically

--->As getView is call many times 
-----inflating a New view every time is expensive so list view provides you one of the previously created view to re-use.  
--->Because only 8 items initially fit on the screen, getView() was called 8 times. That is not always true as the adapter can call some additional getViews for measuring  
------------------------------------------------------------------------------------------------
Observers DesignPatterns
=========================
A good design means to decouple as much as possible and to reduce the dependencies.
Define a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically.

--->Subject should provide methods using which observers can register and unregister themselves
--->Subject also contain a method to notify all the observers of any change 
    and either it can send the Update while notifying the observer or it can provide another method to get the update.
--->Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates    

--->Model-View-Controller (MVC) frameworks also use Observer pattern 
        where Model is the Subject and Views are observers that can register to get notified of any change to the model
-------------------------------------------------------------------------------------------------
setTag()/getTag()---
--------------------
Unlike IDs, tags are not used to identify views. 
Tags are essentially an extra piece of information that can be associated with a view. 
They are most often used as a convenience(moreComfort) to store data related to views in the views themselves rather than by putting them in a separate structure.
------------------------------------------------------------------------------------------------- 
Android Dependencies ---> is a virtual folder where Eclipse shows what JAR files the project depends on. 
                         It's not a physical folder; you won't find it on your hard disk. And the folder is not checked in into Subversion.
Mock objects         --->let you simulate and verify real objects, without actually running the real code in those objects.
                         You can set up a mock to return specific results on method calls, 
                         You can verify that a method was or wasn not called, and other cool stuff.
Frame layout    --->good for simle layout and single view  '.container'
Linear layout   --->good for vertivally or horizontally layout  '.container'
Relative layout ---> enables you to specify how child views are positioned relative to each other. '.container'
                     The position of each view can be specified as relative to   
                     sibling elements or relative to the parent.
Fragment         --->Moduel section has it's own' life cicle  more like sub_activity 
                 --->Fragments are two or more activities on the screen at the same time.     
                 --->Fragments don’t subClass the Context class. 
                 ------Therefore you have to use the getActivity() method to get the parent activity.  
                 --->In your fragment you can call getActivity()--->This will give you access to the activity that created the fragment. 
                    From there you can obviously call any sort of accessor methods that are in the activity.                               

Scrool view ---> will allow us to Scrool item inside layout that contains.
List view   ---> starts by 'requseting' a 'view' of every visible item -->(its an Container)
            ---> the list view 'Requset' item  with 'Adapter'.
--ex--> when ever New list item come to the view we just update the data displayed in one of our items in Recycle bin .
=================
=================

--->android:id="@+id/foo" ---> means you are creating an id named foo in the namespace of your application.
---You can refer to it using @id/foo.

--->android:id="@android:id/list"
---you refer to Android resources , which are already defined in Android system.

Wrap content --->The view should be only big enough to enclose 'its content' (plus padding).
Match parent --->The view should be as big as its 'parent'

=================
=================

 
-----((((Java has two kinds of classes for input and output (I/O): streams and readers && writers))))).----------

--->Streams (InputStream, OutputStream and everything that extends these) are for reading and writing binary data from files,
the network, or whatever other device.

Reading data from disk byte-by-byte is very inefficient. One way to speed it up is to use a "buffer": 
instead of reading one byte at a time, you read a few thousand bytes at once, and put them in a buffer, in memory. 
Then you can look at the bytes in the buffer one by one.
--->Readers and writers are for reading and writing text (characters). They are a layer on top of streams, 
   that converts binary data (bytes) to characters and back, using a character encoding.
So  --->BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 ---System.in is an InputStream. You create an InputStreamReader which reads bytes from System.in. Then you wrap that in a BufferedReader.
    So, in the end, you have a BufferedReader that reads from an InputStreamReader that reads from System.in. 





=========(Try and Catch Blocks)========

Rule: At a time only one Exception is occured and at a time only one catch block is executed.
  try{  
    int a[]=new int[5];  
    a[5]=30/0;  
   }  
   catch(Exception e){System.out.println(e+"common task completed");}  
   catch(ArithmeticException e){System.out.println("task1 is completed");}  
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
   System.out.println("rest of the code...");  
 }  



Output---> Compile-time error
========================================================================================================================





Solid OOP
=============

  S--->Single  resposepalety
  O--->(Open/Close extention)
      ---- try to make your Class more generic as possible 
                write the Class once avoid Editing it 
      ----Ex--> when  making InterFace and implement  in your  class (Datsun)
                so what ever another  classes or objects uses Datsun_obj will see the implemented method of Interface
                as you have a couple of classes and shares a Common method here the Interface part come 
                so (Datsun,Fiat,Toyota,Bmw) when they use AsyncTask Class ---> this Class can see same method  in all car classes
                by this techinique we have saved from making condition for each Class on my AsyncTask class
  L---> Function can not edit it is parent class
  I---> Do not make single Interface for all class
  D---> Do not build your child over parent


===============================================================================================================================
Making AsyncTask Interface listner==
=====================================

 --->If you define a reference variable whose type is an interface,
    any object you assign to it must be an Instance of a Class that Implements the interface.

--->When you define a New interface, you are defining a New reference data type.
    You can use Interface names anywhere you can use any other data type ame.
--->Using an Interface as a Type

--->the problem is how to invoke OnPostExecute in Normal_obj from   AsyncTask_class 
--->cause we can not call OnPostExecute method directely
--->the soultions was to define interface_method inside the OnPostExecute_method 
    so when ever the OnPostExecute_method execute it will call the Interface_method 

And here how it works
--->in your AsyncTask_class just define a variable with type of your Interface
   and in the OnPostExecute_method  call it like____  delegate.processFinish(result);______
   and here is the __Trick___ the variable you have defined earlier are not contain the implemented method of 
   the interface yet it works as an container that will contain the method implementation of any other Normal_obj
   this call happening when you define in you normal obj this line asyncTask.delegate = this;
   now you have passed all the obj  to the delegate variable of interface type 
   which has no problem with that as the object implement its method

--->Now the delegate InterFace variable in AsyncTask_class  holding normal_object with its implemented method 
   so we must intialize the interface variable first so  when we execute() the AsyncTask_class
   the OnPostExecute_method implement the Interface_method of our normal_object.

Example:-
{
	Public interface AsyncResponse 
	 {
    void processFinish(String output);
        }

----------------
 public class MyAsyncTask extends AsyncTask{
  public AsyncResponse delegate = null;

    @Override
    protected void onPostExecute(String result) {
      delegate.processFinish(result);
    }


 }
----------
 public class MainActivity implements AsyncResponse{
  MyAsyncTask asyncTask =new MyAsyncTask();

  @Override
  public void onCreate(Bundle savedInstanceState) {

     //this to set delegate/listener back to this class
     asyncTask.delegate = this;

     //execute the async task 
     asyncTask.execute();
  }
 
  //this override the implemented method from asyncTask
  @Override
  void processFinish(String output){
     //Here you will receive the result fired from async class 
     //of onPostExecute(result) method.
   }
 }

}

====================================================================================================================
Arrays things:-
===============


Java map: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.

Java list: An ordered Collection (also known as A sequence).

The user of this interface has precise control over where in the list each element is inserted. 
The user can access elements by their integer index (position in the list), and search for elements in the list.
With a Map you can "directly" access your items with a known key,
in a list you would have to search for it, evan if its sorted.


If you have data to process and need to do it with all objects anyway, a list is what you want. 
If you want to process single objects with well known key, a map is better.


Two dimentional array in Java
------------------------------####_1

ArrayList<String[]> outerArr = new ArrayList<String[]>();    

String[] myString1= {"hey","hey","hey","hey"};  
outerArr .add(myString1);
String[] myString2= {"you","you","you","you"};
outerArr .add(myString2);

  //retrieve using:
for(int i=0;i<outerArr.size();i++){

   String[] myString= new String[4]; 
   myString=outerArr.get(i);
   for(int j=0;j<myString.length;j++){
      System.out.print(myString[j]); 
   }
   System.out.print("\n");

}

---------####_2
Java does not support associative arrays, however this could easily be achieved using a Map
Map<String, String> map = new HashMap<String, String>();
map.put("name", "demo");
map.put("fname", "fdemo");
// etc

map.get("name"); // returns "demo"
Even more accurate to your example (since you can replace String with any object that meet your needs) would be to declare:

List<Map<String, String>> data = new ArrayList<>();
data.add(0, map);
data.get(0).get("name"); 


===========================================================================================================================
============================
serialize data in android:==
============================

--->All subtypes of a serializable Class are themselves serializable. 
The serialization Interface has no methods or fields and serves only to identify the semantics of being serializable.
--->Certain system-level classes such as Thread, OutputStream and its subclasses, and Socket are not serializable. 
If you serializable class contains such objects, it must mark then as "transient"

class Customer implements Serializable
{
   // properties, getter setters & constructor
}

// This is your custom object
Customer customer = new Customer(name, address, zip);

Intent intent = new Intent();
intent.setClass(SourceActivity.this, TargetActivity.this);
intent.putExtra("customer", customer);
startActivity(intent);

// Now in your TargetActivity
Bundle extras = getIntent().getExtras();
if (extras != null)
{
    Customer customer = (Customer)extras.getSerializable("customer");
    // do something with the customer
}


=========================================================================================================================
---FetchWeatherTask extends AsyncTask<Void, Void, Void>  that AsyncTask inner class 
---Public Class ReaquestApi Extends AsyncTask<String, Integer, String>   what are the last three parameter
First_parameter  -->
Secound_parameter-->
Third_parametet  -->






Content Provider--->A content provider presents data to external applications 
as DB_Table for Exampleple:--A row represents an 'instance' of some type of data 'the provider' collects
               --- and each column in the row represents an 'individual piece' of data collected for an instance.

Contract Class  ---> acts as 'database schema' something that defines how your database is set up.
                ---> everything within the contract Class is declared as Static. That is because you will 'never be instantiating a Contract class', 
                    but 'only referring to the constants defined in it'.              
                   ForExample--->Say for example you wanted to change the name of one of your columns. Rather than making changes to multiple files, 
                   all you have to do is change the value for the column in the contract class. You are not doing any kind of computation work inside of the contract clas 

Contract Class---> defines constants that help applications work with the content URIs, column names, intent actions, and other features of a content provider. 
Contract classes 'are not included automatically with a provider';the Providers developer 'has to define them and then make them available to other developers'.


How to build A query in android
=================================
Cursor cursor = sqLiteDatabase.query(tableName, tableColumns, whereClause, whereArgs, groupBy, having, orderBy);

--->This Interface provides random read-write access to the result set returned by a database query.
--->Cursor is the Class which represents a 2 dimensional table of any database. When you try to retrieve some data using SELECT statement,
    then the database will first "create a CURSOR object" and "return its reference to you".
--->it has rows returned by some queries with its pointer. 

TableColumns--->New String[] { "column1", "column2", ... } For specific columns as in SELECT column1, column2 FROM .
---you can also put complex expressions here 
            --->New String[] { "(SELECT max(column1) FROM table1) AS max" } would give you a column named max holding the max value of column1
            --->(null) For all columns as in SELECT * FROM .........

WhereClause --->String whereClause= "column1 = ? OR column1 = ?";            
             ---should include ? for things that are dynamic

WhereArgs   --->String[] whereArgs = new String[] { "value1","value2"};

Ordered     --->String orderBy = "column1";

--->Select query for retrieving data from table with mathed arg
    ---rawQuery("SELECT id, name FROM people WHERE name = ? AND id = ?", new String[] {"David", "2"});

--->ContentValues object maps column names to data values        
   ---ContentValues values=new ContentValues();
   ---values.put("SHOW_TYPE",show.getShowType());

---------------------------------------------------------------------
Looping method---
-----------------
A way to get coulumn index

Cursor c = db.rawQuery("query",null);
int id[] = new int[c.getCount()];
int i = 0;
if (c.getCount() > 0) 
{               
    c.moveToFirst();
    do {
        id[i] = c.getInt(c.getColumnIndex("field_name"));
        i++;
    } while (c.moveToNext());
    c.close();
}
-----------------------------------------------------------------------
ContentProvider--->This encapsulation is responsible for both retrieving data and also storing data. 
                ---This abstraction is only required if you want to share data externally or between applications.
Content Resolver ---> behaves exactly as its name implies it accepts requests from clients, 
                  ---and resolves these requests by directing them to the content provider with a distinct authority.                
-----------------------------------------------------------------------
assertTrue() --->
assertFalse() --->
assertEquals() --->

--->db.insert("tableName",Query) ---->Should retutn 'Row id' of inserted coulmn and return '-1' if insert false 
Looking at SQLiteDatabase.java in the android source shows that the query(..) ends up calling the QueryBuilder to build the query as a single string 
and then it essentially calls rawQuery(). They should be roughly equivalent

rawQuery()--->is prefered and mainly working as Select statment 
 Query() ---> are mainly use for quert that not expecting aresult

 ----------------------------------------------------------------------------------
How Adapters Work---
--------------------
   public View getView(int position, View convertView, ViewGroup parent) {

          if (convertView == null) {
              LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
              convertView = mInflater.inflate(R.layout.custom_grid_item, null);

          }

1-->The LayoutInflater::: takes your layout XML(Item)-files and creates different View-objects from its contents.
-----adapters are built to reuse Views---------So
2-->ConvertView:::This reused View is the 
3--> If this is null it means that there is no recycled View and we have to create a New one,
------Convertview == null is usefull when all your itens follow the same layout. 
------When you need to check for a radio or checked button for example, 
------and change layout based on each item, you need to reinflate,or it gets the cached view.
4-->ParentView::: is the view which contained the items view which getView() generates. Normally it is ListView or Gallery...

==============================================================================================================================
BaseAdapter vs CursorAdapter=
=============================
if you are dealing with any database either your own or device(like contacts, sms etc)  also a 'content_provider' CursorAdapter is used, 
and if you want to make your custom list with Images and Textviews etc, 
then BaseAdapter is generally used.
Any if your dealing with more complex custom listview like sorted contacted list along with seprater like A,B,C...
then you have to use EfficientAdapter.
==============================================================================================================================
Usefull Commands===
===================

1-->txtValue.setText(Integer.toString(numberYouWant)); ---->Convert to string
2-->t2.setText(String.valueOf(my_value));
3-->private final String LOG_TAG = FetchWeatherTask.class.getSimpleName();
  --Log.e(LOG_TAG, "Error ", e);
4-->Button button = (Button) view.findViewById(R.id.button1);
                button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                updateDetail("fake");
                        }
5-->String mystring = getResources().getString(R.string.mystring);


the error solved  when I Removed the  ID from my Movies class 
but when i trying to itterate to get values 
i got nothibg 
here is my code

    public void setQuery()
    {

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.createObjectFromJson(Movies.class,jasonString);
//                realm.createAllFromJson(Movies.class,jasonString);
//                realm.createOrUpdateObjectFromJson(Movies.class, jasonString);

            }
        });
    }
           public void getQuery(Activity ac)
    {
        RealmResults<Movies> movies;

        int  i=0;
                RealmResults<Movies>  mv = realm.where(Movies.class).findAll();
                for (Movies movie : mv) {
                    Toast.makeText(ac,+i+"--"+"values-->"+movie.getPoster_path(),Toast.LENGTH_LONG).show();
                    i++;
                }


    }
==============================================================================================================================
Services===
===========
It is possible to assign services the same priority as foreground activities.

In this case it is required to have a visible notification active for the related service. It is frequently used for services which play videos or music.
--->Services which run in the process of the application are sometimes called local services.