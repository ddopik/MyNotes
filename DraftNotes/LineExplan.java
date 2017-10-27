

android.R.id.content -----> gives you the root element of a view, without having to know its actual name/type/ID
getSupportActionBar().setDisplayHomeAsUpEnabled(true); ---> This method makes the icon and title in the action bar clickable so that “up” (ancestral) navigation can be provided.
                                                            This method will just make the icon and title pressable, 
                                                            but not actually add the functionality of navigating upwards



Intent : Intent is an asynchronous message which is use to communicate between the components in android , except Content Provider. for example you can start activity by startActivity(Intent intent);

Sticky Intent : sticky intents are associated with the android system for the future broadcast events.

Pending Intent : Those intent which you want to trigger at some time in future when you application is not alive.                                                            


