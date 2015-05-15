package com.example.luke.receiptmanager;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


//Copied from Logan Mabbett's PhotoMosaic Project.

//    String mPhotoFileName = "";
//    File mPhotoFile = null;
//    Uri mPhotoFileUri;

//    void setup() {
//
//        Button btnPhoto = (Button)findViewById(R.id.btnPhotoIntent);
//        btnPhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mPhotoFile = CreateUniqueFile();
//                mPhotoFileName = mPhotoFile.getName();
//
//                mPhotoFileUri = Uri.fromFile(mPhotoFile);
//
//                Intent imageCaptureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                imageCaptureIntent.putExtra(MediaStore.EXTRA_OUTPUT, mPhotoFileUri);
//
//                startActivityForResult(imageCaptureIntent, 1);
//            }
//        });
//    }
//
//    File CreateUniqueFile() {
//        File imageRootPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
//
//        File imageStorageDirectory = new File(imageRootPath, "PhotoMosaic");
//        if (!imageStorageDirectory.exists()) {
//            imageStorageDirectory.mkdirs();
//        }
//
//        SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
//        Date currTime = new Date();
//        String timeStamp = timestampFormat.format(currTime);
//
//        String photoFileName = "IMG_" + timeStamp + ".jpg";
//
//        File photoFile = new File(imageStorageDirectory.getPath() + File.separator + photoFileName);
//
//        return photoFile;
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        //Camera intent request
//        if (requestCode == 1) {
//            if (resultCode == RESULT_OK) {
//
//                String realFilePath = mPhotoFile.getPath();
//
//                Bitmap userPhotoBitmap = BitmapFactory.decodeFile(realFilePath);
//
//                int[] imageViews = new int[] {R.id.ivML, R.id.ivMR, R.id.ivUL, R.id.ivUR};
//
//                for (int id : imageViews) {
//                    ImageView imgView = (ImageView)findViewById(id);
//                    imgView.setImageBitmap(userPhotoBitmap);
//                }
//
//            } else {
//                Toast.makeText(this, "No photo saved.", Toast.LENGTH_LONG).show();
//            }
//        }
//    }

}
