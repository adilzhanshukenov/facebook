package fbDiagrams;

import facebook.x.model.Comment;
import facebook.x.model.Group;
import facebook.x.model.Like;
import facebook.x.model.Login;
import facebook.x.model.Message;
import facebook.x.model.Post;
import facebook.x.model.Profile;
import facebook.x.model.User;
import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;



public class FacebookDiagram extends ClassDiagram {
	
	@Row({Profile.class, User.class, Group.class})
	@Row({Message.class, Post.class, Login.class, Like.class, Comment.class})
	@Column({User.class, Login.class})
	class FacebookLayout extends Layout {}
	
}
