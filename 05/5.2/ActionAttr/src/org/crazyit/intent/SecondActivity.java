/**
 * 
 */
package org.crazyit.intent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class SecondActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		EditText show = (EditText)findViewById(R.id.show);
		//获取该Activity对应的Intent的Action属性
		String action = getIntent().getAction();
		//显示Action属性
		show.setText("Action为：" + action);
	}
}
