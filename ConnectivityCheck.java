  ImageView iv;
  iv = (ImageView) findViewById(R.id.icon);
  iv.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          ConnectivityManager mConMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
          NetworkInfo mNetworkInfo = mConMgr.getActiveNetworkInfo();
          if (mNetworkInfo != null && mNetworkInfo.isConnected()) {
              System.out.println("Yes Connected");
          } else {
              System.out.println("Not Connected");
          }
      }
  });