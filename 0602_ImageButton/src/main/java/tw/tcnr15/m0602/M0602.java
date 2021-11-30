package tw.tcnr15.m0602;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0602 extends AppCompatActivity {

    private ImageView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private ImageButton btnscissors,btnstone,btnnet;

    private String user_select;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0602);
        setupViewComponent();
    }

    private void setupViewComponent() {
        txtComPlay = (ImageView)findViewById(R.id.m0602_c001);       //電腦選擇
        txtSelect = (TextView)findViewById(R.id.m0602_s001);           //選擇結果
        txtResult = (TextView)findViewById(R.id.m0602_f000);        //輸贏判斷
        btnscissors = (ImageButton)findViewById(R.id.m0602_b001);       //剪刀
        btnstone = (ImageButton)findViewById(R.id.m0602_b002);            //石頭
        btnnet = (ImageButton)findViewById(R.id.m0602_b003);               //布

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
                    txtComPlay.setImageResource(R.drawable.scissors);
                    break;
                case 2:
                    txtComPlay.setImageResource(R.drawable.stone);
                    break;
                case 3:
                    txtComPlay.setImageResource(R.drawable.net);
                    break;
            }
            switch (v.getId()){
                case R.id.m0602_b001:                                         //玩家選剪刀
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f003);       //平
                            txtResult.setTextColor(Color.YELLOW);                                           //平手的黃色

                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f002);        //輸
                            txtResult.setTextColor(Color.RED);                                               //輸的紅色
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f001);         //贏
                            txtResult.setTextColor(Color.GREEN);                                           //贏的綠色
                            break;
                    }

                    user_select=getString(R.string.m0602_s001)+" "+getString(R.string.m0602_b001);
                    break;
                case R.id.m0602_b002:                                       //玩家選擇石頭
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f001);       //贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f003);       //平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f002);       //輸
                            txtResult.setTextColor(Color.RED);
                            break;
                    }
                    user_select=getString(R.string.m0602_s001)+" "+getString(R.string.m0602_b002);
                    break;
                case R.id.m0602_b003:                                             //玩家選擇布
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f002);      //輸
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f001);      //贏
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
                            answer=getString(R.string.m0602_f000)+getString(R.string.m0602_f003);        //平手
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                    }
                    user_select=getString(R.string.m0602_s001)+" "+getString(R.string.m0602_b003);
                    break;

            }
            txtSelect.setText(user_select);                                    //選擇結果
            txtResult.setText(answer);                                         //判斷輸贏
        }


    };
}