package wyw.com.calendardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import wyw.com.calendardemo.common.OnItemClickListener;

public class MainActivity extends AppCompatActivity implements ClendarView.CallBackListener {

    private ClendarView clendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String, String> dataMap = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 1)), "吃饭");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 11)), "睡觉");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 16)), "打豆豆");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 21)), "继续睡觉");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 9)), "来啊，继续浪");
        dataMap.put(sdf.format(new Date(2018-1900, 5, 30)), "打豆豆");

        clendarView = findViewById(R.id.clendarView);

        clendarView.setCallBackListener(this);
        clendarView.setDataMap(dataMap);

    }


    @Override
    public void callBack(Object object, int positon) {

        ClendarInfo clendarInfo = (ClendarInfo) object;
        Toast.makeText(this, clendarInfo.getDate().getDate() + "号" + clendarInfo.getDoThing(), Toast.LENGTH_SHORT).show();

    }
}
