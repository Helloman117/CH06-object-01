package tw.tcnr15.m0608;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class M0608 extends AppCompatActivity {

    private Button b000, b001, b002, b003, b004;
    private Button b005, b006, b007, b008, b009,b010;
    private Button b011, b012, b013, b014, b015;
    private TextView num1,ans;
    private double nn;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0608);
        setupViewComponent();
    }

    private void setupViewComponent() {

        b000 = (Button)findViewById(R.id.m0608_b000);
        b001 = (Button)findViewById(R.id.m0608_b001);
        b002 = (Button)findViewById(R.id.m0608_b002);
        b003 = (Button)findViewById(R.id.m0608_b003);
        b004 = (Button)findViewById(R.id.m0608_b004);
        b005 = (Button)findViewById(R.id.m0608_b005);
        b006 = (Button)findViewById(R.id.m0608_b006);
        b007 = (Button)findViewById(R.id.m0608_b007);
        b008 = (Button)findViewById(R.id.m0608_b008);
        b009 = (Button)findViewById(R.id.m0608_b009);
        b010 = (Button)findViewById(R.id.m0608_b010);
        b011 = (Button)findViewById(R.id.m0608_b011);
        b012 = (Button)findViewById(R.id.m0608_b012);
        b013 = (Button)findViewById(R.id.m0608_b013);
        b014 = (Button)findViewById(R.id.m0608_b014);
        b015 = (Button)findViewById(R.id.m0608_b015);

        num1=(TextView)findViewById(R.id.m0608_t001);
        ans=(TextView)findViewById(R.id.m0608_t002);


        b000.setOnClickListener(numberON);
        b001.setOnClickListener(numberON);
        b002.setOnClickListener(numberON);
        b003.setOnClickListener(numberON);
        b004.setOnClickListener(numberON);
        b005.setOnClickListener(numberON);
        b006.setOnClickListener(numberON);
        b007.setOnClickListener(numberON);
        b008.setOnClickListener(numberON);
        b009.setOnClickListener(numberON);
        b010.setOnClickListener(numberON);

        b011.setOnClickListener(CALON);
        b012.setOnClickListener(CALON);
        b013.setOnClickListener(CALON);
        b014.setOnClickListener(CALON);

        b015.setOnClickListener(equalON);




    }
        private View.OnClickListener numberON = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyin = num1.getText().toString();
                switch (v.getId()){
                    case R.id.m0608_b000:
                        num1.setText(keyin+"0");
                        break;
                    case R.id.m0608_b001:
                        num1.setText(keyin+"1");
                        break;
                    case R.id.m0608_b002:
                        num1.setText(keyin+"2");
                        break;
                    case R.id.m0608_b003:
                        num1.setText(keyin+"3");
                        break;
                    case R.id.m0608_b004:
                        num1.setText(keyin+"4");
                        break;
                    case R.id.m0608_b005:
                        num1.setText(keyin+"5");
                        break;
                    case R.id.m0608_b006:
                        num1.setText(keyin+"6");
                        break;
                    case R.id.m0608_b007:
                        num1.setText(keyin+"7");
                        break;
                    case R.id.m0608_b008:
                        num1.setText(keyin+"8");
                        break;
                    case R.id.m0608_b009:
                        num1.setText(keyin+"9");
                        break;
                    case R.id.m0608_b010:
                        num1.setText(keyin+".");
                        break;
                }

            }
        };


    private View.OnClickListener CALON = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try{
                nn= Double.parseDouble(num1.getText().toString());

            }catch (Exception e){
                Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_LONG).show();

            }

            num1.setText("");
            switch (v.getId()){
                case R.id.m0608_b011:
                    s ="P";
                    break;
                case R.id.m0608_b012:
                    s ="m";
                    break;
                case R.id.m0608_b013:
                    s ="x";
                    break;
                case R.id.m0608_b014:
                    s ="d";
                    break;
            }

        }
    };
    private View.OnClickListener equalON = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(num1.getText().toString().trim().length()!=0){
                double n2=Double.parseDouble(num1.getText().toString());
                DecimalFormat nf = new DecimalFormat("0.0000");

                if(s.equals("P"))ans.setText(nf.format(nn + n2));
                if(s.equals("m"))ans.setText(nf.format(nn-n2));
                if(s.equals("x"))ans.setText(nf.format(nn*n2));
                if(s.equals("d"))ans.setText(nf.format(nn/n2));


               num1.setText("");
               nn=0;


            }else {Toast.makeText(getApplicationContext(),R.string.m0608_error,Toast.LENGTH_LONG).show();

            }

        }
    };

}
