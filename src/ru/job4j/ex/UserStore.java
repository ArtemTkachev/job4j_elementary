package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUserName().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found in userArray");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUserName().length() >= 3) {
            return true;
        } else {
            throw new UserInvalidException("User Invalid");
        }
    }

    public static void main(String[] args) {
        try {
            User[] users = new User[]{
                    new User("Artem", true)
            };
            User user = findUser(users, "Artem");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException ufe) {
            ufe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}