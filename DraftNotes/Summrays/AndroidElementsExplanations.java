 What does it mean to inflate a view from an xml file?
===================================================================
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


ActionBar
==========
The action bar is a dedicated piece of real estate at the top of each screen that is generally persistent throughout the app.

 As a result, the native ActionBar behaves differently depending on what version of the Android system a device may be using. 
By contrast, the most recent features are added to the support library`s version of Toolbar, and they are available on any device that can use the support library.


-->Why we aleays Need Toolbar ?

Using the support library`s toolbar helps ensure that your app will have consistent behavior across the widest range of devices.
 For example, 
 --->the Toolbar widget 'provides a material design experience' on devices running Android 2.1 (API level 7) or later,
 --->but the native action bar 'doesn`t support' material design unless the device is running Android 5.0 (API level 21) or later.



AppBarLayout 
=============
--->The app bar, also known as the action bar
The app bar, also known as the action bar, is one of the most important design elements in your app`s activities,
 because it provides a visual structure and interactive elements that are familiar to users. Using the app bar makes your app consistent with other Android apps, 
 allowing users to quickly understand how to operate your app and have a great experience. 

 The key functions of the app bar are as follows :-
	1.A dedicated space for giving your app an identity and indicating the user`s location in the app.
	2.Access to important actions in a predictable way, such as search.
	3.Support for navigation and view switching (with tabs or drop-down lists).

is a vertical LinearLayout which 'implements' many of the features of 'material designs app bar concept', namely(as) scrolling gestures.
App bar features have gradually been added to the 'Native ActionBar' over various Android releases.

Children should provide their desired scrolling behavior through setScrollFlags(int) and the associated layout xml attribute: app:layout_scrollFlags.

This view depends heavily on being used as a direct 
child within a CoordinatorLayout. If you use AppBarLayout within a different ViewGroup, most of it,s functionality will not work.

Conclution --> 1.AppBarLayout is VertivalTap to Applay most of 'materials designs' concept must be direct child of CoordinatorLayout
               2.used to include Scrolling items
               


Toolbar layout ('template in AsctionBar')
=============
Using the support library1s toolbar helps ensure that your app will have consistent behavior across the widest range of device

A Toolbar is a 'generalization' of action bars for use within application layouts.
 While an 'action bar' is traditionally part of an Activity`s opaque window decor controlled by the framework,
 a Toolbar may be placed at any arbitrary level of nesting within a view hierarchy
 An application may choose to designate a Toolbar as the action bar for an Activity using the setActionBar() method.
 Action buttons are vertically aligned within the Toolbar`s minimum height, if set.

An action menu. 
==============
The menu of actions will pin to the end of the Toolbar offering a few frequent
important or typical actions along with an optional overflow menu for additional actions.


View Pager
==========
View Pager is what connect you Tab with  NavFragment and it works as (ListView &ViewGroup) Adapter but for Fragment Insted.


Drawer layout
==============

In order to use the DrawerLayout correctly, it has to be the only root / parent view of your entire layout.
DrawerLayout acts as a 'top-level container' for 'window content' that allows for interactive "drawer" views to be 'pulled out from one or both vertical edges'
of the window.



Drawer positioning and layout is controlled using the 'android:layout_gravity attribute' ----> on 'child views'
corresponding to which side of the view you want the drawer to emerge from: left or right (or start/end on platform versions that support layout direction.)
Note that you can only have one drawer view for 'each vertical edge of the window'.
If your layout configures more than one drawer view per vertical edge of the window, an exception will be thrown at runtime.

To use a DrawerLayout, 
------------------------
1.position your primary content view as the first child with a width and height of match_parent . 
2.Add drawers as child views after the main content view and set the layout_gravity appropriately.



Volly
=======

unfortunately volley doesn’t provide any callback method once the NetworkImageView is loaded.