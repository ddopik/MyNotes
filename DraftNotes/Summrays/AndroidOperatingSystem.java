--->What does it mean to inflate a view from an xml file?

When you write an XML layout,
 it will be inflated by the Android OS which basically means that it will be rendered by 'creating view object in memory'. 
 Let`s call that implicit inflation (the OS will inflate the view for you). For instance:
 class Name extends Activity{
    public void onCreate(){
         // the OS will inflate the your_layout.xml
         // file and use it for this activity
         setContentView(R.layout.your_layout);
    }
}
You can also inflate views explicitly by using the LayoutInflater
---Inflating is the process of adding a view(.xml) to activity on runtime.
Because we make UI into XML but 'view objects' is what we display so we somehow need to 'convert xml' into view objects so inflating means we are 'converting xml into view objects' so that it can be displayed, 
for this we need a service called layout inflator service and give it an xml and it will be convert for you.

setContentView is an Activity method only.
 Each Activity is provided with a FrameLayout with id "@+id/content" (i.e. the content view). 
 Whatever view you specify in setContentView will be the view for that Activity. Note that you can also pass an instance of a view to this method, e.g. setContentView(new WebView(this));
 The version of the method that you are using will inflate the view for you behind the scenes.	

----------------------------------------------------