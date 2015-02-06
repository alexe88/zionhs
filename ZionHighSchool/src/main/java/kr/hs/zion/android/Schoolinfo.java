/*
 * Zion High School Application for Android
 * Copyright (C) 2013-2015 The Zion High School Application for Android Open Source Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package kr.hs.zion.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import kr.hs.zion.android.R;

public class Schoolinfo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolinfo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View maps_card = findViewById(R.id.maps_card);
        TextView homepage = (TextView)findViewById(R.id.homepage);

        maps_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent src = new Intent(Intent.ACTION_VIEW);
                src.setData(Uri.parse(
                        "https://www.google.com/maps/preview#!q=%EC%8B%9C%EC%98%A8%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90&data=!4m15!2m14!1m13!1s0x357b631fc929cead%3A0x3ebc17cda0be11bd!3m8!1m3!1d32737846!2d-95.677068!3d37.0625!3m2!1i1920!2i964!4f13.1!4m2!3d37.470904!4d126.805683"
                ));
                startActivity(src);
            }
        });

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent src = new Intent(Intent.ACTION_VIEW);
                src.setData(Uri.parse(
                        "http://zion.hs.kr"
                ));
                startActivity(src);
            }
        });

    }





}
