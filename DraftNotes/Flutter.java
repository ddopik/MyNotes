		                   ==Flutter==
		                 ===============


The 'app' extends 'StatelessWidget' which makes the app itself a widget. 

In Flutter
 almost everything is a widget Including ---> alignment, padding, and layout. 
 

 The Scaffold widget,
  from the Material library, provides a default app bar, title, 
  and a 'body'  property that holds the widget tree for the home screen. The widget subtree can be quite comple


  A widget’s main job :-
  --> provide a build() method that describes how to display the widget in terms of other, lower level widgets.



 Container : is a widget that allows you to customize its child widget. 
       --->Use a Container when you want to add padding, margins, borders, or background color, to name some of its capabilities.


You can use a ---> Row widget to arrange widgets horizontally,
        and a --->Column widget to arrange widgets vertically.

    Stateless widgets  Vs  Stateful widgets v
=================================================
  Stateless widgets are immutable
                            ---> meaning that their properties can’t change—all values are final.
                                As :ImageView with your logo. The logo is not going to change during runtime, so use a StatelessWidget in Flutter.

 Stateful widget  (mutable)         
                            ---> to dynamically change the UI based on data received after making an HTTP call or user interaction 
                               then you have to work with StatefulWidget
                               and tell the Flutter framework that the widget’s State has been updated so it can update that widget     






1.MatchParent  ---> we need to use "mainAxisSize" property in Row/Column widget  as   MainAxisSize.max which behaves as match_parent.
2.Wrap_content ---> MainAxisSize.min which behaves



3. Gravity    ---->The same can be achieved in Row/Column widget using MainAxisAlignment and CrossAxisAlignment properties.
                
"MainAxisAlignment": --->This property defines how the children should be placed along the main axis(Row/Column). the accese the widget alligned to 
                         In order to make this work, 
                         there should be some space available in the Row/Column widget if you set the value to MainAxisSize.min i.e wrap_content
                         than setting MainAxisAlignment won’t have any effect on the widget because of no available space.
                         We can define MainAxisAlignment property like this.
                         body: new Container(
											  color: Colors.yellowAccent,
											  child: new Row(
											    mainAxisSize: MainAxisSize.max,
											    mainAxisAlignment: MainAxisAlignment.start,
											    children: [...],
											  ),
											)
"CrossAxisAlignment": ---> This property defines how the children should be placed along the cross axis. (the line that cross the main MainAxisAlignment)
                           It means if we use Row widget the individual’s children gravity will be on the basis of the vertical line.
                           And if we use Column widget the individual’s children gravity will be on the basis of horizontal line.

4.Layout Weight ----> To achieve the same thing in flutter Row/Column widget we wrap each child into an "Expanded widget" 
 			     	  which will have flex property equivalent to our android:layout_weight
					  so by defining flex value we define the amount of space should be applied to that specific child.













======================================================
What are the equivalent of activities and fragments in Flutter?
in Android, an Activity represents a single focused thing the user can do.
 A Fragment represents a behavior or a portion of user interface. Fragments are a way to modularize your code, 
 compose sophisticated user interfaces for larger screens, and help scale your application UI. In Flutter, 
both of these concepts fall under the umbrella of Widgets.    


You use a Navigator to move between different Routes that represent different screens or pages, 
or maybe just different states or renderings of the same data.                                             
 
 A Route is an abstraction for a “screen” or “page” of an app, 
 and ___a Navigator is a widget that manages routes___.

  A route roughly maps to an Activity,
   but it does not carry the same meaning. 

  A navigator can push and pop routes to move from screen to screen. Navigators work like a stack on which you can push() new routes you want to navigate to, 
 and from which you can pop() routes when you want to “go back”.


 In Android, you declare your activities inside the app’s AndroidManifest.xml.

In Flutter, you have a couple options to navigate between pages:

----> Specify a Map of route names. (MaterialApp)
----> Directly navigate to a route. (WidgetApp)

The following example builds a Map.

void main() {
  runApp(MaterialApp(
    home: MyAppHome(), // becomes the route named '/'
    routes: <String, WidgetBuilder> {
      '/a': (BuildContext context) => MyPage(title: 'page A'),
      '/b': (BuildContext context) => MyPage(title: 'page B'),
      '/c': (BuildContext context) => MyPage(title: 'page C'),
    },
  ));
}
Navigate to a route by pushing its name to the Navigator.

Navigator.of(context).pushNamed('/b');




What is the equivalent of startActivityForResult() ?
The Navigator class handles routing in Flutter and is used to get a result back from a route that you have pushed on the stack. This is done by awaiting on the Future returned by push().

For example, to start a location route that lets the user select their location, you could do the following:

Map coordinates = await Navigator.of(context).pushNamed('/location');
And then, inside your location route, once the user has selected their location you can pop the stack with the result:

Navigator.of(context).pop({"lat":43.821757,"long":-79.226392});

======================================================================
To make a network call, call await on the async function http.get():==
======================================================================

import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
[...]
  loadData() async {
    String dataURL = "https://jsonplaceholder.typicode.com/posts";
    http.Response response = await http.get(dataURL);
    setState(() {
      widgets = json.decode(response.body);
    });
  }
}


========================================================
ProgressBar====
===============
How do I show the progress for a long-running task?
In Android you would typically show a ProgressBar view in your UI while executing a long running task on a background thread.

In Flutter, use a ProgressIndicator widget. Show the progress programmatically by controlling when it’s rendered through a boolean flag. 
Tell Flutter to "update its state" before your long-running task starts, and hide it after it ends.

In the following example, the build function is separated into three different functions..
 If showLoadingDialog() is true (when widgets.length == 0),
  then render the ProgressIndicator. Otherwise, render the ListView with the data returned from a network call.

import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() {
  runApp(SampleApp());
}

class SampleApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Sample App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: SampleAppPage(),
    );
  }
}

class SampleAppPage extends StatefulWidget {
  SampleAppPage({Key key}) : super(key: key);

  @override
  _SampleAppPageState createState() => _SampleAppPageState();
}

class _SampleAppPageState extends State<SampleAppPage> {
  List widgets = [];

  @override
  void initState() {
    super.initState();
    loadData();
  }

  showLoadingDialog() {
    return widgets.length == 0;
  }

  getBody() {
    if (showLoadingDialog()) {
      return getProgressDialog();
    } else {
      return getListView();
    }
  }

  getProgressDialog() {
    return Center(child: CircularProgressIndicator());
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Sample App"),
        ),
        body: getBody());
  }

  ListView getListView() => ListView.builder(
      itemCount: widgets.length,
      itemBuilder: (BuildContext context, int position) {
        return getRow(position);
      });

  Widget getRow(int i) {
    return Padding(padding: EdgeInsets.all(10.0), child: Text("Row ${widgets[i]["title"]}"));
  }

  loadData() async {
    String dataURL = "https://jsonplaceholder.typicode.com/posts";
    http.Response response = await http.get(dataURL);
    setState(() {
      widgets = json.decode(response.body);
    });
  }
}

=============================================================================================================