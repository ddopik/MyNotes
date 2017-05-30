
Before we begin there is some terminology to get familiar wit


Modules are like apkLibs it has its own 'res','manifest',
tests etc but the main app usually uses various apklibs/modules to help put it all together in one solution

AAR — The ‘aar’ bundle is the binary distribution of an Android Library Project.
(AAR Format) A Library project’s main output is an .aar package (which stands for Android archive). 
It is a combination of compile code (as a jar file and/or native .so files) and resources (manifest, res, assets).


Maven Central Repository — A repository provided by the Maven community.
 It contains a large number of commonly used libraries. 
 Search Maven to browse the content of the central maven repository. Gradle,
 Please is another tool that allows you to search Maven Central. 
 Gradle uses the jCenter repo if you included jCenter() into your repositories section (Notes about jCenter).
 Maven Central Repository is often referred to as Maven Central or the Central Repository

 Sonatype — Sonatype’s Open Source Software Repository Hosting (OSSRH) service is the primary avenue for project owners and contributors to publish their components to the Central Repository






-------------------------------------------


--->If your library is going to be composed of only Java classes, packaging it as a JAR 
------>To begin, add a New Android module to your project by selecting New > New Module from the File menu
----------Your project will now have two modules, one for the app and one for the library. Here’s what its structure 

--->If you plan to share only standard Java code, you can distribute them packaged as Java Archive Resources (.jar) files. However,
 ----if you intend to include resources such as layouts, drawables, or string resources, or even an additional AndroidManifest.xml file,
 -----you must create an Android Archive Resource .aar file file instead.
 -----An .aar file can include the following types of files:


 
//        NotificationManager mNotificationManager;
//        android.support.v7.app.NotificationCompat.Builder mBuilder;
//        Notification mNotification;
//        final int NOTIFICATION_ID = 1;
//        mNotificationManager = (NotificationManager) MainApp.getMainAppApplication().getSystemService(Context.NOTIFICATION_SERVICE);
//        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//        mBuilder = new android.support.v7.app.NotificationCompat.Builder(MainApp.getMainAppApplication());
////        mBuilder.setContentTitle(message);
////        mBuilder.setStyle(new android.support.v4.app.NotificationCompat.BigTextStyle().bigText(notificationBody));
////        mBuilder.setContentText(notificationBody);
////        mBuilder.setContentIntent(contentIntent);
//        mBuilder.setSound(alarmSound);
////        mBuilder.setLargeIcon(BitmapFactory.decodeResource(ctx.getResources(), R.drawable.ic_launcher));
//        mBuilder.setSmallIcon(R.drawable.ic_cast_dark);
//        mBuilder.setAutoCancel(true);
//        mNotification = mBuilder.build();
//        // set dismiss on click flags
//        mNotification.defaults = Notification.DEFAULT_LIGHTS | Notification.FLAG_AUTO_CANCEL | Notification.DEFAULT_SOUND;
//        mNotificationManager.notify(NOTIFICATION_ID, mNotification);