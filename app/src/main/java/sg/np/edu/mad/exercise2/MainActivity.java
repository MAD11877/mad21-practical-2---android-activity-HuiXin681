package sg.np.edu.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    User = new newUser { "Hui Xin", "It student", 1, flase}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView name = findViewById(R.id.name);
        name.setText(newUser.name);
        
        TextView desc = findViewById(R.id.fillerText);
        desc.setText(newUser.desc);
    }

    public void followUnfollow(View view){
        Button followBtn = findViewById(R.id.follow);
        if (followBtn.getText() == "Follow"){
            followBtn.setText("Unfollow");
        }
        else{
            followBtn.setText("Follow");
        }

    }
}
