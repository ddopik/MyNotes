Why use MVP?
====================

In Android we have a problem arising from the fact that Android activities are closely coupled to both interface 
and data access mechanisms. 
MVP makes views independent from our data source.
We divide the application into at least ______three different layers______,
which let us test them independently.
With MVP we are able to take most of logic Out from the activities so that we can test it without using instrumentation tests.
=========
Note:--
=========
In MVP, the View cannot access the (((Model))).
The (_Presenter is tied_)--->to a (((single View))).
The View is completely passive in the MVP pattern.

 

How MVP work for Android:-
==================================

The pattern varies depending basically on the amount of responsibilities that we delegate to the presenter.

The Presenter (act as Controller) : 
==============
--->responsible to act as the middle man between view and model. 
It retrieves data from the model and returns it formatted to the view.
But unlike the typical MVC
it also decides what happens when you interact with the view.
--->responsible for __handling all UI events___ on behalf of the view,
This receive input from users via the View.
--->view and presenter are completely decoupled from each other’s
and communicate to each other’s by an __interface__.
--->View has a reference to Presenter but View __has not reference to Model__.
--->Generally there is a one to one mapping between View and Presenter, 
with the possibility to use multiple Presenters for complex Views

 

The View :-
=========
--->Usually implemented by an Activity (it may be a Fragment, a View… depending on how the app is structured),
 will contain a __reference to the presenter__
 Presenter will be ideally provided by a dependency injector such as __Dagger__,
 but in Case you don’t use something like this
--->View components are also in charge of handling user interactions such as click events and act accordingly by calling the right method in the presenter 
--->it will be responsible For creating the presenter object. 
    The only thing that the view will do is __calling a method__ from the presenter every time there is an ---Interface action--- (a button click for example).
--->View layer with MVP becomes so simple, so it does not even need to have callbacks when requesting for data. View logic becomes very linear
The model :-
==========
--->In an application with a good layered architecture--->this model would only be the gateway to the domain layer or (((Business logic))).
If we were using the Uncle Bob clean architecture , the model would probably be an interactor that Implements a use case 
it is enough to see it as the provider of the data we want to display in the view.
--->The MVP’s Model in our architecture could be represented by Entities 
 these would 'some simple objects' that we 'receive' from our 'database' or 'server'.
In Java they are called POJO(Plain Old Java Objects), 
because they 'don’t contain any logic', 'only fields'.
==================================================================================================================


How to write it :-
==================

1---you can create an umperella Interface to include all your operation 
{

--->The Contract is the glue that binds the participating components in MVP pattern together.
  --It is nothing but the good old Java Interface that defines the responsibility of the Model, the View and the Presenter. 
  --I like to create these three interfaces within one Class file because it makes For better code structure	
  --as the communication between the layers takes places by using interfaces. 

		1.View       --–> this defines the methods that the concrete View aka Fragment will implement.
		                  This way you can proceed to create and test the Presenter without worrying about Android-specific components such as Context.

		2.Actions    --–> this defines the methods that the concrete Presenter Class will implement. Also known as user actions, 
		                  this is where the business logic for the app is defined.

		3.Repository --–> this defines the methods that the concrete persistence Class will implement. This way the Presenter does not need to be concerned about how data is persisted.

  


Step 2 – Create Presenter Class: Create a package called presenter, and in this package add a standard Java Class called ProductListPresenter.java

Step 3 – Update Dagger Component: Since the Presenter is a POJO class, the components that we need in this Class such as the concrete implementation 
of the View, Repository, Shopping Cart, etc has to be passed to us. 
We can either receive these components via the constructor or we can have them be injected using Dagger 2. 


Step 4 – Create Persistence Module: We need to let Dagger 2 know which concrete Class will be used to satisfy the dependency on the Repository interface. 
         This concrete Class can use either in-memory data, SQLite, Realm Database, etc


Step 5 – Implement the Presenter: We can now implement the Presenter , Notice that we require the 'View to be passed in via the construct'



if there is view operation SImplest example as Toast the presentr should Handle it  ?

	1.the activiy implement an Interface with the required view opertation but though the activity can`t handle it
    2.pass your activity to the constructor
    3.define an Interface Referance of which Activity implements it`s method
    4.presenter now can accesse Activity implemented Method as they are sharing the same Interface referance 
    5.there is no memory leak as we are not Passing activty Context we are passign as object and presenter controling as Only Interface

---->presenter will Have Model Referance Injected with Dagger.

Step 6 -Create package For Dagger.

---> Create package for  Adapter if nessary


2---Each view must have one Presenter Note---> presenter in Rarly case could have more one view


3---Activities and Fragments become very lightweight. Their only responsibilities are to set up/update the UI and handle user events.
Therefore, they become easier to maintain.


**Why the Interface view is needed here ? 
-->It is needed to be able to write an unit test replacing the implementation view with a test 
   ---We can now easily write 'unit tests' for the presenters by mocking the view layer.
   ---Before, this code was part of the view layer so we couldn’t unit test it.
   ---The whole architecture becomes very test-friendly.

**Why we Need Interface for our View Layer ?....
--->the Presenter need to Make ViewActions to the ViewLayer
how can we do that ???
1.you can send A view Referance from the View layer to Presenter Layer Or.....
2.Make an Interface and implement it`s method in your view layer then
call it in the Presenter layer as A ('your_referance'.Overriden_View_Method).

**Why we Need Interface For Presenter Layer ?...
--->Method/property access restrictions 
  ---Interfaces restrict what parts of an implementation you can see/use,
  ---so for example if HomePagePresenter had a number of methods/proeprties that regular consumers of the Class shouldn not use/have access to,
  ---you can restrict what they can use by exposing the Class using the Interface instead


=============
Conclution :-
=============
Keep them separated. The view should implement an Interface which forms the bond between the view and presenter. 
The view creates a presenter and injects itself into the presenter and exposes the methods it offers up for the presenter to interact with the view.
The view is responsible for implementing these methods or properties any way it wants. Generally you have one view : one presenter but in some cases you can have many views : one presenter (web, wpf, etc.).
The key here is that the presenter knows nothing of UI implementations and only interacts with the view through the interface.
On Android MVP is a way to 'separate' background tasks From 'activities/views/fragments' to make them 'independent of most lifecycle-related events'
==================================================================================================================
 
Be careful :
---->MainActivity creates MainPresenter and 'keeps it outside of reach of onCreate/onDestroy' cycle.








---->In the real life you’re not going to use a static variable to hold your presenter.
MainActivity uses a (((((((static variable to reference MainPresenter))))), 
so every time a process restarts due to out-of-memory event, MainActivity should check if the presenter is still here and create it if needed.
Yes, this looks a little bit bloated with checks and uses a static variable, but later I will show how to make this look much better.
Background tasks ---->Whenever you write an Activity,a Fragment or a custom View,
you can put all methods that are connected with background tasks to a different external or static class.
This way your background tasks will not be connected with an Activity, will not leak memory and will not depend on Activity’s recreation.
We call such object ---->“Presenter”.
