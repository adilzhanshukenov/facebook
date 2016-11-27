package facebookmain;

import java.io.IOException;

import facebook.x.model.Click;
import facebook.x.model.Login;
import facebook.x.model.PressEnter;
import facebook.x.model.Successfull;
import facebook.x.model.Unsuccessfull;
import facebook.x.model.Wait;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;


public class MainFb {
	static Login login;

	static void init() {
		login = Action.create(Login.class);
		Action.start(login);
	}

	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(MainFb::init);
		System.in.read();
		Action.send(new Click(), login);
		System.in.read();
		Action.send(new PressEnter(), login);
		System.in.read();
		Action.send(new Unsuccessfull(), login);
		System.in.read();
		Action.send(new Wait(), login);
		System.in.read();
		Action.send(new PressEnter(), login);
		System.in.read();
		Action.send(new Successfull(), login);
		System.in.read();
		Action.send(new Successfull(), login);
	}
}
