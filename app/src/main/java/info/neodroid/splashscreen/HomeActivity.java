package info.neodroid.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HomeActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        wv= (WebView) findViewById(R.id.webb);
        WebSettings ww = wv.getSettings();
        ww.setJavaScriptEnabled(true);
        wv.loadDataWithBaseURL(null,"<script>   </script>","text/html","utf-8",null);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv.loadUrl("file:///android_asset/index.html");

    }
}
