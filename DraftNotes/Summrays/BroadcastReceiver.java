BroadcastReceiver :-
=======================

---->There are two different ways of adding broadcast receiver in the Android application

It can be added either 'programmatically' or in 'Android Manifest file'. 
You should be careful while adding broadcast receiver because unnecessary broadcast receivers 'drain battery power'.
 If you add the broadcast receiver in the Android manifest file,---> it’s implied that you are going to handle a particular intent in the broadcast receiver and not ignore it. 
 There is a way to enable and disable the broadcast receiver which is added in the manifest file.

 It is best practice to always supply the permission when registering the receiver, 
 otherwise you will receive for any application that sends a matching intent. This can allow malicious apps to broadcast to your receiver.

It receives an Intent object,
as  'broadcast receivers' are like dormant app components that can 'register for various system or application events (intents)'. 
Once any of those events occur the system 'notifies all the ____(registered)----((broadcast receivers))))' and brings them up into action 
which could be notifying the user or perform some other job.
The registration is done in the manifest file using intent filters (static) but can also be done programatically (dynamic).

 We call our broadcast receiver implementation MyReciever and it must be a  direct or indirect 
 // Subclass of broadcastReceiver
 which is an abstract Class with the onReceiver() method being abstract.
 'Whenever an event occurs'  ---->  Android   ---->  'calls the onReceive() method on all registered broadcast receivers'. 
 If you notice the Intent object is passed with all the additional information required 
 and also you’ve the Context object available to do other tasks like ___maybe start a service (context.startService(new Intent(this, TestService.class));)____.



Creation the BroadcastReceiver
=================================

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }
 
    @Override
    public void onReceive(Context context, Intent intent) {
        // This method is called when this BroadcastReceiver receives an Intent broadcast.
        Toast.makeText(context, "Action: " + intent.getAction(), Toast.LENGTH_SHORT).show();
    }
}



 Registering the Broadcast Receiver
 ===================================

 { 
IntentFilter filter = new IntentFilter("com.pycitup.BroadcastReceiver");
 
MyReceiver myReceiver = new MyReceiver();
registerReceiver(myReceiver, filter);

    }
We’re done with the 'creation' but it needs to be registered so that it can --->receive events (intents). 
There are two ways to do this:

Statically in the manifest file.
Dynamically in the code.

1-First we created an IntentFilter object that specifies which event/intent our receiver will listen to. 
In this case it’s com.pycitup.BroadcastReceiver which is a custom action name, could be anything but generally the java package naming convention is followed.
 We’ll use this action name again while sending a broadcast that will be handled by this receiver.

2-Then we instantiate our broadcast receiver and call Context.registerReceiver() to actually 'register our receiver' 
  ---that will be called and run in the main application thread.

  --------------------
  --------------------

    --->It’s important to note that when we register a receiver in this way, it lives for as long as 'the component that does the registration lives'.
    --->Once the component that had made the --->'registerReceiver()'  call is destroyed sendBroadcast() will also stop working, 
    ---->hence the 'receiver' won’t receive anymore be it an event generated from an app or the system.
    ---->Whereas with the previous method where we registered via the manifest file, 
  this is not the case.
  When registering a receiver in Activity.onResume(), it is strongly suggested to unregister them receivers in Activity.onPause() to avoid unnecessary system overhead as intents won’t be received when paused anyway.

@Override
protected void onPause() {
    unregisterReceiver(mReceiver);
    super.onPause();
}



Which Method to Use When for Registration
===========================================
Which method (Static or Dynamic) to use when depends completely upon what you’re trying to do. 
Basically when you want to do some changes right on the screen (Home screen, launcher, Satatus bar, etc.) by showing up some notification 
or some 'indicator' in the status bar 'by listening to system wide events' or maybe those sent by other apps,
 then it make sense to use --->'statically registered broadcast receivers'.

  Whereas based on similar events you want to do changes right in your app when the user is using it or maybe it’s put in the background,
   then it makes sense to use dynamically registered receivers which’ll last till the registering components are destroyed.

Infact there are certain events like Intent.ACTION_TIME_TICK that cannot be registered in the manifest but only via registerReceiver() to prevent battery drainage.


The Need Of services
====================
The Service
A broadcast receiver by design cannot execute long tasks. It must call other classes to do its work. We need to create a new class.
 We cannot start a new activity because we do not want the user to be forced to switch to our app. Instead we use a service.
 It will be able to execute tasks in the background.