
//            FrameLayout singleNewsFragment=(FrameLayout) mainView.findViewById(R.id.single_news_fragmenty);
//            singleNewsFragment.setVisibility(View.VISIBLE);
//            listView.setVisibility(View.INVISIBLE);

//            SingleNewsActivity singleNewsActivity = new SingleNewsActivity();
//            getActivity().getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.single_news_fragmenty, singleNewsActivity, null)
//                    .addToBackStack(null)
//                    .commit();

//            final FragmentTransaction ft = getFragmentManager().beginTransaction();
//            ft.add(R.id.single_news_fragmenty, new SingleNewsActivity(), "NewFragmentTag");
//            ft.commit();

//            FragmentManager fm = getFragmentManager();
//            FragmentTransaction fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(singleNewsFragment, singleNewsActivity);
//            fragmentTransaction.commit();
    //////////////////////////////////////////////////////////////////////////////
               @Override  ----------->this method opens dialog on back button 
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit Nomw?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        HomeActivity.super.onBackPressed();
                        moveTaskToBack(true); <------if you want app be closed if back pressed on current activity use this line and remove it if you      
                    }                           -----wan`t close only current App
                }).create().show();
    }

    //////////////////////////////////////////////////////////////////////////////
        @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit Nomw?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        HomeActivity.super.onBackPressed();
                        moveTaskToBack(true);
                    }
                }).create().show();
    }

    ////////////////////////////////////////////////////
    Simple Iteratot//
    ////////////////
            for (CityWeather_Item item : CityWeather_Items) {
            arrayList.add(item);
        }
    //////////////////////////////////////////////////

    
    Refreashed ViewPagerAdapter ============
    ========================================
        @OnClick(R.id.refreash_btn)
    public void refreshActivityBtn() {
        adapter.notifyDataSetChanged();

    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
///////////////////////////////////////////////////////////////////////////