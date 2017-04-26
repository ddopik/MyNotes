Android Profesionals Requrnments:---
=================================

1.Testing and Debugging.
2.Application User Interface (UI) and User Experience (UX).
3.Fundamental Application Components.
4.Persistent Data Storage.
5.Enhanced System Integration.

Explained in
--->https://www.udacity.com/google-certifications


How cleanCode Written:-
=======================
1.program to an interFace (Remeber the Dog Example)
--->Create an Interface defines your Class objective and call the class.
---with Interface referance.
2.Avoid blocking MainThread.
3.Avoid NestedWidget.
4.Avoid CustomView not probpably made.
5.Use 'Static final' (15%~ 20% faster).
6.Avoid mush (Setter&Getter) --->direct accesse (?????...search for it).
7.Keep in mind 'KISS' pricible
8.Consider creating your own 'viewGroup' ????? --->what is it.
9.use 'Merge Tags' as A root Layout.
10.think Twice before adding Third party
11.'RxJava' are best alteranative for AsyncTask.
12.'Retforit' is the best NetWork Lib.
13.do not use 'HttpClient' use 'Volly' insted
14.Shorten your code using 'RetroLambada'
15.use 'EventBus'----////




Memory Leaaks:
==============
1.do not leadk Context in Inner class.
2.Favour Static inner Class vs activity
3.
"
do not use WeakHashMap as A cash
                         ---->only the key are weakReferance.
" ------------------->('search for it') -----??????


How to Implement It
====================

you are free to go as:

1- You can put it in different packages ((careful not to use “outer” packages from “inner” packages))
2-A better approach would be to separate the layers into different Android modules
----for example:-
    adjust dependencies in the build file so that the inner layer simply cannot use the outer layer. At Five, we use something in between.
3- strongly encourage  to access only components from the layer next to yours.





