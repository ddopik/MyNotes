Genereate SH1 key :7
--->
keytool -list -v -keystore "C:\Users\ddopik\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android


PopsUp your Fragment from context
   --->activity?.supportFragmentManager?.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

activity?.baseContext?.startActivity(activity?.baseContext?.intentFor<HomeActivity>()?.newTask())

--->int x=((ANError)throwable).getErrorCode();

    advancedSearchPlaceAdapter?.placesAction=object :AdvancedSearchPlaceAdapter.PlacesAction{
            override fun onPlaceClicked(placeId: String) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }


arguments?.get("REVIEW_ID").let {
            initPresenter()
            initViews()
            initListeners()
        }
 


////------------>Send
  Intent intent=new Intent(this,UploadImageActivity.class);
            Bundle extras = new Bundle();
            HashMap<String, String> imageType=new HashMap<String, String>();
            imageType.put(CAMPAIGN_ID,campaignId);
            extras.putSerializable(UploadImageActivity.IMAGE_TYPE,imageType);
            intent.putExtras(extras);
            startActivity(intent);


////------------>Recive
Bundle bundle = this.getIntent().getExtras();
        assert bundle != null;
        if (bundle.getSerializable(IMAGE_TYPE) != null) {
            HashMap<String, String> imageType =(HashMap<String, String>) bundle.getSerializable(IMAGE_TYPE);
            GalleryImageFragment galleryImageFragment = GalleryImageFragment.getInstance(imageType);
            addFragment(R.id.upload_img_container, galleryImageFragment, GalleryImageFragment.class.getSimpleName(), false);
        }

 for (type var : array) 
{ 
    statements using var;
}


for (item in collection) {
    // body of loop
}

Uri.fromFile(new File("/sdcard/sample.jpg"))


   GlideApp.with(context)
                    .load(previewItem.url)
                    .error(R.drawable.default_error_img)
                    .placeholder(R.drawable.default_place_holder)
                    .override(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
                    .apply(RequestOptions.circleCropTransform())
                    .into(pickImage);




import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.example.ddopik.phlogbusiness.R;                    
GlideApp.with(this)
                .load(brand.imageCover)
                .placeholder(R.drawable.default_place_holder)
                .error(R.drawable.default_error_img)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        // log exception
                        bramdProfileCoverImg.setBackground(getResources().getDrawable(R.drawable.default_error_img));

                        return false; // important to return false so the error placeholder can be placed
                    }
                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        bramdProfileCoverImg.setBackground(resource);
                        return false; }});


  BaseNetworkApi.getPhotoGrapherSavedPhotos(Page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(photoGrapherPhotosResponse -> {
                    photoGrapherSavedPhotosFragmentView.showSavedPhotos(photoGrapherPhotosResponse.data.data);
                }, throwable -> {
                    ErrorUtils.setError(context, TAG, throwable.toString());
                });


public Observable<List<ServicesLocation>> getServiceLocationByLocation(int locationID) {
        return Observable.create(e -> {
            List<ServicesLocation> servicesLocationList = new ArrayList<>();
            for (ServicesLocation servicesLocation : getServicesLocations()) {
                if (servicesLocation.getLocation().getId() == locationID) {
                    servicesLocationList.add(servicesLocation);
                }
            }
            e.onNext(servicesLocationList);
            e.onComplete();
        });
    }



 