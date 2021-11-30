package tw.tcnr15.m0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M0607 extends AppCompatActivity {

    private Button btn001,btn002,btn003,btn004,btn005,btn006,btn007;
    private String modotitle;
    private Intent intent =new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0607);
        setupViewComponent();
    }

    private void setupViewComponent() {
        Intent intent=this.getIntent();



        btn001 = (Button)findViewById(R.id.m0607_b001);
        btn002 = (Button)findViewById(R.id.m0607_b002);
        btn003 = (Button)findViewById(R.id.m0607_b003);
        btn004 = (Button)findViewById(R.id.m0607_b004);
        btn005 = (Button)findViewById(R.id.m0607_b005);
        btn006 = (Button)findViewById(R.id.m0607_b006);
        btn007 = (Button)findViewById(R.id.m0607_b007);

        btn001.setOnClickListener(b001On);
        btn002.setOnClickListener(b001On);
        btn003.setOnClickListener(b001On);
        btn004.setOnClickListener(b001On);
        btn005.setOnClickListener(b001On);
        btn006.setOnClickListener(b001On);
        btn007.setOnClickListener(b001On);

    }


    private View.OnClickListener b001On= new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.m0607_b001:
                    intent.putExtra("class_title", getString(R.string.m0000_b0500));
                    intent.setClass(M0607.this,M0500.class);

                    break;
                case R.id.m0607_b002:
                    intent.putExtra("class_title", getString(R.string.m0000_b0501));
                    intent.setClass(M0607.this,M0501.class);
                    break;
                case R.id.m0607_b003:
                    intent.putExtra("class_title", getString(R.string.m0000_b0502));
                    intent.setClass(M0607.this,M0502.class);
                    break;
                case R.id.m0607_b004:
                    intent.putExtra("class_title", getString(R.string.m0000_b0504));
                    intent.setClass(M0607.this,M0504.class);
                    break;
                case R.id.m0607_b005:
                    intent.putExtra("class_title", getString(R.string.m0000_b0505));
                    intent.setClass(M0607.this,M0505.class);
                    break;
                case R.id.m0607_b006:
                    intent.putExtra("class_title", getString(R.string.m0000_b0604));
                    intent.setClass(M0607.this,M0604.class);
                    break;
                case R.id.m0607_b007:
                    intent.putExtra("class_title", getString(R.string.m0000_b0606));
                    intent.setClass(M0607.this,M0606.class);
                    break;


            }
                 startActivity(intent);
        }
    };
}