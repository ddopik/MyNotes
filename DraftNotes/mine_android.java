
Generating SSh key :-
====================

---->keytool -genkey -v -keystore my-release-key.keystore -alias friend_point_key_store -keyalg RSA -keysize 2048 -validity 10000
keytool -exportcert -alias androiddebugkey -keystore %HOMEPATH%\.android\debug.keystore | openssl sha1 -binary | openssl base64
Google-Maps Api Key--->AIzaSyAl0-mByOyUIgHE04iEcY0yHJDMLJtPHrg

                           keytool -exportcert -alias "NewsApp_FaceBook_Key" -keystore "D:\my_private_key.keystore" | openssl sha1 -binary | openssl base64
 
 how to generate a development key hash   ####----->keytool -exportcert -alias androiddebugkey -keystore ~/.android/debug.keystore | openssl sha1 -binary | openssl base64                                                   
                                                      
 how to generate a release key hash       ####------>keytool -exportcert -alias YOUR_RELEASE_KEY_ALIAS -keystore YOUR_RELEASE_KEY_PATH | openssl sha1 -binary | openssl base64                                               
                                          ####------>keytool -exportcert -alias NewsApp_FaceBook_Key -keystore D:\my_private_key.keystore | openssl sha1 -binary | openssl base64 



et OPENSSL_CONF=C:\Program Files (x86)\openssl-0.9.8k_X64\openssl.cnf
=================================================================
Android Draft`s
==================
List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
Map<String,String>> map1 = new HashMap<String,String>();
map1.put("food", "pizza");
Map<String,String>> map2 = new HashMap<String,String>();
map2.put("drink", "coke");
Collections.addAll(mapList, map1, map2);

...

for (Map<String,String> map : mapList) {
    System.out.println("food is " + map.get("food"));
    System.out.println("drink is " + map.get("drink"));
}


--->gitting drawable Resources
      ---  String image_remind_me = this.activityContext.getResources().getIdentifier("@drawable/reminder_me_icon", "drawable", activityContext.getPackageName())+"";

==========================================
--->When your app restart or request new data from Webservers  In some cases you would not to override the current items 
    as Will override field with default faules 
    Case _1 when you have field like(Favourates field) and items are fetched from web services and some of them has been marked as fav in your Realm 
    ---so CopyOrUpdate will override those fields with  default values 
      --so if you wan`t to keep ol values
      do as this snnipest for example
          public void intializeCatList() {
        SourceCategores sourceCategores1 = new SourceCategores();
        sourceCategores1.setCatUrl("http://www.almasryalyoum.com/rss/rssfeeds");  /// Latest News  ///false
        sourceCategores1.setCatID(0);
        sourceCategores1.setSource_fk_id(0);
        sourceCategores1.setCatType(1);
        sourceCategores1.setSourceImg("http://www.sharkia.gov.eg/DocLib5/%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%89%20%D8%A7%D9%84%D9%8A%D9%88%D9%85.png");

        SourceCategores sourceCategores2 = new SourceCategores();
        sourceCategores2.setCatUrl("http://www.almasryalyoum.com/rss/rssfeeds?sectionId=3"); ///Egypt News
        sourceCategores2.setCatID(1);
        sourceCategores2.setSource_fk_id(0);
        sourceCategores2.setCatType(2);
        sourceCategores2.setSourceImg("http://www.sharkia.gov.eg/DocLib5/%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%89%20%D8%A7%D9%84%D9%8A%D9%88%D9%85.png");

        SourceCategores sourceCategores3 = new SourceCategores();
        sourceCategores3.setCatUrl("http://www.youm7.com/rss/SectionRss?SectionID=203");  ///Latest News
        sourceCategores3.setCatID(2);
        sourceCategores3.setSource_fk_id(1);
        sourceCategores3.setCatType(1);
        sourceCategores3.setSourceImg("http://www.youm7.com/images/footer/Logo-footer-2.png");

        SourceCategores sourceCategores4 = new SourceCategores();
        sourceCategores4.setCatUrl("http://www.youm7.com/rss/SectionRss?SectionID=298"); /// Sport
        sourceCategores4.setCatID(3);
        sourceCategores4.setSource_fk_id(1);
        sourceCategores4.setCatType(3);
        sourceCategores4.setSourceImg("http://www.youm7.com/images/footer/Logo-footer-2.png");

        SourceCategores sourceCategores5 = new SourceCategores();
        sourceCategores5.setCatUrl("http://www.youm7.com/rss/SectionRss?SectionID=332");   ///Global FootBall
        sourceCategores5.setCatID(4);
        sourceCategores5.setSource_fk_id(1);
        sourceCategores5.setCatType(3);
        sourceCategores5.setSourceImg("http://www.youm7.com/images/footer/Logo-footer-2.png");

        SourceCategores sourceCategores6 = new SourceCategores();
        sourceCategores6.setCatUrl("http://www.youm7.com/rss/SectionRss?SectionID=97"); //Egypt Reports
        sourceCategores6.setCatID(5);
        sourceCategores6.setSource_fk_id(1);
        sourceCategores6.setCatType(2);
        sourceCategores6.setSourceImg("http://www.youm7.com/images/footer/Logo-footer-2.png");

        SourceCategores sourceCategores7 = new SourceCategores();   ///Jazera glopal
        sourceCategores7.setCatUrl("http://www.aljazeera.net/aljazeerarss/be46a341-fe26-41f1-acab-b6ed9c198b19/e6aef64d-084c-42f0-8269-abe48e0cd154"); //Egypt Reports
        sourceCategores7.setCatID(6);
        sourceCategores7.setSource_fk_id(3);
        sourceCategores7.setCatType(2);
        sourceCategores7.setSourceImg("http://www.aljazeera.net/Content/images/headerlogo.png");

        SourceCategores sourceCategores8 = new SourceCategores();  ///Jazera Egypt Only
        sourceCategores8.setCatUrl("http://www.aljazeera.net/aljazeerarss/1ad2d9ce-e1d8-4623-85b4-662055191e42/a445e3fb-9f08-4f78-ac53-b22642756ddc"); //Egypt Reports
        sourceCategores8.setCatID(7);
        sourceCategores8.setSource_fk_id(3);
        sourceCategores8.setCatType(1);
        sourceCategores8.setSourceImg("http://www.aljazeera.net/Content/images/headerlogo.png");

        SourceCategores sourceCategores9 = new SourceCategores();  ///skyNews Egypt Only
        sourceCategores9.setCatUrl("http://www.skynewsarabia.com/web/rss.xml"); //skyNews glopal
        sourceCategores9.setCatID(8);
        sourceCategores9.setSource_fk_id(2);
        sourceCategores9.setCatType(2);
        sourceCategores9.setSourceImg("https://scontent-cai1-1.xx.fbcdn.net/v/t1.0-1/553925_421969167853415_181934826_n.jpg?oh=0c8874806dd63d089d27be445abc7922&oe=59511109");


        final RealmList<SourceCategores> sourceCategoresList = new RealmList<SourceCategores>();
        sourceCategoresList.add(sourceCategores1);
        sourceCategoresList.add(sourceCategores2);
        sourceCategoresList.add(sourceCategores3);
        sourceCategoresList.add(sourceCategores4);
        sourceCategoresList.add(sourceCategores5);
        sourceCategoresList.add(sourceCategores6);
        sourceCategoresList.add(sourceCategores7);
        sourceCategoresList.add(sourceCategores8);
        sourceCategoresList.add(sourceCategores9);

        try {
            MainApp.realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    MainApp.realm.copyToRealm(sourceCategoresList);
                    MainApp.realm.copyToRealmOrUpdate(sourceCategoresList); <-------- use this line if you wan`t to override what ever you wan`t
                }
            });

        } catch (Exception e) {
            Log.e("SourceListModel", "-------------->" + e.getMessage());
        }


    }

     public void saveFeedItemToRealm(FeedItem feedItem) {
        try {
            int id = getSingleNewsItem(feedItem.getId()).getId();
            if (id < 0) {   ///items already exsist don't override it 

            }
        }catch (Exception e)
        {
            MainApp.realm.beginTransaction();  //// intialize item 
            MainApp.realm.copyToRealmOrUpdate(feedItem); // Persist unmanaged objects
            MainApp.realm.commitTransaction();

        }


    }


    ===================================
    name.equals("Rumplestiltskin") ? System.out.println("Give back child") : System.out.println("Laugh");
