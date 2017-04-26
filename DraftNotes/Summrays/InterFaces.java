Why we need interfaces in Mvp ???
===================================

1-Every Class should have Interface or two as
  
--->one charctrizing the Class and represent it 
--->one defines Class operation and capability and how it will interacr with other classes.



=====================



  /**  this interface all it's method are implemented in ViewLayer
       those method are defines the class identity 

     * Required View methods available to Presenter.
     * A passive layer, responsible to show data
     * and receive user interactions
     */
    interface RequiredViewOps {         // View operations permitted to Presenter
            Context getAppContext();
            Context getActivityContext();
            void notifyItemInserted(int layoutPosition);
            void notifyItemRangeChanged(int positionStart, int itemCount);
    }

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener, MVP_Main.RequiredViewOps {    /////--->This is the view Layer 
    	                                                          /////--->MVP_Main.RequiredViewOps --->this interface Defines the  view class
 
    private MVP_Main.ProvidedPresenterOps mPresenter;            /////--->this is how ((View_layer))  Processe and operates actions

    @Override
    public Context getActivityContext() {
        return this;
    }
 
    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }
    // Notify the RecyclerAdapter that a new item was inserted
    @Override
    public void notifyItemInserted(int adapterPos) {
        mListAdapter.notifyItemInserted(adapterPos);
    }

}





public class MainPresenter implements MVP_Main.ProvidedPresenterOps, MVP_Main.RequiredPresenterOps { ///////--->this is Presenter Layer
 
    // View reference. We use as a WeakReference
    // because the Activity could be destroyed at any time
    // and we don't want to create a memory leak
    private WeakReference<MVP_Main.RequiredViewOps> mView;    
    private MVP_Main.ProvidedModelOps mModel;                ////--->Model reference
 
     /**
     * Presenter Constructor
     * @param view  MainActivity
     */
    public MainPresenter(MVP_Main.RequiredViewOps view) {
        mView = new WeakReference<>(view);
    }

/**
     * Return the View reference.
     * Throw an exception if the View is unavailable.
     */
    private MVP_Main.RequiredViewOps getView() throws NullPointerException{
        if ( mView != null )
            return mView.get();
        else
            throw new NullPointerException("View is unavailable");
    }////////----------- WTF //////////////??????????????????????????????.


(((^___^))) ---> What happened is that :-

1-this Presenter needs the contextView of View_Activity
2-Now how the presenter will get ViewContext ???
--->Yes view intilize it when he call this Presenter good
    Now we have contextView Referance in mView,
    whenever View intilized we intialize PresenterConstructor(),
    but presenter methods are not always instasncelly intialize according to View actions
    so we are Hold it in WeakReference .

3-getView is just a name of (MVP_Main.RequiredViewOps)--->Type 
Now don't be confused it is just like any other mehod 
let us take an example with 
int main()
{
	return 1;
}

Remember when you define new obj
Class c1=new Class();
--->c1 variable of Type--->Class 
--->its content must be acceptable for Class_Type

Now for int main(){};
--->main is method name of Type--->int
--->its content must be acceptable for Int_type //////mehod will return number<0 or 1>;


And--->for MVP_Main.RequiredViewOps getView(){   return mView.get() _}_;

--->getView is method name of Type--->MVP_Main.RequiredViewOps
--->its content must be acceptable for MVP_Main.RequiredViewOps ---> mehod will return (((mView.get()))
-----as--->mViw.get() will retun interface mehod with it's implementations.

}
1
======================================
