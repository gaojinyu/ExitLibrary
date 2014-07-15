package com.haydar.exitlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.haydar.exitliberary.R;


/**
 * 退出布局
 * 
 * @author gjy
 */
public class ExitPopWindow extends RelativeLayout implements OnClickListener{
	private LinearLayout libraryCancleLayout,libraryOkLayout;
	public ExitPopWindow(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.exitlibrary_layout, this);
		libraryCancleLayout=(LinearLayout)findViewById(R.id.exitlibrary_cancel_layout);
		libraryOkLayout=(LinearLayout)findViewById(R.id.exitlibrary_ok_layout);
		libraryCancleLayout.setOnClickListener(this);
		libraryOkLayout.setOnClickListener(this);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK
				&& event.getAction() == KeyEvent.ACTION_DOWN) {

			if (this.getVisibility() == View.GONE) {
				this.setVisibility(View.VISIBLE);
			} else {
				this.setVisibility(View.GONE);
			}

		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.exitlibrary_cancel_layout){
			this.setVisibility(View.GONE);
		}else{
			System.exit(0);
		}
	}

}
