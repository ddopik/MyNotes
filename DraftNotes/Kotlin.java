  
  Kotlin Notes
  ==============

   var nullableGreeting: String? = null
  To allow null values, you have to declare a variable as nullable by appending a question mark in its type declaration 


---->  X ?. Y()     "_?._" ----> y() if x Not equal null get Y


---->var dashBoardPresenter : DashBoadrPresenter ? = null   
                                                  "? =null"  ---> variable  Can be null 

  In Kotlin, the type system distinguishes between references that can hold null (nullable references) and those that can not (non-null references). 
  For example, a regular variable of type String can not hold null
 

---->a!!.length
     will return a non-null value of a.length or throw a NullPointerException if a is null:
Ex :
val a: String? = null
print(a!!.length) // >>> NPE: trying to get length of null


---->The Elvis operator allows you to provide an alternative value when an expression to the left of the operator is null:
     val surelyXyz: Xyz = makeXyzOrNull() ?: DefaultXyz()





Code InLine
================
ResourcesCompat.getDrawable(resources, R.drawable.ic_favorite_orange_24dp, null)
---->placeLocation.longitude = experienceInner.lng?.toDouble() ?: 0.0
 --->main_review_profile_name.text= context?.let { PrefsUtil.getUserName(it) } ?:"user name" 



coroutines in Kotlin



    
           context?.let {  GlideApp.with(it)
                .load(reviewList[i].user?.profilePhoto)
                .centerCrop()
                .into(viewHolder.reviewUserImage)
        }

          startActivity(Intent(context, AddPlaceActivity::class.java))


        val hashMapData = intent.getSerializableExtra(ADVANCED_SEARCH_DATA) as HashMap<String, String>

        GlideApp.with(context).load(homeCampaign.business.thumbnail).apply(RequestOptions.circleCropTransform()).into(campaignViewHolder.campaignBusinessIcon);


    
         takeIf{somecondition}?.also{put somecondition is met code}?:run{put your else code here}



         photoFilesList.let{
                for (i in 0 until photoFilesList.size) {
                    fileListNew["${BaseNetworkApi.IMAGES}[$i]"] = photoFilesList!![i]
                }
            }


        Gallery instead of Gallary.
        The map only shows when you touch the screen.
        The button is not working
        Menu icon extra upper part to be removed.
        The logo is cut.
        App. external logo showing.
        No Data and No slider photos. We need to have an overlaid screen including the "How to use App."