The first argument to the conditional operator must have 
or return boolean type and the second and third arguments must return values compatible with the value the entire expression can be expected to return.
 You can never use a void method as an argument to the ? : operator.



 apply plugin: 'com.android.application'
apply plugin: 'realm-android'
android {
    compileSdkVersion 25
    buildToolsVersion "25.0.3"
    defaultConfig {
        applicationId "com.example.ddopi.numuu"
        minSdkVersion 15
        targetSdkVersion 25
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    sourceSets {
        main {
            res.srcDirs =
                    [
                            'src/main/res/layouts/view_pager_section',
                            'src/main/res/layouts',
                            'src/main/res'
                    ]
        }
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:25.3.1'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'

    ///FaceBook Sdk
    compile 'com.facebook.android:facebook-android-sdk:[4,5)'

////ButterKnif
    compile 'com.jakewharton:butterknife:8.6.0'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.6.0'

    ///stetho
    // compile 'com.uphyca:stetho_realm:0.9.0'
    compile 'io.reactivex:rxjava:1.1.0'
    compile 'com.facebook.stetho:stetho:1.4.1'
    compile 'com.uphyca:stetho_realm:2.0.0'
    ////
///Volly
    compile 'com.android.volley:volley:1.0.0'
    ///
    compile 'com.github.bumptech.glide:glide:3.7.0'
    compile 'com.android.support:design:25.3.1'
    compile 'com.google.dagger:dagger:2.8'
    compile 'com.google.code.gson:gson:2.6.2'
    compile 'com.android.support:support-v4:25.3.0'
    testCompile 'junit:junit:4.12'
    provided 'javax.annotation:jsr250-api:1.0'
    testCompile 'junit:junit:4.12'
}
