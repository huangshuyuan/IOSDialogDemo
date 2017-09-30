package com.hsy.ios.iosdilog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.hsy.ios.iosdialoglibrary.ActionSheetDialog;
import com.hsy.ios.iosdialoglibrary.ActionSheetDialog.OnSheetItemClickListener;
import com.hsy.ios.iosdialoglibrary.ActionSheetDialog.SheetItemColor;
import com.hsy.ios.iosdialoglibrary.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn1) {
            new ActionSheetDialog(this)
                    .builder()
                    .setTitle("清空消息列表后，聊天记录依然保留，确定要清空消息列表？")
                    .setCancelable(false)
                    .setCanceledOnTouchOutside(false)//设置点击区域外是否消失
                    .addSheetItem("清空消息列表", SheetItemColor.Red,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            }).show();

        } else if (i == R.id.btn2) {
            new ActionSheetDialog(this)
                    .builder()
                    .setCancelable(false)
                    .setCanceledOnTouchOutside(false)
                    .addSheetItem("发送给好友", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            })
                    .addSheetItem("转载到空间相册", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            })
                    .addSheetItem("上传到群相册", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            })
                    .addSheetItem("保存到手机", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            })
                    .addSheetItem("收藏", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            })
                    .addSheetItem("查看聊天图片", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {

                                }
                            }).show();

        } else if (i == R.id.btn3) {
            new ActionSheetDialog(this)
                    .builder()
                    .setTitle("请选择操作")
                    .setCancelable(false)
                    .setCanceledOnTouchOutside(false)
                    .addSheetItem("条目一", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目二", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目三", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目四", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目五", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目六", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目七", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目八", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目九", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            })
                    .addSheetItem("条目十", SheetItemColor.Blue,
                            new OnSheetItemClickListener() {
                                @Override
                                public void onClick(int which) {
                                    Toast.makeText(MainActivity.this,
                                            "item" + which, Toast.LENGTH_SHORT)
                                            .show();
                                }
                            }).show();

        } else if (i == R.id.btn4) {
            new AlertDialog(MainActivity.this).builder().setTitle("退出当前账号")
                    .setMsg("再连续登陆15天，就可变身为QQ达人。退出QQ可能会使你现有记录归零，确定退出？")
                    .setPositiveButton("确认退出", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    }).setNegativeButton("取消", new OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            }).show();

        } else if (i == R.id.btn5) {
            new AlertDialog(MainActivity.this).builder()
                    .setMsg("你现在无法接收到新消息提醒。请到系统-设置-通知中开启消息提醒")
                    .setNegativeButton("确定", new OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    }).show();

        } else {
        }
    }
}
