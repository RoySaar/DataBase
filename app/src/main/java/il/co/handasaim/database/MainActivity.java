package il.co.handasaim.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitHandler(View v) {
        UsersOpenHelper usersOpenHelper = new UsersOpenHelper(this);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String name = editText.getText().toString();
        String email = editText2.getText().toString();
        int age = Integer.parseInt(editText3.getText().toString());
        usersOpenHelper.InsertUser(name, email, age);
        Toast.makeText(this,"User succesfully inserted",Toast.LENGTH_SHORT).show();
    }
}
