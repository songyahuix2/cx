package jdbc.jdbc03.work02.entity;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:24 PM
 */
public class Customer {
        private int userId;//用户id
        private String userName;//用户名
        public Customer(){

        }

        public Customer(int userId, String userName) {
            this.userId = userId;
            this.userName = userName;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "userId=" + userId +
                    ", userName='" + userName + '\'' +
                    '}';
        }
    }
