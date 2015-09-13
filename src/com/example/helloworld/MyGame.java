package com.example.helloworld;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Stage stage;//舞台类的对象
	Image image;//演员.Image类
	Texture texture;//纹理,暂时理解成图片资源的容器
	
	
	@Override
	public void create() {
		/**
		 * 这三个参数的分别是:
		 * width:舞台的宽
		 * height:舞台的高
		 * keppAspectRatio:舞台是否要铺满整个屏幕。
		 * 如果这个值是ture的话，舞台的尺寸就是你设置的大        小。如果是false的话，就铺满屏幕。
		 * 
		 */
		stage = new Stage(480, 800, false);//实例化一个舞台类
		
		
		texture = new Texture(Gdx.files.internal("data/test.jpg"));
		
		image = new Image(texture);
		
		stage.addActor(image);
		
		Gdx.input.setInputProcessor(stage);//用stage来处理输入事件
		
	}

	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		
		//先记住这种写法
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}
	
}
