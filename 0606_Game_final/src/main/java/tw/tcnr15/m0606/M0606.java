package tw.tcnr15.m0606;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class M0606 extends AppCompatActivity {

    private ImageView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private ImageButton btnscissors,btnstone,btnnet;

    private String user_select;
    private String answer;
    private MediaPlayer startmusic,mediawin,medialose,mediavctory,mediaend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0606);
        setupViewComponent();
    }

    private void setupViewComponent() {
        txtComPlay = (ImageView)findViewById(R.id.m0606_c001);       //電腦選擇
        txtSelect = (TextView)findViewById(R.id.m0606_s001);           //選擇結果
        txtResult = (TextView)findViewById(R.id.m0606_f000);        //輸贏判斷
        btnscissors = (ImageButton)findViewById(R.id.m0606_b001);       //剪刀
        btnstone = (ImageButton)findViewById(R.id.m0606_b002);            //石頭
        btnnet = (ImageButton)findViewById(R.id.m0606_b003);               //布


        //開頭音樂
        // --開啟片頭音樂-----
//        startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
//        startmusic.start();
         startmusic = MediaPlayer.create(getApplication(),R.raw.guess);
         startmusic.start();
         mediawin = MediaPlayer.create(getApplication(),R.raw.haha);
        medialose= MediaPlayer.create(getApplication(),R.raw.lose);
        mediavctory= MediaPlayer.create(getApplication(),R.raw.vctory);
        mediaend = MediaPlayer.create(getApplication(),R.raw.yt1);

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

                case R.id.m0606_b001:                                         //玩家選剪刀
                    user_select=getString(R.string.m0606_s001)+" "+getString(R.string.m0606_b001);
                    u_01();
                    btnscissors.getBackground().setAlpha(150);
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f003);       //平
//                            txtResult.setTextColor(Color.YELLOW);                                           //平手的黃色

                            music(3);

                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f002);        //輸
//                            txtResult.setTextColor(Color.RED);                                               //輸的紅色
                            music(2);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f001);         //贏
//                            txtResult.setTextColor(Color.GREEN);                                           //贏的綠色
                            music(1);
                            break;
                    }



                    
                    
                    break;
                case R.id.m0606_b002:                                       //玩家選擇石頭
                    user_select=getString(R.string.m0606_s001)+" "+getString(R.string.m0606_b002);
                    u_01();
                    btnstone.getBackground().setAlpha(150);
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f001);       //贏
//                            txtResult.setTextColor(Color.GREEN);
                            music(1);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f003);       //平手
//                            txtResult.setTextColor(Color.YELLOW);
                            music(3);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f002);       //輸
//                            txtResult.setTextColor(Color.RED);
                            music(2);
                            break;
                    }

                    break;
                case R.id.m0606_b003:                                             //玩家選擇布
                    user_select=getString(R.string.m0606_s001)+" "+getString(R.string.m0606_b003);
                    u_01();
                    btnnet.getBackground().setAlpha(150);
                    switch (icomp){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f002);      //輸
//                            txtResult.setTextColor(Color.RED);
                            music(2);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f001);      //贏
//                            txtResult.setTextColor(Color.GREEN);
                            music(1);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
//                            answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f003);        //平手
//                            txtResult.setTextColor(Color.YELLOW);
                            music(3);
                            break;
                    }

                    break;

            }
            txtSelect.setText(user_select);                                    //選擇結果
            txtResult.setText(answer);                                         //判斷輸贏
        }


    };

    private void u_01() {
//        //imageButton 背景為銀色且為全透明
//        btnScissors.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver));
//        btnScissors.getBackground().setAlpha(0); //0-255
//        btnStone.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver));
//        btnStone.getBackground().setAlpha(0);
//        btnNet.setBackgroundColor(ContextCompat.getColor(this, R.color.Silver));
//        btnNet.getBackground().setAlpha(0);
        btnscissors.setBackgroundColor(Color.GRAY);
        btnscissors.getBackground().setAlpha(0);
        btnstone.setBackgroundColor(Color.GRAY);
        btnstone.getBackground().setAlpha(0);
        btnnet.setBackgroundColor(Color.GRAY);
        btnnet.getBackground().setAlpha(0);
    }

    private void music(int i) {
        if(startmusic.isPlaying()) startmusic.stop();
        if(mediawin.isPlaying()) startmusic.pause();
        if(medialose.isPlaying()) startmusic.pause();
        if(mediavctory.isPlaying()) startmusic.pause();



        switch (i){
            case 1:    mediawin.start();        //贏
                answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f001);       //贏
                txtResult.setTextColor(Color.GREEN);                                           //贏的綠色
                Toast.makeText(getApplicationContext(),getText(R.string.m0606_f001),Toast.LENGTH_SHORT).show();

                break;

                case 2: medialose.start();         //輸
                    answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f002);        //輸
                    txtResult.setTextColor(Color.RED);                                               //輸的紅色
                    Toast.makeText(getApplicationContext(),getText(R.string.m0606_f002),Toast.LENGTH_SHORT).show();
                break;
                case 3:mediavctory.start();      //平手
                    answer=getString(R.string.m0606_f000)+getString(R.string.m0606_f003);         //贏
                    txtResult.setTextColor(Color.YELLOW);                                           //平手的綠色
                    Toast.makeText(getApplicationContext(),getText(R.string.m0606_f003),Toast.LENGTH_SHORT).show();
                break;
            case 4:mediaend.start();
            break;
        }
    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        this.finish();
//    }

    @Override
    protected void onStop() {
        super.onStop();
        if(startmusic.isPlaying()) startmusic.stop();                                         //關機音樂

        music(4);
    }
}