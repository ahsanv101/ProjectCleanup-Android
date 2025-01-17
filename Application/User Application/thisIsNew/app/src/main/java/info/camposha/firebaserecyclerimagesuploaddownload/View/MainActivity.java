package info.camposha.firebaserecyclerimagesuploaddownload.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.auth.FirebaseAuth;


import info.camposha.firebaserecyclerimagesuploaddownload.R;

public class MainActivity extends AppCompatActivity {
    private Button openTeachersActivityBtn,openUploadActivityBtn, logoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        openTeachersActivityBtn = findViewById ( R.id.openTeachersActivityBtn );
        openUploadActivityBtn = findViewById ( R.id.openUploadActivityBtn );
        logoutBtn = findViewById(R.id.logoutBtn);
        openTeachersActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ItemsActivity.class);
                startActivity(i);
            }
        });
        openUploadActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, UploadActivity.class);
                startActivity(i);
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(MainActivity.this, login.class);
                startActivity(i);
            }
        });

    }


}
