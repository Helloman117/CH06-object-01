package tw.tcnr15.m0601;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M0601 extends AppCompatActivity {

    private TextView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private Button btnscissors,btnstone,btnnet;

    private String user_select;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0601);
        setupViewComponent();
    }

    private void setupViewComponent() {
        txtComPlay = (TextView)findViewById(R.id.m0601_c001);       //電腦選擇
        txtSelect = (TextView)findViewById(R.id.m0601_s001);           //選擇結果
        txtResult = (TextView)findViewById(R.id.m0601_f000);        //輸贏判斷
        btnscissors = (Button)findViewById(R.id.m0601_b001);       //剪刀
        btnstone = (Button)findViewById(R.id.m0601_b002);            //石頭
        btnnet = (Button)findViewById(R.id.m0601_b003);               //布

        btnscissors.setOnClickListener(btn01On);
        btnstone.setOnClickListener(btn01On);
        btnnet.setOnClickListener(btn01On);



    }



    private View.OnClickListener btn01On=new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            int icomp = (int) (Math.random() * 3 + 1);
            //剪刀,石頭,布 random
            switch (icomp){
                case 1:
                    txtComPlay.setText(R.string.m0601_b001);
                    break;
                case 2:
                    txtComPlay.setText(R.string.m0601_b002);
                    break;
                case 3:
                    txtComPlay.setText(R.string.m0601_b003);
                    break;
            }
            switch (v.getId()){
                case R.id.m0601_b001:                                         //玩家選剪刀
                    switch (icomp){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f003);       //平
                            break;
                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f002);        //輸
                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f001);         //贏
                            break;
                    }

                    user_select=getString(R.string.m0601_s001)+" "+getString(R.string.m0601_b001);
                    break;
                case R.id.m0601_b002:                                       //玩家選擇石頭
                    switch (icomp){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f001);       //贏
                            break;
                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f003);       //平手
                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f002);       //輸
                            break;
                    }
                    user_select=getString(R.string.m0601_s001)+" "+getString(R.string.m0601_b002);
                    break;
                case R.id.m0601_b003:                                             //玩家選擇布
                    switch (icomp){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f002);      //輸
                            break;
                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f001);      //贏
                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            answer=getString(R.string.m0601_f000)+getString(R.string.m0601_f003);        //平手
                            break;
                    }
                    user_select=getString(R.string.m0601_s001)+" "+getString(R.string.m0601_b003);
                    break;

            }
            txtSelect.setText(user_select);                                    //選擇結果
            txtResult.setText(answer);                                         //判斷輸贏
        }


    };
}