package PriorityQueue;

import java.util.*;

public class Test355_Design_Twitter {
    class Twitter {
        HashMap<Integer, User> users;
        private int tweetTimeStamp = 0;

        public Twitter() {
            users = new HashMap<>();
        }
        public void postTweet(int userId, int tweetId) {
            if (!users.containsKey(userId)) {
                User user = new User(userId);
                users.put(userId, user);
            }
            users.get(userId).post(tweetId, ++tweetTimeStamp);
        }
        public List<Integer> getNewsFeed(int userId){
            ArrayList<Integer> list = new ArrayList<>();

            if (users.get(userId) == null) {
                return list;
            }
            ArrayList<Integer> follows = new ArrayList<>(users.get(userId).getFollows());

            PriorityQueue<Tweet> queue = new PriorityQueue<>(users.size(), (o1, o2) -> o2.getTime() - o1.getTime());
            for (int follow:follows) {
                for (Tweet tweet :users.get(follow).getTweets()) {
                    queue.offer(tweet);
                }
            }
            int count = 0;
            while(!queue.isEmpty() && count < 10) {
                list.add(queue.poll().getTweet());
                ++count;
            }
            return list;

        }
        public void follow(int followerId, int followeeId){
            if (!users.containsKey(followeeId)) {
                User user = new User(followeeId);
                users.put(followeeId, user);
            }
            if (!users.containsKey(followerId)) {
                User user = new User(followerId);
                users.put(followerId, user);
            }
            users.get(followerId).follow(followeeId);
        }
        public void unfollow(int followerId, int followeeId){
            if (!users.containsKey(followerId) || followerId == followeeId) {
                return;
            }
            users.get(followerId).unfollow(followeeId);
        }
    }
    class Tweet {
        int tweet;
        int time;

        public Tweet(int tweet, int time) {
            this.tweet = tweet;
            this.time = time;
        }

        public int getTweet() {
            return tweet;
        }

        public int getTime() {
            return time;
        }
    }
    class User {
        int id;
        HashSet<Integer> follows;
        Deque<Tweet> tweets;

        public User(int id) {
            this.id = id;
            this.follows = new HashSet<>();
            this.follows.add(id);
            this.tweets = new ArrayDeque<>();
        }

        public int getId() {
            return id;
        }

        public HashSet<Integer> getFollows() {
            return follows;
        }

        public Deque<Tweet> getTweets() {
            return tweets;
        }
        public void follow(int follow) {
            this.follows.add(follow);
        }
        public void unfollow(int id) {
            this.follows.remove(id);
        }
        public void post(int tweet, int count) {
            Tweet temp = new Tweet(tweet, count);
            this.tweets.addFirst(temp);

            if (tweets.size() > 10) {
                this.tweets.removeLast();
            }
        }
    }
}
