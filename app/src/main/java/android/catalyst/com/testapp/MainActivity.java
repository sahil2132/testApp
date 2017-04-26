package android.catalyst.com.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToActivity2(View view){
        View rootView = this.findViewById(android.R.id.content).getRootView();
        Log.wtf("ROOT VIEW",rootView.toString());

        ViewGroup viewGroup = (ViewGroup) view.getParent();
        Log.wtf("ROOT VIEW",viewGroup.getChildCount()+"");

//        WebView webView1 = (WebView) findViewById(R.id.webView);
//        webView1.getSettings().setJavaScriptEnabled(true);
//        webView1.loadUrl("http://www.google.co.in/");
//        Intent intent2  = new Intent(this,Activity2.class);
//        startActivity(intent2);
    }
}
