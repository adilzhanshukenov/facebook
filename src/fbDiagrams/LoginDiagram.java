package fbDiagrams;

import facebook.x.model.Login;
import facebook.x.model.Login.Enter_username_pass;
import facebook.x.model.Login.Init;
import facebook.x.model.Login.Login_failed;
import facebook.x.model.Login.Login_success;
import facebook.x.model.Login.Success;

import facebook.x.model.Login.User_authorize;
import facebook.x.model.Login.Valid_or_not;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;

public class LoginDiagram extends StateMachineDiagram<Login> {
	@Row({Init.class, User_authorize.class, Enter_username_pass.class, Valid_or_not.class, Login_failed.class})
	@Column({Valid_or_not.class, Login_success.class, Success.class})
	
	class LoginD extends Layout {}
}
