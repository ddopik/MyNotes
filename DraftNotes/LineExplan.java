

android.R.id.content -----> gives you the root element of a view, without having to know its actual name/type/ID
getSupportActionBar().setDisplayHomeAsUpEnabled(true); ---> This method makes the icon and title in the action bar clickable so that “up” (ancestral) navigation can be provided.
                                                            This method will just make the icon and title pressable, 
                                                            but not actually add the functionality of navigating upwards