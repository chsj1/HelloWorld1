package com.example.helloworld;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Stage stage;//��̨��Ķ���
	Image image;//��Ա.Image��
	Texture texture;//����,��ʱ����ͼƬ��Դ������
	
	
	@Override
	public void create() {
		/**
		 * �����������ķֱ���:
		 * width:��̨�Ŀ�
		 * height:��̨�ĸ�
		 * keppAspectRatio:��̨�Ƿ�Ҫ����������Ļ��
		 * ������ֵ��ture�Ļ�����̨�ĳߴ���������õĴ�        С�������false�Ļ�����������Ļ��
		 * 
		 */
		stage = new Stage(480, 800, false);//ʵ����һ����̨��
		
		
		texture = new Texture(Gdx.files.internal("data/test.jpg"));
		
		image = new Image(texture);
		
		stage.addActor(image);
		
		Gdx.input.setInputProcessor(stage);//��stage�����������¼�
		
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
		
		//�ȼ�ס����д��
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
