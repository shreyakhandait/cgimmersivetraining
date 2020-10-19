package demo;

public class Login {
	int login(email, password) {
		iny code = 0;
		User user = getUser(email);
		if(user != null) {
			String plainPassword = decryptPassword(user.getPassword())
					if(password.equals(plainPassword)) {
						code = 1;
						if(!containsNumbers(password)) {
							return 3;
						}
		}else {
			code = 2;
		}
		}
		String plainPassword = decryptPassword(user.getPassword())
				if(password.equals(plainPassword)) {
					code = 1;
					
				}
		return code;
	}

}

